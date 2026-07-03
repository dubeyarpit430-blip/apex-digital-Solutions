package com.apex.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "contacts")
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String phone;
    private String service;
    private String budget;
    private String timeline;

    @Column(length = 2000, nullable = false)
    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();
}
