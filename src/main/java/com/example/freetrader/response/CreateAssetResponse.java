package com.example.freetrader.response;

import jakarta.validation.constraints.NotBlank;

public record CreateAssetResponse(
        @NotBlank String id,

        @NotBlank String name,

        @NotBlank Integer rank,

        String openPrice,

        Double price,

        String volume,

        String dayLow,

        String dayHigh,

        String week52Low,

        String week52High,

        String assetsUnderManagement,

        Double shares,

        Double marketCap,

        String country,

        Integer sharePrice,

        Double change1Day,

        Double change1Year,

        Integer year
){

        }
