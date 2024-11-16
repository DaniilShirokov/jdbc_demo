package org.netology.ru.jdbc_demo.controller;

import org.netology.ru.jdbc_demo.dto.OrdersInfo;
import org.netology.ru.jdbc_demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products/fetch-product")
    public List<OrdersInfo> fetchProducts(@RequestParam String name) {
        return productRepository.getProductName(name);
    }
}