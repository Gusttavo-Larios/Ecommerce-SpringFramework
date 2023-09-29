package com.tads4.tads4.application.useCases;

import com.tads4.tads4.adapters.repositories.ProductRepository;
import com.tads4.tads4.core.useCases.DeleteProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteProductUseCaseImpl implements DeleteProductUseCase {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void deleteProduct(Long id) {
        this.productRepository.deleteProduct(id);
    }
}
