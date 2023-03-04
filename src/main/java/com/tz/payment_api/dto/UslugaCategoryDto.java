package com.tz.payment_api.dto;

import com.tz.payment_api.model.UslugaCategory;

import java.util.List;

public class UslugaCategoryDto {
    private Long id;
    private String name;
    private UslugaCategory parent_id;

    public String getName() {
        return name;
    }


    public UslugaCategory getParent_id() {
        return parent_id;
    }

    public void setParent_id(UslugaCategory parent_id) {
        this.parent_id = parent_id;
    }

    public Long getId() {
        return id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UslugaCategoryDto() {}

    public UslugaCategoryDto(Long id, String name, UslugaCategory parent_id) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
    }
}

