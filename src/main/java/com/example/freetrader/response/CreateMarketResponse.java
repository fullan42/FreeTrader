package com.example.freetrader.response;

import jakarta.validation.constraints.NotBlank;

public record CreateMarketResponse(
        @NotBlank String location,

        @NotBlank String currency,

        @NotBlank String owner,

        @NotBlank Double marketCap,

        @NotBlank String foundedDate
) {
}
