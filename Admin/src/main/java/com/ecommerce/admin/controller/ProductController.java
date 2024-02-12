package com.ecommerce.admin.controller;

import com.ecommerce.product.dto.ProductDto;
import com.ecommerce.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public String product(Model model){
        List<ProductDto> productDtoList = productService.findAll();
        model.addAttribute("products",productDtoList);
        model.addAttribute("size",productDtoList.size());
       return "products";
    }
}
