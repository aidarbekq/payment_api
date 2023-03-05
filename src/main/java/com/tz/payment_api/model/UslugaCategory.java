package com.tz.payment_api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usluga_categories")
public class UslugaCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private UslugaCategory parentCategory;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Usluga> services;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Usluga> getServices() {
        return services;
    }

    public UslugaCategory(String name, UslugaCategory parentCategory) {
        this.name = name;
        this.parentCategory = parentCategory;
    }

    public UslugaCategory() {}

    public UslugaCategory getParentCategory() {
        return parentCategory;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCategory(UslugaCategory parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setServices(List<Usluga> services) {
        this.services = services;
    }
}

