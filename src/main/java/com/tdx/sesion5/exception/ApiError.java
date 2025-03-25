package com.tdx.sesion5.exception;

import java.time.LocalDateTime;

public class ApiError {
    private String code;
    private String message;
    private LocalDateTime timestamp;

    public ApiError(String code, String message){
        this.code=code;
        this.message=message;
        this.timestamp=LocalDateTime.now();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
