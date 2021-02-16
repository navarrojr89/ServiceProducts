package com.lamn.microservices.serviceproducts.controllers;

import com.lamn.microservices.serviceproducts.models.entity.Product;
import com.lamn.microservices.serviceproducts.models.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The type Product controller.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Gets all products.
     *
     * @return the all products
     */
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    /**
     * Gets product.
     *
     * @param id the id
     * @return the product
     */
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id) {
        return productService.findById(id);
    }

}
