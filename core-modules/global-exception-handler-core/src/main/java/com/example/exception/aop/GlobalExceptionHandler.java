package com.example.exception.aop;

import com.example.common.support.exception.response.ApiResponseError;
import com.example.common.support.exception.CustomException;
import com.example.common.support.exception.ErrorCode;
import com.example.common.support.exception.status2xx.NoContentException;
import com.example.common.utils.exception.ExceptionUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.List;

@RestControllerAdvice
@RequiredArgsConstructor
@Slf4j
public final class GlobalExceptionHandler {

    /**
     * 다른 핸들러에서 처리하지 않은 커스텀 익셉션에 대한 핸들링
     * */
    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ApiResponseError> handleCustomException(CustomException exception) {
        log.info(STR."""
                API Exception
                \{ ExceptionUtils.getStackTrace(exception)}
                """);
        ErrorCode errorCode = exception.getErrorCode();
        HttpStatus httpStatus = errorCode.defaultHttpStatus();

        ApiResponseError response = ApiResponseError.of(exception);

        return ResponseEntity.status(httpStatus).body(response);
    }

    /**
     * (주로 API Request Body) validation 제공 애노테이션 등에서 필터링된 유효성 예외를 최종적으로 이곳에서 처리함.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponseError> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException exception) {
        log.info(STR."""
                400 BAD REQUEST
                \{ ExceptionUtils.getStackTrace(exception)}
                """);

        FieldError fieldError = exception.getBindingResult().getFieldError();

        ApiResponseError response = ApiResponseError.builder()
                .name(exception.getBody().getTitle())
                .message(
                        fieldError == null ? exception.getMessage() : fieldError.getDefaultMessage()
                )
                .status(exception.getStatusCode().value())
                .timestamp(Instant.now())
                .cause(List.of(ApiResponseError.platCauseAsSubErrors(exception.getCause())))
                .build();

        return new ResponseEntity<>(response, exception.getStatusCode());
    }

    /**
     * 204 No Content
     */
    @ExceptionHandler(NoContentException.class)
    public ResponseEntity<Void> handleNoContentException(NoContentException exception) {
        log.debug(STR."""
                [204 No Content]
                \{ ExceptionUtils.getStackTrace(exception)}
                """);
        return ResponseEntity.noContent().build();
    }
}