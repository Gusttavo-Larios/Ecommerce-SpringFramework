package com.tads4.tads4.core.useCases;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.entities.Product;
import com.tads4.tads4.generics.pagination.PageGenericImpl;

public interface ListProductsUseCase {

    public PageGenericImpl<ProductEntity> listProducts(Integer page);

}
