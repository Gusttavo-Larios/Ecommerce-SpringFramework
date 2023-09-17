package com.tads4.tads4.core.entities;

public interface ProductEntity {

    public Long getId();
    public void setId(Long id);

    public String getName();
    public void setName(String name);

    public String getDescription();
    public void setDescription(String description);

    public Double getPrice();
    public void setPrice(Double price);

    public String getImgUrl();
    public void setImgUrl(String imgUrl);
}
