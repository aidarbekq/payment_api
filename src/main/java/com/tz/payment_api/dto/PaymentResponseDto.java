package com.tz.payment_api.dto;

import com.tz.payment_api.enums.PaymentStatus;
import com.tz.payment_api.model.Payment;

import java.math.BigDecimal;

public class PaymentResponseDto {
    private Long id;
    private String senderAccount;
    private String recipientAccount;
    private BigDecimal amount;
    private PaymentStatus status;
    private Long uslugaId;


    public PaymentResponseDto() {}

    public PaymentResponseDto(Long id, String senderAccount,
                              String recipientAccount,
                              BigDecimal amount, PaymentStatus status, Long uslugaId) {
        this.id = id;
        this.senderAccount = senderAccount;
        this.recipientAccount = recipientAccount;
        this.amount = amount;
        this.status = status;
        this.uslugaId = uslugaId;
    }

    public static PaymentResponseDto fromPayment(Payment payment) {
        return new PaymentResponseDto(
                payment.getId(),
                payment.getSenderAccount(),
                payment.getRecipientAccount(),
                payment.getAmount(),
                payment.getStatus(),
                payment.getUslugaId()
        );
    }


    public Long getUslugaId() {
        return uslugaId;
    }

    public void setUslugaId(Long uslugaId) {
        this.uslugaId = uslugaId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getRecipientAccount() {
        return recipientAccount;
    }

    public void setRecipientAccount(String recipientAccount) {
        this.recipientAccount = recipientAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
