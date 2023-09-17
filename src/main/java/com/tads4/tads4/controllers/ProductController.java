package com.tads4.tads4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.core.useCases.ListProductsUseCase;

import com.tads4.tads4.generics.pagination.PageGenericImpl;

import com.tads4.tads4.infrastructure.views.product.ProductListViewImpl;

// aula
import com.tads4.tads4.dto.ProductDTO;
import com.tads4.tads4.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ListProductsUseCase listProductsUseCase;

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}")
    public ProductDTO findById(@PathVariable Long id) {
        return service.findById(id);

    }

    @GetMapping
    public ProductListViewImpl findAll(Pageable pageable) {
        PageGenericImpl<ProductEntity> result = this.listProductsUseCase.listProducts(pageable.getPageNumber());

        return new ProductListViewImpl(result);
    }

}
