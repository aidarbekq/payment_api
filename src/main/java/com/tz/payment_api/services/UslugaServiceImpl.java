package com.tz.payment_api.services;

import com.tz.payment_api.dto.UslugaCategoryDto;
import com.tz.payment_api.dto.UslugaDto;
import com.tz.payment_api.excptions.UslugaNotFoundException;
import com.tz.payment_api.mapper.UslugaCategoryMapper;
import com.tz.payment_api.mapper.UslugaMapper;
import com.tz.payment_api.model.Usluga;
import com.tz.payment_api.model.UslugaCategory;
import com.tz.payment_api.repository.UslugaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UslugaServiceImpl implements UslugaService {

    private final UslugaRepository uslugaRepository;

    @Qualifier("uslugaMapper")
    private final UslugaMapper uslugaMapper;

    @Qualifier("uslugaCategoryMapper")
    private final UslugaCategoryMapper uslugaCategoryMapper;


    @Autowired
    public UslugaServiceImpl(UslugaRepository uslugaRepository, UslugaMapper uslugaMapper,
                             UslugaCategoryMapper uslugaCategoryMapper) {
        this.uslugaRepository = uslugaRepository;
        this.uslugaMapper = uslugaMapper;
        this.uslugaCategoryMapper = uslugaCategoryMapper;
    }

    @Override
    public List<UslugaDto> getAllUslugi() {
        List<Usluga> uslugi = uslugaRepository.findAll();
        return uslugaMapper.toUslugaDtoList(uslugi);
    }

    @Override
    public UslugaDto getUslugaById(Long id) {
        Usluga usluga = uslugaRepository.findById(id)
                .orElseThrow(() -> new UslugaNotFoundException(id));
        return uslugaMapper.toUslugaDto(usluga);
    }

    @Override
    public List<UslugaDto> getUslugiByCategory(UslugaCategoryDto uslugaCategoryDto) {
        UslugaCategory category = uslugaCategoryMapper.toUslugaCategory(uslugaCategoryDto);
        List<Usluga> uslugi = uslugaRepository.findByCategory(category);
        return uslugaMapper.toUslugaDtoList(uslugi);
    }
}

