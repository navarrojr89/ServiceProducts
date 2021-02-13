package com.lamn.microservices.serviceproducts.controllers;

import com.lamn.microservices.serviceproducts.models.entity.Product;
import com.lamn.microservices.serviceproducts.models.service.ProductService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    private Environment environment;
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        String port = environment.getProperty("local.server.port");
        if (StringUtils.isNotEmpty(port)) {
            return productService.findAll()
                    .stream()
                    .peek(product -> product.setPort(Integer.parseInt(port)))
                    .collect(Collectors.toList());
        }
        return productService.findAll();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        Product product = productService.findById(id);
        String port = environment.getProperty("local.server.port");
        if (product != null && StringUtils.isNotEmpty(port)) {
            product.setPort(Integer.parseInt(port));
        }

        return product;
    }

}
