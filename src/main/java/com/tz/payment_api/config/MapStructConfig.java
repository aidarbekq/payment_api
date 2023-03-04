package com.tz.payment_api.config;

import com.tz.payment_api.mapper.UslugaCategoryMapper;
import com.tz.payment_api.mapper.UslugaMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapStructConfig {

    @Bean
    @Qualifier("uslugaMapper")
    public UslugaMapper uslugaMapper() {
        return Mappers.getMapper(UslugaMapper.class);
    }
    @Bean
    @Qualifier("uslugaCategoryMapper")
    public UslugaCategoryMapper uslugaCategoryMapper() {
        return Mappers.getMapper(UslugaCategoryMapper.class);
    }
}