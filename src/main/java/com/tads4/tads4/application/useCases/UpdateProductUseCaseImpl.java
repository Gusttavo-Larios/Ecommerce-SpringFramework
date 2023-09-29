package com.tads4.tads4.application.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.core.useCases.UpdateProductUseCase;
import com.tads4.tads4.adapters.repositories.ProductRepository;

@Service
public class UpdateProductUseCaseImpl implements UpdateProductUseCase {
    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductEntity updateProduct(Long id, ProductEntity product) {
        return this.productRepository.updateProduct(id, product);
    }
}
