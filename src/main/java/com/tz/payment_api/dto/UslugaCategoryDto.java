package com.tz.payment_api.dto;

import com.tz.payment_api.model.UslugaCategory;

import java.util.List;

public class UslugaCategoryDto {
    private Long id;
    private String name;
    private UslugaCategoryDto parent_id;

    public String getName() {
        return name;
    }


    public UslugaCategoryDto getParent_id() {
        return parent_id;
    }

    public void setParent_id(UslugaCategoryDto parent_id) {
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

    public UslugaCategoryDto(Long id, String name, UslugaCategoryDto parent_id) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
    }
}

