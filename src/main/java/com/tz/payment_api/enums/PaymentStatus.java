package com.tz.payment_api.enums;

public enum PaymentStatus {
    PROCESSING("Processing"),
    CONFIRMED("Processing"),
    CANCELED("Canceled");

    private String status;

    PaymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
