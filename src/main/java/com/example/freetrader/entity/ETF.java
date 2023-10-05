package com.example.freetrader.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ETF extends Assets {

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

}
