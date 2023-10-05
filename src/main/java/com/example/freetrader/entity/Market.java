package com.example.freetrader.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Market {
    @Id
    @UuidGenerator
    String id;

    private String location;

    private String currency;

    private String owner;

    private Double marketCap;

    private String foundedDate;

    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Index> indexList;

    private Integer numberOfListings;

}
