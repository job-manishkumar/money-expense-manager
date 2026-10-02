package com.monaymanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "budget")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_id", nullable = false)
    private int budgetId;

    @Column(name = "budget_amount", nullable = false)
    private String budgetAmount;

    @Column(name = "budget_day")
    private double budgetDay;

    @Column(name = "budget_week")
    private double budgetWeek;

    @Column(name = "budget_month")
    private double budgetMonth;

    @Column(name = "budget_year")
    private double budgetYear;

    @Column(name = "customer_id", nullable = false)
    private int customerId;

    @Column(name = "category_id", nullable = false)
    private int categoryId;
}
