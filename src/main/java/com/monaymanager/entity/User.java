package com.monaymanager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "created_at", nullable = false)
    private Date createAt;

    @Column(name = "updated_at", nullable = false)
    private Date updatedAt;

    @Column(name = "password_updated_at", nullable = false)
    private Date passwordUpdatedAt;

    @Column(name = "last_login", nullable = false)
    private Date lastLogin;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted;
}
