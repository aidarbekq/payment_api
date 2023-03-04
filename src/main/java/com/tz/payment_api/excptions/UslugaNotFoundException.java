package com.tz.payment_api.excptions;

public class UslugaNotFoundException extends RuntimeException {

    public UslugaNotFoundException(Long id) {
        super("Could not find usluga with id: " + id);
    }
}
