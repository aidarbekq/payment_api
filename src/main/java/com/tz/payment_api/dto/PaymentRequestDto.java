package com.tz.payment_api.dto;

import java.math.BigDecimal;

public class PaymentRequestDto {

    private String senderAccount;
    private String recipientAccount;
    private BigDecimal amount;

    public PaymentRequestDto() {}

    public PaymentRequestDto(String senderAccount, String recipientAccount, BigDecimal amount) {
        this.senderAccount = senderAccount;
        this.recipientAccount = recipientAccount;
        this.amount = amount;
    }

    public String getRecipientAccount() {
        return recipientAccount;
    }

    public void setSenderAccount(String senderAccount) {
        this.senderAccount = senderAccount;
    }

    public String getSenderAccount() {
        return senderAccount;
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
}

