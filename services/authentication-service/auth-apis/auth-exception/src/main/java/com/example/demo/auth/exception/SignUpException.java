package com.example.demo.auth.exception;

import com.example.common.support.exception.CustomException;
import com.example.common.support.exception.ErrorCode;

public class SignUpException extends CustomException {
    public SignUpException() {
        super();
    }

    public SignUpException(String message) {
        super(message);
    }

    public SignUpException(String message, Throwable cause) {
        super(message, cause);
    }

    public SignUpException(ErrorCode errorCode) {
        super(errorCode);
    }

    public SignUpException(ErrorCode errorCode, Throwable cause) {
        super(errorCode, cause);
    }
}
