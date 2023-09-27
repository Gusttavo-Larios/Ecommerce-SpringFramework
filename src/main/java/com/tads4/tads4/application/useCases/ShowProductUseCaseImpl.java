package com.tads4.tads4.application.useCases;

import com.tads4.tads4.adapters.repositories.ProductRepository;
import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.core.useCases.ShowProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ShowProductUseCaseImpl implements ShowProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductEntity showProduct(Long id) {
        return this.productRepository.showProduct(id);
    }
}
