package com.tz.payment_api.services;

import com.tz.payment_api.dto.PaymentRequestDto;
import com.tz.payment_api.model.Payment;

public interface PaymentService {

    Payment createPayment(PaymentRequestDto paymentRequestDto);


    Payment getPaymentById(Long id);

    Payment confirmPayment(Long id);

    Payment cancelPayment(Long id);
}
