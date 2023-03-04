package com.tz.payment_api.services;

import com.tz.payment_api.dto.UslugaCategoryDto;
import com.tz.payment_api.dto.UslugaDto;
import com.tz.payment_api.model.UslugaCategory;

import java.util.List;

public interface UslugaService {

    List<UslugaDto> getAllUslugi();

    UslugaDto getUslugaById(Long id);

    List<UslugaDto> getUslugiByCategory(UslugaCategoryDto category);

}