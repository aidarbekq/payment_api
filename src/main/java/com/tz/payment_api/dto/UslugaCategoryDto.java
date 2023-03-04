package com.tz.payment_api.dto;

import com.tz.payment_api.model.UslugaCategory;

import java.util.List;

public class UslugaCategoryDto {
    private Long id;
    private String name;
    private UslugaCategory parent_id;
    private List<UslugaDto> uslugi;

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

    public List<UslugaDto> getUslugi() {
        return uslugi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUslugi(List<UslugaDto> uslugi) {
        this.uslugi = uslugi;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UslugaCategoryDto() {}

    public UslugaCategoryDto(Long id, String name, UslugaCategory parent_id, List<UslugaDto> uslugi) {
        this.id = id;
        this.name = name;
        this.parent_id = parent_id;
        this.uslugi = uslugi;
    }
}

