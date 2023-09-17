package com.tads4.tads4.infrastructure.views.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.generics.pagination.PageGenericImpl;

import java.util.List;

public class ProductListViewImpl {

    @JsonProperty("items")
    private final List<ProductEntity> items;

    @JsonProperty("currentPage")
    private Integer currentPage;

    @JsonProperty("lastPage")
    private Integer lastPage;
    public ProductListViewImpl(PageGenericImpl<ProductEntity> page) {
        this.items = page.getItems();
        this.currentPage = page.getCurrentPage();
        this.lastPage = page.getLastPage();
    }
}
