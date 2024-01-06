package com.example.demo.auth.exception;

import com.example.common.support.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum SignUpErrorCode implements ErrorCode {
    USERNAME_ALREADY_EXISTS("이미 사용 중인 사용자 이름(계정)입니다.", HttpStatus.CONFLICT),
    NICKNAME_ALREADY_EXISTS("이미 사용 중인 닉네임입니다.", HttpStatus.CONFLICT),
    SERVICE_UNAVAILABLE("서버가 일시적으로 회원가입을 차단한 상태입니다. 나중에 다시 시도하십시오.",
            HttpStatus.SERVICE_UNAVAILABLE),
    DEFAULT("회원가입 중 오류가 발생하였습니다. 이 현상이 지속되면 고객센터에 문의 바랍니다.", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String message;
    private final HttpStatus status;

    @Override
    public String defaultMessage() {
        return message;
    }

    @Override
    public HttpStatus defaultHttpStatus() {
        return status;
    }

    @Override
    public SignUpException defaultException() {
        return new SignUpException(this);
    }

    @Override
    public SignUpException defaultException(Throwable cause) {
        return new SignUpException(this, cause);
    }
}
