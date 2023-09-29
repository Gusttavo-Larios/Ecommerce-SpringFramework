package com.tads4.tads4.adapters.repositories;

import com.tads4.tads4.core.entities.ProductEntity;
import com.tads4.tads4.entities.Product;
import com.tads4.tads4.generics.pagination.PageGenericImpl;

public interface ProductRepository  {
    public PageGenericImpl<ProductEntity> listProducts(Integer page);

    public ProductEntity showProduct(Long id);

     public ProductEntity insertProduct(ProductEntity product);

     public ProductEntity updateProduct(Long id, ProductEntity product);

     public void deleteProduct(Long id);
}
