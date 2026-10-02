package com.monaymanager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id",nullable = false)
    private int categoryId;

    @Column(name = "category_code",nullable = false)
    private int categoryCode;

    @Column(name = "category_name",nullable = false)
    private String categoryName;

    @Column(name = "category_description")
    private String categoryDescription;

    @Column(name = "created_at",nullable = false)
    private Date createdAt;

    @Column(name = "updated_at",nullable = false)
    private Date updatedAt;

    @Column(name = "customer_id",nullable = false)
    private int customerId;

}
