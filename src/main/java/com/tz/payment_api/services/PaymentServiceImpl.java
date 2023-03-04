package com.tz.payment_api.services;

import com.tz.payment_api.dto.PaymentRequestDto;
import com.tz.payment_api.enums.PaymentStatus;
import com.tz.payment_api.excptions.PaymentNotFoundException;
import com.tz.payment_api.excptions.PaymentProcessingException;
import com.tz.payment_api.excptions.UslugaNotFoundException;
import com.tz.payment_api.model.Payment;
import com.tz.payment_api.model.Usluga;
import com.tz.payment_api.repository.PaymentRepository;
import com.tz.payment_api.repository.UslugaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final UslugaRepository uslugaRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository,UslugaRepository uslugaRepository) {
        this.paymentRepository = paymentRepository;
        this.uslugaRepository = uslugaRepository;
    }

    @Override
    public boolean canPaymentBeProcessed(Long uslugaId, BigDecimal amount) {
        Usluga usluga = uslugaRepository.findById(uslugaId)
                .orElseThrow(() -> new UslugaNotFoundException(uslugaId));
        return amount.compareTo(usluga.getMinAmount()) >= 0;
    }

    @Override
    public Payment createPayment(PaymentRequestDto paymentRequestDto) {
        System.out.println(paymentRequestDto.getUslugaId());
        Usluga usluga = uslugaRepository.findById(paymentRequestDto.getUslugaId())
                .orElseThrow(() -> new UslugaNotFoundException(paymentRequestDto.getUslugaId()));
        System.out.println(usluga);
        if (!canPaymentBeProcessed(usluga.getId(), paymentRequestDto.getAmount())) {
            throw new PaymentProcessingException("Payment cannot be processed for this usluga");
        }
        Payment payment = new Payment();
        payment.setSenderAccount(paymentRequestDto.getSenderAccount());
        payment.setAmount(paymentRequestDto.getAmount());
        payment.setStatus(PaymentStatus.PROCESSING);
        payment.setUslugaId(usluga.getId());
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

