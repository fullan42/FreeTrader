package com.example.freetrader.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("4")
public class ETF extends Asset {


    private String issuer;

    private String brand;

    private String expenseRatio;

    private Date inception;

    private String trackedThing;

    private String assetClass;

    private String assetClassSize;

    private String assetClassStyle;

    private String regionGeneral;

    private String regionSpecific;

    private String segmentEquity;

    private String categorySizeStyle;

    private String strategy;

    private String weightingScheme;

    public ETF(String id, String name, Integer rank, String openPrice, Double Price, String volume, String dayLow, String dayHigh, String week52Low, String week52High, String assetsUnderManagement, Double shares, Double marketCap, String country, Integer sharePrice, Double change1Day, Double change1Year, Integer year, List<Category> categories, Market market, Client client, String issuer, String brand, String expenseRatio, Date inception, String trackedThing, String assetClass, String assetClassSize, String assetClassStyle, String regionGeneral, String regionSpecific, String segmentEquity, String categorySizeStyle, String strategy, String weightingScheme) {
        super(id, name, rank, openPrice, Price, volume, dayLow, dayHigh, week52Low, week52High, assetsUnderManagement, shares, marketCap, country, sharePrice, change1Day, change1Year, year, categories, market, client);
        this.issuer = issuer;
        this.brand = brand;
        this.expenseRatio = expenseRatio;
        this.inception = inception;
        this.trackedThing = trackedThing;
        this.assetClass = assetClass;
        this.assetClassSize = assetClassSize;
        this.assetClassStyle = assetClassStyle;
        this.regionGeneral = regionGeneral;
        this.regionSpecific = regionSpecific;
        this.segmentEquity = segmentEquity;
        this.categorySizeStyle = categorySizeStyle;
        this.strategy = strategy;
        this.weightingScheme = weightingScheme;
    }
}
