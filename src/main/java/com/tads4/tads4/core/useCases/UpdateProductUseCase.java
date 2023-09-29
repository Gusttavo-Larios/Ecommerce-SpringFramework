package com.tads4.tads4.core.useCases;

import com.tads4.tads4.core.entities.ProductEntity;

public interface UpdateProductUseCase {
    public ProductEntity updateProduct(Long id, ProductEntity product);
}
