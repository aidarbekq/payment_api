package com.tz.payment_api.dto;

import com.tz.payment_api.model.UslugaCategory;
import com.tz.payment_api.services.UslugaCategoryServiceImpl;

import java.math.BigDecimal;

public class UslugaDto {
    private Long id;
    private String name;
    private String description;
    private BigDecimal minAmount;
    private String requisiteMask;
    private UslugaCategoryDto category;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public UslugaCategoryDto getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public void setCategory(UslugaCategoryDto category) {
        this.category = category;
    }

    public String getRequisiteMask() {
        return requisiteMask;
    }

    public void setRequisiteMask(String requisiteMask) {
        this.requisiteMask = requisiteMask;
    }

    public UslugaDto() {}

    public UslugaDto(Long id, String name, String description, BigDecimal minAmount,
                     String requisiteMask, UslugaCategoryDto category) {
        this.id = id;
        this.name = name;
        this.requisiteMask = requisiteMask;
        this.description = description;
        this.minAmount = minAmount;
        this.category = category;
    }
}

