package com.tz.payment_api.services;

import com.tz.payment_api.model.Usluga;
import com.tz.payment_api.model.UslugaCategory;
import com.tz.payment_api.repository.UslugaCategoryRepository;
import com.tz.payment_api.repository.UslugaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DataInitializationService {

    private final UslugaCategoryRepository uslugaCategoryRepository;
    private final UslugaRepository uslugaRepository;

    @Autowired
    public DataInitializationService(UslugaCategoryRepository uslugaCategoryRepository, UslugaRepository uslugaRepository) {
        this.uslugaCategoryRepository = uslugaCategoryRepository;
        this.uslugaRepository = uslugaRepository;
    }

    @PostConstruct
    public void init() {

        UslugaCategory allCategory = new UslugaCategory("Все", null);
        UslugaCategory callsCategory = new UslugaCategory("Звонки", allCategory);
        UslugaCategory internetCategory = new UslugaCategory("Интернет", allCategory);
        UslugaCategory entertainmentCategory = new UslugaCategory("Развлечения", allCategory);
        UslugaCategory cinemaCategory = new UslugaCategory("Кино", entertainmentCategory);
        UslugaCategory gamesCategory = new UslugaCategory("Игры", entertainmentCategory);
        UslugaCategory roamingCategory = new UslugaCategory("Роуминг", allCategory);

        uslugaCategoryRepository.save(allCategory);
        uslugaCategoryRepository.save(callsCategory);
        uslugaCategoryRepository.save(internetCategory);
        uslugaCategoryRepository.save(entertainmentCategory);
        uslugaCategoryRepository.save(cinemaCategory);
        uslugaCategoryRepository.save(gamesCategory);
        uslugaCategoryRepository.save(roamingCategory);

        Usluga callPackage60 = new Usluga("Пакет 60 минут", "new ser", new BigDecimal(200),
                "12335647", callsCategory);
//        Usluga callBlackList = new Usluga("Черный список", "black list fun",callsCategory, BigDecimal.valueOf(50));
//        Usluga callPackage30 = new Usluga("Пакет 30 минут","new ser", callsCategory, BigDecimal.valueOf(100));
//
//        Usluga cinemaTicket = new Usluga("Кинотеатр","new ser", cinemaCategory, BigDecimal.valueOf(500));
//
//        Usluga roamingPackage20GB = new Usluga("Пакет 20 ГБ", "new ser",roamingCategory, BigDecimal.valueOf(1000));
//
//        Usluga internetPackage10GB = new Usluga("Пакет 10 ГБ","new ser", internetCategory, BigDecimal.valueOf(200));
//        Usluga internetPackage30GB = new Usluga("Пакет 30 ГБ", "new ser",internetCategory, BigDecimal.valueOf(550));

        uslugaRepository.save(callPackage60);
//        uslugaRepository.save(callBlackList);
//        uslugaRepository.save(callPackage30);
//        uslugaRepository.save(cinemaTicket);
//        uslugaRepository.save(roamingPackage20GB);
//        uslugaRepository.save(internetPackage10GB);
//        uslugaRepository.save(internetPackage30GB);

    }

}