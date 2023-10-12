package com.example.freetrader.entity;

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
@DiscriminatorValue("3")
public class Index extends Asset {
    public Index(String id, Integer rank, String openPrice, String volume, String dayLow, String dayHigh, String week52Low, String week52High, String assetsUnderManagement, String shares, Double marketCap, String country, Integer sharePrice, Double change1Day, Double change1Year, Integer year, List<Category> categories, Market market, Client client, Market market1) {
        super(id, rank, openPrice, volume, dayLow, dayHigh, week52Low, week52High, assetsUnderManagement, shares, marketCap, country, sharePrice, change1Day, change1Year, year, categories, market, client);
        this.market = market1;
    }

    @ManyToOne
    private Market market;
}
