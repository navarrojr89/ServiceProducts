package com.lamn.microservices.serviceproducts.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * The entity Product.
 */
@Entity
@Table(name = "products")
public class Product implements Serializable {

    private static final long serialVersionUID = -1893404914863420439L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @Column(name = "crate_at")
    @Temporal(TemporalType.DATE)
    private Date crateAt;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Gets crate at.
     *
     * @return the crate at
     */
    public Date getCrateAt() {
        return crateAt;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Sets crate at.
     *
     * @param crateAt the crate at
     */
    public void setCrateAt(Date crateAt) {
        this.crateAt = crateAt;
    }
}