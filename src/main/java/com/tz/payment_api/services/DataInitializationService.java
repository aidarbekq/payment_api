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
        UslugaCategory mainCategory = new UslugaCategory("Связь", null);
        UslugaCategory callsCategory = new UslugaCategory("Звонки", mainCategory);
        UslugaCategory internetCategory = new UslugaCategory("Интернет", mainCategory);
        UslugaCategory entertainmentCategory = new UslugaCategory("Развлечения", allCategory);
        UslugaCategory cinemaCategory = new UslugaCategory("Кино", entertainmentCategory);
        UslugaCategory gamesCategory = new UslugaCategory("Игры", entertainmentCategory);
        UslugaCategory roamingCategory = new UslugaCategory("Роуминг", allCategory);

        uslugaCategoryRepository.save(allCategory);
        uslugaCategoryRepository.save(mainCategory);
        uslugaCategoryRepository.save(callsCategory);
        uslugaCategoryRepository.save(internetCategory);
        uslugaCategoryRepository.save(entertainmentCategory);
        uslugaCategoryRepository.save(cinemaCategory);
        uslugaCategoryRepository.save(gamesCategory);
        uslugaCategoryRepository.save(roamingCategory);

        Usluga callPackage60 = new Usluga("Пакет 60 минут", "new ser", new BigDecimal(200),
                "12335647", callsCategory);

        Usluga callBlackList = new Usluga("Черный список", "black list fun", new BigDecimal(50),
        "12335647", callsCategory);

        Usluga callPackage30 = new Usluga("Пакет 30 минут","new ser",
                new BigDecimal(100), "12335647", callsCategory);

        Usluga cinemaTicket = new Usluga("Кинотеатр","новые фильмы",
                new BigDecimal(500),"12335647",cinemaCategory);

        Usluga roamingPackage20GB = new Usluga("Пакет 20 ГБ", "new package",
                BigDecimal.valueOf(1000), "12335647", roamingCategory );

        Usluga internetPackage10GB = new Usluga("Пакет 10 ГБ","new package",
               BigDecimal.valueOf(200), "12335647", internetCategory);
        Usluga internetPackage30GB = new Usluga("Пакет 30 ГБ", "new package",
                 BigDecimal.valueOf(550),"12335647", internetCategory);

        uslugaRepository.save(callPackage60);
        uslugaRepository.save(callBlackList);
        uslugaRepository.save(callPackage30);
        uslugaRepository.save(cinemaTicket);
        uslugaRepository.save(roamingPackage20GB);
        uslugaRepository.save(internetPackage10GB);
        uslugaRepository.save(internetPackage30GB);

    }

}