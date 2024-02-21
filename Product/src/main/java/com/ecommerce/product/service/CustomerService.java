package com.ecommerce.product.service;

import com.ecommerce.product.dto.CustomerDto;
import com.ecommerce.product.model.Customer;

public interface CustomerService {
    CustomerDto save(CustomerDto customerDto);
    Customer findByUsername(String username);
    Customer saveInfor(Customer customer);
}
