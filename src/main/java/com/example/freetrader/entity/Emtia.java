package com.example.freetrader.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emtia extends Asset {
    public Emtia(String id, Integer rank, String openPrice, String volume, String dayLow,
                 String dayHigh, String week52Low, String week52High,
                 String assetsUnderManagement, String shares,
                 Double marketCap, String country, Integer sharePrice,
                 Double change1Day, Double change1Year, Integer year,
                 List<Category> categories, Client client, Double weightPerShare) {
        super(id, rank, openPrice, volume, dayLow, dayHigh, week52Low, week52High, assetsUnderManagement, shares, marketCap, country, sharePrice, change1Day, change1Year, year, categories, client);
        this.weightPerShare = weightPerShare;
    }

    private Double weightPerShare;


}
