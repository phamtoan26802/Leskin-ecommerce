package com.ecommerce.product.service;

import com.ecommerce.product.dto.ProductDto;
import com.ecommerce.product.model.Product;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();
    Product save(ProductDto productDto);
    Product update(ProductDto productDto);
    void deleteById(Long id);
    void enableById(Long id);

}
