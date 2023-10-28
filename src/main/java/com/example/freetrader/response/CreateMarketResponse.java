package com.example.freetrader.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public record CreateMarketResponse(
         String id,

         String location,

         String currency,

         String owner,

         Double marketCap,

         String foundedDate,

         String name,

         Integer numberOfListings
) {
}
