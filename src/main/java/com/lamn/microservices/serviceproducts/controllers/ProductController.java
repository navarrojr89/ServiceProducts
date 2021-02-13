package com.lamn.microservices.serviceproducts.controllers;

import com.lamn.microservices.serviceproducts.models.entity.Product;
import com.lamn.microservices.serviceproducts.models.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAll()
                .stream()
                .peek(product -> product.setPort(port))
                .collect(Collectors.toList());
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product != null) {
            product.setPort(port);
        }

        return product;
    }

}
