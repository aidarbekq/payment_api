package com.tz.payment_api.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "service_categories")
public class ServiceCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private ServiceCategory parentCategory;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Service> services;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Service> getServices() {
        return services;
    }

    public ServiceCategory getParentCategory() {
        return parentCategory;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCategory(ServiceCategory parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}

