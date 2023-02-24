package com.tz.payment_api.excptions;

public class PaymentNotFoundException extends RuntimeException{
    public PaymentNotFoundException(Long id) {
        super("Payment with id: " + id + " not found");
    }
}
