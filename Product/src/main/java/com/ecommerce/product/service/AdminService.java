package com.ecommerce.product.service;

import com.ecommerce.product.dto.AdminDto;
import com.ecommerce.product.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDto adminDto);
}
