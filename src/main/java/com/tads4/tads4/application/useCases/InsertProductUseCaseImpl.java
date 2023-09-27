package com.tads4.tads4.application.useCases;

import com.tads4.tads4.adapters.repositories.ProductRepository;
import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.core.useCases.InsertProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertProductUseCaseImpl implements InsertProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductEntity insertProduct(ProductEntity product) {
        return this.productRepository.insertProduct(product);
    }
}
