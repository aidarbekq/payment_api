package com.tz.payment_api.mapper;

import com.tz.payment_api.dto.UslugaCategoryDto;
import com.tz.payment_api.model.UslugaCategory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UslugaCategoryMapper {

    UslugaCategoryDto toUslugaCategoryDto(UslugaCategory category);

    UslugaCategory toUslugaCategory(UslugaCategoryDto uslugaCategoryDto);
    List<UslugaCategoryDto> toUslugaCategoryDTOList(List<UslugaCategory> categories);


}
