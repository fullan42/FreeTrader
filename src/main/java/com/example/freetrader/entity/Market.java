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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String location;

    private String currency;

    private String owner;

    private Double marketCap;

    private String foundedDate;

    private String name;

    @OneToMany(mappedBy = "market", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Index> indexList;

    @OneToMany(mappedBy = "market",cascade = CascadeType.DETACH,orphanRemoval = true)
    private List<Stock> stockList;

    @OneToMany(mappedBy = "market",cascade = CascadeType.DETACH,orphanRemoval = true)
    private List<ETF> ETFList;

    @OneToMany(mappedBy = "market",cascade = CascadeType.DETACH,orphanRemoval = true)
    private List<Asset> AssetList;

    public Market(String location, String currency, String owner, Double marketCap, String foundedDate, String name, Integer numberOfListings) {
        this.location = location;
        this.currency = currency;
        this.owner = owner;
        this.marketCap = marketCap;
        this.foundedDate = foundedDate;
        this.name = name;
        this.numberOfListings = numberOfListings;
    }

    private Integer numberOfListings;

    public Market(String location, String currency, String owner, Double marketCap, String foundedDate) {
    }

    public Market(String id, String location, String currency, String owner, Double marketCap, String foundedDate) {
    }
}
