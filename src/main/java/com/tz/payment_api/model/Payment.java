package com.tz.payment_api.model;

import com.tz.payment_api.enums.PaymentStatus;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sender_account")
    private String senderAccount;

    @Column(name = "recipient_account")
    private String recipientAccount;

    @Column(name = "amount")
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PaymentStatus status;
    public Long getId() {
        return id;
    }
    public String getSenderAccount() {
        return senderAccount;
    }
    public String getRecipientAccount() {
        return recipientAccount;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public PaymentStatus getStatus() {
        return status;
    }
}
