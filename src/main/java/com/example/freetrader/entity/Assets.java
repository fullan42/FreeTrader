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
public class Assets {

    @Id
    @UuidGenerator
    String id;

    private Integer rank;

    private String openPrice;

    private String volume;

    private String dayLow;

    private String dayHigh;

    private String week52Low;

    private String week52High;

    private String assetsUnderManagement;

    private String shares;

    private Double marketCap;

    private String country;

    private Integer sharePrice;

    private Double change1Day;

    private Double change1Year;

    private Integer year;// year will used for market cap and other things

    @ManyToMany(mappedBy = "assetsList")
    private List<Category> categories;

    @ManyToOne
    private Client client;
}
