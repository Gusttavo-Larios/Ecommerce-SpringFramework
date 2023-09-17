package com.tads4.tads4.adapters.repositories;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.generics.pagination.PageGenericImpl;

public interface ProductRepository  {
    public PageGenericImpl<ProductEntity> listProducts(Integer page);
}
