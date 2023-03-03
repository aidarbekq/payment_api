package com.tz.payment_api.services;

import com.tz.payment_api.dto.PaymentRequestDto;
import com.tz.payment_api.enums.PaymentStatus;
import com.tz.payment_api.excptions.PaymentNotFoundException;
import com.tz.payment_api.model.Payment;
import com.tz.payment_api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment createPayment(PaymentRequestDto paymentRequestDto) {
        Payment payment = new Payment();
        payment.setSenderAccount(paymentRequestDto.getSenderAccount());
        payment.setRecipientAccount(paymentRequestDto.getRecipientAccount());
        payment.setAmount(paymentRequestDto.getAmount());
        payment.setStatus(PaymentStatus.PROCESSING);
        return paymentRepository.save(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new PaymentNotFoundException(id));
    }

    @Override
    public Payment confirmPayment(Long id) {
        Payment payment = getPaymentById(id);
        payment.setStatus(PaymentStatus.CONFIRMED);
        return paymentRepository.save(payment);
    }

    @Override
    public Payment cancelPayment(Long id) {
        Payment payment = getPaymentById(id);
        payment.setStatus(PaymentStatus.CANCELED);
        return paymentRepository.save(payment);
    }
}

