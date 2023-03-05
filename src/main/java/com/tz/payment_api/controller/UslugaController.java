package com.tz.payment_api.controller;

import com.tz.payment_api.dto.UslugaCategoryDto;
import com.tz.payment_api.dto.UslugaDto;
import com.tz.payment_api.services.UslugaCategoryService;
import com.tz.payment_api.services.UslugaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class UslugaController {
    private final UslugaService uslugaService;
    private final UslugaCategoryService uslugaCategoryService;

    @Autowired
    public UslugaController(UslugaService uslugaService,
                            UslugaCategoryService uslugaCategoryService) {
        this.uslugaService = uslugaService;
        this.uslugaCategoryService = uslugaCategoryService;
    }

    @GetMapping("/uslugi")
    public ResponseEntity<List<UslugaDto>> getAllUslugi() {
        List<UslugaDto> uslugi = uslugaService.getAllUslugi();
        return ResponseEntity.ok(uslugi);
    }
    @GetMapping("/uslugi/{id}")
    public ResponseEntity<UslugaDto> getUslugaById(@PathVariable Long id) {
        UslugaDto usluga = uslugaService.getUslugaById(id);
        return ResponseEntity.ok(usluga);
    }

    @GetMapping("/uslugi/{categoryId}")
    public ResponseEntity<List<UslugaDto>> getUslugiByCategory(@PathVariable Long categoryId) {
        UslugaCategoryDto categoryDto = uslugaCategoryService.getCategoryById(categoryId);
        List<UslugaDto> uslugi = uslugaService.getUslugiByCategory(categoryDto);
        return ResponseEntity.ok(uslugi);
    }

    @GetMapping("/categories")
    public ResponseEntity<List<UslugaCategoryDto>> getAllCategories() {
        List<UslugaCategoryDto> categories = uslugaCategoryService.getAllCategories();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("categories/{id}")
    public ResponseEntity<UslugaCategoryDto> getCategoryById(@PathVariable Long id) {
        UslugaCategoryDto category = uslugaCategoryService.getCategoryById(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

}
