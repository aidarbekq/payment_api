package com.tz.payment_api.services;

import com.tz.payment_api.dto.UslugaCategoryDto;
import com.tz.payment_api.excptions.UslugaCategoryNotFoundException;
import com.tz.payment_api.mapper.UslugaCategoryMapper;
import com.tz.payment_api.model.UslugaCategory;
import com.tz.payment_api.repository.UslugaCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UslugaCategoryServiceImpl implements UslugaCategoryService {

    private final UslugaCategoryRepository uslugaCategoryRepository;
    @Qualifier("uslugaCategoryMapper")
    private final UslugaCategoryMapper uslugaCategoryMapper;

    @Autowired
    public UslugaCategoryServiceImpl(UslugaCategoryRepository uslugaCategoryRepository,
                                     UslugaCategoryMapper uslugaCategoryMapper) {
        this.uslugaCategoryRepository = uslugaCategoryRepository;
        this.uslugaCategoryMapper = uslugaCategoryMapper;
    }

    @Override
    public List<UslugaCategoryDto> getAllCategories() {
        List<UslugaCategory> categories = uslugaCategoryRepository.findAll();
        return uslugaCategoryMapper.toUslugaCategoryDTOList(categories);
    }

    @Override
    public UslugaCategoryDto getCategoryById(Long id) {
        UslugaCategory category = uslugaCategoryRepository.findById(id)
                .orElseThrow(() -> new UslugaCategoryNotFoundException(id));
        return uslugaCategoryMapper.toUslugaCategoryDto(category);
    }
}