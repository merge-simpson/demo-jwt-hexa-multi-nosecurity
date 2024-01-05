package com.example.common.support.exception;

import org.springframework.http.HttpStatus;

public interface ErrorCode { // public enum ClassifiedErrorCode implements ErrorCode { … }
    // enum 클래스가 공통으로 갖는 name() 메서드는 에러 코드 관리에 유용하기 때문에 포함.
    // enum 클래스가 공통으로 갖는 ordinal() 메서드는 에러 코드와 무관하기 때문에 제외.
    String name();
    String defaultMessage();
    HttpStatus defaultHttpStatus();
    RuntimeException defaultException();
    RuntimeException defaultException(Throwable cause);
}
