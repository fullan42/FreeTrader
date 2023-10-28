package com.example.freetrader.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("2")
public class Stock extends Asset {

    public Stock(String id, String name, Integer rank, String openPrice, Double Price, String volume, String dayLow, String dayHigh, String week52Low, String week52High, String assetsUnderManagement, Double shares, Double marketCap, String country, Integer sharePrice, Double change1Day, Double change1Year, Integer year, List<Category> categories, Market market, Client client, String pERatio, String pSRatio, String operatingMargin, String ePS, String stockSplits, String dividends, String dividendYield, String sharesOutstanding, String failsToDeliver, String costToBorrow, String totalAssets, String totalLiabilities, String totalDebt, String cashOnHand, String netAssets) {
        super(id, name, rank, openPrice, Price, volume, dayLow, dayHigh, week52Low, week52High, assetsUnderManagement, shares, marketCap, country, sharePrice, change1Day, change1Year, year, categories, market, client);
        this.pERatio = pERatio;
        this.pSRatio = pSRatio;
        this.operatingMargin = operatingMargin;
        this.ePS = ePS;
        this.stockSplits = stockSplits;
        this.dividends = dividends;
        this.dividendYield = dividendYield;
        this.sharesOutstanding = sharesOutstanding;
        this.failsToDeliver = failsToDeliver;
        this.costToBorrow = costToBorrow;
        TotalAssets = totalAssets;
        this.totalLiabilities = totalLiabilities;
        this.totalDebt = totalDebt;
        this.cashOnHand = cashOnHand;
        this.netAssets = netAssets;
    }

    private String pERatio;

    private String pSRatio;

    private String operatingMargin;

    private String ePS;

    private String stockSplits;

    private String dividends;

    private String dividendYield;

    private String sharesOutstanding;

    private String failsToDeliver;

    private String costToBorrow;

    private String TotalAssets;

    private String totalLiabilities;

    private String totalDebt;

    private String cashOnHand;

    private String netAssets;


}
