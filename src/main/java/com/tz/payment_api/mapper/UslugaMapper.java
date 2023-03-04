package com.tz.payment_api.mapper;

import com.tz.payment_api.dto.UslugaDto;
import com.tz.payment_api.model.Usluga;
import org.mapstruct.Mapper;
import java.util.List;

@Mapper(componentModel = "spring")

public interface UslugaMapper {
    UslugaDto toUslugaDto(Usluga usluga);

    Usluga toUsluga(UslugaDto uslugaDto);
    List<UslugaDto> toUslugaDtoList(List<Usluga> uslugi);

}
