package com.tads4.tads4.application.useCases;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.adapters.repositories.ProductRepository;
import com.tads4.tads4.generics.pagination.PageGenericImpl;

@Service
public class ListProductsUseCaseImpl implements com.tads4.tads4.core.useCases.ListProductsUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public PageGenericImpl<ProductEntity> listProducts(Integer page) {
        return this.productRepository.listProducts(page);
    }
}
