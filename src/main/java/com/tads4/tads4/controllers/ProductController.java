package com.tads4.tads4.controllers;

import com.tads4.tads4.application.entities.ProductEntityImpl;
import com.tads4.tads4.core.useCases.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import com.tads4.tads4.core.entities.ProductEntity;

import com.tads4.tads4.generics.pagination.PageGenericImpl;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ListProductsUseCase listProductsUseCase;

    @Autowired
    private InsertProductUseCase insertProductUseCase;

    @Autowired
    private UpdateProductUseCase updateProductUseCase;

    @Autowired
    private DeleteProductUseCase deleteProductUseCase;

    @Autowired
    private ShowProductUseCase showProductUseCase;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductEntity> findById(@PathVariable Long id) {
        ProductEntity product = this.showProductUseCase.showProduct(id);

        return ResponseEntity.ok().body(product);
    }

    @GetMapping
    public ResponseEntity<PageGenericImpl<ProductEntity>> findAll(Pageable pageable) {
        PageGenericImpl<ProductEntity> result = this.listProductsUseCase.listProducts(pageable.getPageNumber());
        return ResponseEntity.ok().body(result);
    }

    @PostMapping
    public ResponseEntity<ProductEntity> insertProduct(@RequestBody ProductEntityImpl product) {
        ProductEntity newProduct = this.insertProductUseCase.insertProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductEntity> updateProduct(@PathVariable Long id, @RequestBody ProductEntityImpl product) {
        ProductEntity newProduct = this.updateProductUseCase.updateProduct(id, product);

        return ResponseEntity.status(HttpStatus.OK).body(newProduct);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> updateProduct(@PathVariable Long id) {
        this.deleteProductUseCase.deleteProduct(id);

        return ResponseEntity.noContent().build();
    }

}



















