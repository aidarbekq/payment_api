package com.tz.payment_api.model;

import jakarta.persistence.*;

import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

@Entity
@Table(name = "uslugi")
public class Usluga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "min_amount")
    private BigDecimal minAmount;

    @Pattern(regexp = "\\d{10}")
    @Column(name = "requisite_mask")
    private String requisiteMask;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private UslugaCategory category;


    public Usluga(String name, String description, BigDecimal minAmount,
                  String requisiteMask, UslugaCategory category) {
        this.name = name;
        this.description = description;
        this.minAmount = minAmount;
        this.requisiteMask = requisiteMask;
        this.category = category;
    }
    public Usluga() {
    }


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

    public UslugaCategory getCategory() {
        return category;
    }

    public String getRequisiteMask() {
        return requisiteMask;
    }
}

