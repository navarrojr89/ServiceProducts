package com.lamn.microservices.serviceproducts.models.service;

import com.lamn.microservices.serviceproducts.models.entity.Product;

import java.util.List;

/**
 * The interface Product service.
 */
public interface ProductService {

    /**
     * Find all list.
     *
     * @return the list
     */
    List<Product> findAll();

    /**
     * Find by id product.
     *
     * @param id the id
     * @return the product
     */
    Product findById(Long id);

}
