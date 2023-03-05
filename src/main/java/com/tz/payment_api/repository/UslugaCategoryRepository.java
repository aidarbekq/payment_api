package com.tz.payment_api.repository;

import com.tz.payment_api.model.UslugaCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UslugaCategoryRepository extends JpaRepository<UslugaCategory, Long> {

    List<UslugaCategory> findByParentCategory(UslugaCategory parentCategory);
}