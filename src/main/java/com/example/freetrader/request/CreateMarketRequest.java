package com.example.freetrader.request;

import jakarta.validation.constraints.NotBlank;

public record CreateMarketRequest(
         @NotBlank String location,

         @NotBlank String currency,

         @NotBlank String owner,

         @NotBlank Double marketCap,

         @NotBlank String foundedDate
) {
}
