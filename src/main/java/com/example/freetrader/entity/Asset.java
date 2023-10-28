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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer rank;

    private String openPrice;

    private Double price;

    private String volume;

    private String dayLow;

    private String dayHigh;

    private String week52Low;

    private String week52High;

    private String assetsUnderManagement;

    private Double shares;

    private Double marketCap;

    private String country;

    private Integer sharePrice;

    private Double change1Day;

    private Double change1Year;

    private Integer year;// year will used for market cap and other things

    @ManyToMany(mappedBy = "assetsList")
    private List<Category> categories;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Market market;

    @ManyToOne
    private Client client;

    public Asset(String name, Integer rank, String openPrice, Double price, String volume, String dayLow, String dayHigh, String week52Low, String week52High, String assetsUnderManagement, Double shares, Double marketCap, String country, Integer sharePrice, Double change1Day, Double change1Year, Integer year) {
        this.name = name;
        this.rank = rank;
        this.openPrice = openPrice;
        this.price = price;
        this.volume = volume;
        this.dayLow = dayLow;
        this.dayHigh = dayHigh;
        this.week52Low = week52Low;
        this.week52High = week52High;
        this.assetsUnderManagement = assetsUnderManagement;
        this.shares = shares;
        this.marketCap = marketCap;
        this.country = country;
        this.sharePrice = sharePrice;
        this.change1Day = change1Day;
        this.change1Year = change1Year;
        this.year = year;
    }
}
