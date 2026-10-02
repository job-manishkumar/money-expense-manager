package com.monaymanager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id",nullable = false)
    private int transactionId;

    @Column(name = "transaction_name_id",nullable = false)
    private String transactionNameId;

    @Column(name = "transaction_name",nullable = false)
    private String transactionName;

    @Column(name = "transaction_description")
    private String transactionDescription;

    @Column(name = "amount",nullable = false)
    private double amount;

    @Column(name = "src_account_id",nullable = false)
    private int sourceAccountId;

    @Column(name = "dest_account_id")
    private int destinationAccountId;

    @Column(name = "transaction_date",nullable = false)
    private Date transactionDate;

    @Column(name = "create_at",nullable = false)
    private Date createdAt;

    @Column(name = "updated_at",nullable = false)
    private Date updatedAt;

    @Column(name = "category_id",nullable = false)
    private int categoryId;

    @Column(name = "customer_id",nullable = false)
    private int customerId;
}
