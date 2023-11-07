package com.example.freetrader.request;

import com.example.freetrader.entity.Asset;

import java.time.LocalDateTime;
import java.util.List;

public record CreateCategoryRequest(
        String id,

        List<Asset> assets,
        String name
) {
}
