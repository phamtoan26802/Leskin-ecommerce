package com.ecommerce.product.service;

import com.ecommerce.product.model.Customer;
import com.ecommerce.product.model.Product;
import com.ecommerce.product.model.ShoppingCart;

public interface ShoppingCartService {
    ShoppingCart addItemToCart(Product product, int quantity, Customer customer);
    ShoppingCart updateItemInCart(Product product, int quantity, Customer customer);
    ShoppingCart deleteItemFromCart(Product product, Customer customer);
}
