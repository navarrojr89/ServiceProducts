package com.lamn.microservices.serviceproducts.models.repository;

import com.lamn.microservices.appcommons.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * The interface Product repository.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {
}
