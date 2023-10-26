package com.example.freetrader.controller;

import com.example.freetrader.entity.Market;
import com.example.freetrader.request.CreateMarketRequest;
import com.example.freetrader.response.CreateMarketResponse;
import com.example.freetrader.service.MarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MarketController {
    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

    private final MarketService marketService;

    @PostMapping("create-market")
    public ResponseEntity<CreateMarketResponse> createAssetResponse(@RequestBody CreateMarketRequest request) {
        CreateMarketResponse response = marketService.createMarket(request);
        return new ResponseEntity<CreateMarketResponse>(response, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<?> deleteMarket(@PathVariable Market market) {

        marketService.deleteMarket(market);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
