package com.lamn.microservices.serviceproducts.models.service;

import com.lamn.microservices.appcommons.models.entity.Product;

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

    /**
     * Save product.
     *
     * @param product the product
     * @return the product
     */
    Product save(Product product);

    /**
     * Delete by id.
     *
     * @param id the id
     */
    void deleteById(Long id);

}
