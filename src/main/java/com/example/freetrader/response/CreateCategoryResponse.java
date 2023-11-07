package com.example.freetrader.response;

import com.example.freetrader.entity.Asset;

import java.time.LocalDateTime;
import java.util.List;

public record CreateCategoryResponse(
        String id,

        List<Asset> assets,

        String name
) {
}
