package com.tads4.tads4.infrastructure.repositories;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.application.entities.ProductEntityImpl;
import com.tads4.tads4.adapters.repositories.JpaProductRepository;
import com.tads4.tads4.adapters.repositories.ProductRepository;
import com.tads4.tads4.generics.pagination.PageGenericImpl;

//Aula
import com.tads4.tads4.entities.Product;


@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Autowired
    private final JpaProductRepository jpaProductRepository;


    public ProductRepositoryImpl(JpaProductRepository jpaProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
    }

    public PageGenericImpl<ProductEntity> listProducts(Integer page) {

        Pageable pageable = PageRequest.of(page, 20);

        Page<Product> result = this.jpaProductRepository.findAll(pageable);

        List<ProductEntity> items = result.getContent().stream().map(
                item -> new ProductEntityImpl(
                        item.getId(),
                        item.getName(),
                        item.getDescription(),
                        item.getPrice(),
                        item.getImgUrl()
                )
        ).collect(Collectors.toList());

        return new PageGenericImpl<>(items, result.getNumber(), result.getTotalPages());
    }
}
