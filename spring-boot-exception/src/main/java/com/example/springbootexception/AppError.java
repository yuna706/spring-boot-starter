package com.example.springbootexception;

/**
 * AppError.java
 * Class 설명을 작성하세요.
 *
 * @author 이유나
 * @since 2023.04.19
 */
public class AppError {
    private String message;
    private String reason;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
