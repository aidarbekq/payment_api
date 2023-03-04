package com.tz.payment_api.dto;

import java.math.BigDecimal;

public class PaymentRequestDto {

    private String senderAccount;
    private BigDecimal amount;
    private Long uslugaId;

    public PaymentRequestDto() {}

    public PaymentRequestDto(String senderAccount, BigDecimal amount, Long uslugaId) {
        this.senderAccount = senderAccount;
        this.amount = amount;
        this.uslugaId = uslugaId;
    }

    public Long getUslugaId() {
        return uslugaId;
    }

    public void setUslugaId(Long uslugaId) {
        this.uslugaId = uslugaId;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}

