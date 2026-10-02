package com.monaymanager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int accountId;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_description")
    private String accountDescription;

    @Column(name = "account_type", nullable = false)
    private String accountType;

    @Column(name = "opening_balance")
    private double openingBalance;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

    @Column(name = "customer_id")
    private int customerId;
}
