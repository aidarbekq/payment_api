package com.tz.payment_api.model;

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


}
