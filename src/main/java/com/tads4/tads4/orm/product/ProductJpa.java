package com.tads4.tads4.orm.product;

import com.tads4.tads4.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpa extends JpaRepository<Product, Long> {}