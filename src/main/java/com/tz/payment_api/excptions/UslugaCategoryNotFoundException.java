package com.tz.payment_api.excptions;

public class UslugaCategoryNotFoundException extends RuntimeException {
    public UslugaCategoryNotFoundException(Long id) {
        super("Usluga category with id " + id + " not found.");
    }
}

