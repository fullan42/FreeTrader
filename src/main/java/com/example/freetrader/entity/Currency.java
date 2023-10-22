package com.example.freetrader.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Currency {
    @Id
    @UuidGenerator
    private String id;

    private String name;

    private String exchangeRate;

}
