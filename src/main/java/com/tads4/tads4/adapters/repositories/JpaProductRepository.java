package com.tads4.tads4.adapters.repositories;

import com.tads4.tads4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaProductRepository extends JpaRepository<Product, Long> {}