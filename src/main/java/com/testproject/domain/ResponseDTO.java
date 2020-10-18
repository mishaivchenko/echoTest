package com.testproject.domain;

public class ResponseDTO {

    private final String hostname;
    private final String responseCode;
    private final String responseTime;


    public ResponseDTO(String responseCode, String responseTime, String hostname) {
        this.responseCode = responseCode;
        this.responseTime = responseTime;
        this.hostname = hostname;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public String getHostname() {
        return hostname;
    }

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "hostname='" + hostname + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", responseTime='" + responseTime + '\'' +
                '}';
    }
}

