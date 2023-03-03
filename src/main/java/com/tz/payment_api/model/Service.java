package com.tz.payment_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "min_amount")
    private BigDecimal minAmount;

    @Column(name = "req_mask")
    private String requisiteMask;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private ServiceCategory category;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public ServiceCategory getCategory() {
        return category;
    }

    public String getRequisiteMask() {
        return requisiteMask;
    }
}

