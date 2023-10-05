package com.example.freetrader.entity;

import jakarta.persistence.Id;
import org.hibernate.annotations.UuidGenerator;

public class Currency {
    @Id
    @UuidGenerator
    String id;
}
