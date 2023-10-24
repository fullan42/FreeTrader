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
    @UuidGenerator
    private String id;

    private String name;

    private Integer rank;

    private String openPrice;

    private Double Price;

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

    public Asset(String id, String name, Integer rank, String openPrice, String price, String volume, String dayLow, String dayHigh, String week52Low, String week52High, String assetsUnderManagement, String shares, Double marketCap, String country, Integer sharePrice, Double change1Day, Double change1Year, Integer year) {
    }
}
