package com.tz.payment_api.services;

import com.tz.payment_api.dto.PaymentRequestDto;
import com.tz.payment_api.model.Payment;

import java.math.BigDecimal;

public interface PaymentService {

    Payment createPayment(PaymentRequestDto paymentRequestDto);

    boolean canPaymentBeProcessed(Long id, BigDecimal amount);


    Payment getPaymentById(Long id);

    Payment confirmPayment(Long id);

    Payment cancelPayment(Long id);
}
