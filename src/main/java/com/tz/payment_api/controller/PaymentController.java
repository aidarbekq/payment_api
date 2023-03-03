package com.tz.payment_api.controller;

import com.tz.payment_api.dto.PaymentRequestDto;
import com.tz.payment_api.dto.PaymentResponseDto;
import com.tz.payment_api.excptions.PaymentNotFoundException;
import com.tz.payment_api.model.Payment;
import com.tz.payment_api.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create")
    public ResponseEntity<PaymentResponseDto> createPayment(@RequestBody PaymentRequestDto paymentRequestDto) {
        Payment payment = paymentService.createPayment(paymentRequestDto);
        PaymentResponseDto paymentResponseDto = PaymentResponseDto.fromPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).body(paymentResponseDto);
    }


    @PostMapping("/{id}/confirm")
    public ResponseEntity<PaymentResponseDto> confirmPayment(@PathVariable Long id) throws PaymentNotFoundException {
        Payment payment = paymentService.confirmPayment(id);
        PaymentResponseDto paymentResponseDto = PaymentResponseDto.fromPayment(payment);
        return ResponseEntity.ok(paymentResponseDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentResponseDto> getPaymentStatus(@PathVariable Long id) throws PaymentNotFoundException {
        Payment payment = paymentService.getPaymentById(id);
        PaymentResponseDto paymentResponseDto = PaymentResponseDto.fromPayment(payment);
        return ResponseEntity.ok(paymentResponseDto);
    }

    @PostMapping("/{id}/cancel")
    public ResponseEntity<PaymentResponseDto> cancelPayment(@PathVariable Long id) throws PaymentNotFoundException {
        Payment payment = paymentService.cancelPayment(id);
        PaymentResponseDto paymentResponseDto = PaymentResponseDto.fromPayment(payment);
        return ResponseEntity.ok(paymentResponseDto);
    }
}
