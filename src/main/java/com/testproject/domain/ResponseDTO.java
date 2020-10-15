package com.testproject.domain;

public class ResponseDTO {
    private final String responseCode;
    private final String responseTime;

    public ResponseDTO(String responseCode, String responseTime) {
        this.responseCode = responseCode;
        this.responseTime = responseTime;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseTime() {
        return responseTime;
    }
}
