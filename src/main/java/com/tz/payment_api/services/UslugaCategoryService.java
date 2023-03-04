package com.tz.payment_api.services;

import com.tz.payment_api.dto.UslugaCategoryDto;

import java.util.List;


public interface UslugaCategoryService {

    List<UslugaCategoryDto> getAllCategories();

    UslugaCategoryDto getCategoryById(Long id);

}
