package com.example.freetrader.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@DiscriminatorValue("1")
public class Emtia extends Asset {
    public Emtia(String id, String name, Integer rank, String openPrice, String volume, String dayLow, String dayHigh, String week52Low, String week52High, String assetsUnderManagement, String shares, Double marketCap, String country, Integer sharePrice, Double change1Day, Double change1Year, Integer year, List<Category> categories, Market market, Client client, Double weightPerShare, Market market1) {
        super(id, name, rank, openPrice, volume, dayLow, dayHigh, week52Low, week52High, assetsUnderManagement, shares, marketCap, country, sharePrice, change1Day, change1Year, year, categories, market, client);
        this.weightPerShare = weightPerShare;
        this.market = market1;
    }

    private Double weightPerShare;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Market market;

}
