package com.tz.payment_api.repository;

import com.tz.payment_api.model.Usluga;
import com.tz.payment_api.model.UslugaCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UslugaRepository extends JpaRepository<Usluga, Long> {

    List<Usluga> findByCategory(UslugaCategory category);
}
