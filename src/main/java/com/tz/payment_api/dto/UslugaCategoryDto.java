package com.tz.payment_api.dto;

public class UslugaCategoryDto {
    private Long id;
    private String name;
    private UslugaCategoryDto parentCategory;

    public String getName() {
        return name;
    }

    public UslugaCategoryDto getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(UslugaCategoryDto parentCategory) {
        this.parentCategory = parentCategory;
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

    public UslugaCategoryDto(Long id, String name, UslugaCategoryDto parentCategory) {
        this.id = id;
        this.name = name;
        this.parentCategory = parentCategory;
    }
}

