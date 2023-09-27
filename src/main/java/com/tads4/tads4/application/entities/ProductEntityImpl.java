package com.tads4.tads4.application.entities;

import com.tads4.tads4.core.entities.ProductEntity;

public class ProductEntityImpl implements ProductEntity {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public ProductEntityImpl() {
    }

    public ProductEntityImpl(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String getImgUrl() {
        return imgUrl;
    }

    @Override
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
