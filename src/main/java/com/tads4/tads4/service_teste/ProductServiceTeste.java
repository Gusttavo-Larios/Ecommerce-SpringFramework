package com.tads4.tads4.service_teste;

import com.tads4.tads4.dto.ProductDTO;
import com.tads4.tads4.entities.Product;
import com.tads4.tads4.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceTeste {
    @Autowired
    private ProductRepository repository;

    public ProductDTO findById(Long id) {
        /*Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;*/
        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }

    @Transactional (readOnly = true)
    public Page<ProductDTO> findAll(Pageable pageable) {
        /*Optional<Product> result = repository.findById(id);
        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;*/
        Page<Product> result = repository.findAll(pageable);
        return result.map(x-> new ProductDTO(x));
    }
}