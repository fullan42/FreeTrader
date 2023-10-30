package com.example.freetrader.controller;

import com.example.freetrader.entity.*;
import com.example.freetrader.request.CreateMarketRequest;
import com.example.freetrader.response.CreateMarketResponse;
import com.example.freetrader.service.MarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/markets")
public class MarketController {
    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

    private final MarketService marketService;

    @PostMapping("/create-market")
    public ResponseEntity<CreateMarketResponse> createAssetResponse(@RequestBody CreateMarketRequest request) {
        CreateMarketResponse response = marketService.createMarket(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<?> deleteMarket(@PathVariable String id) {

        marketService.deleteMarket(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @GetMapping("/markets/{marketId}/assets")
    public ResponseEntity<List<Asset>> getAllAssetsInMarket(@PathVariable("marketId") String marketId) {
        marketService.getAllAssetsInMarket(marketId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/markets/{marketId}/etfs")
    public ResponseEntity<List<ETF>> getAllETFsInMarket(@PathVariable("marketId") String marketId) {
        marketService.getAllETFsInMarket(marketId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/markets/{marketId}/indices")
    public ResponseEntity<List<Index>> getAllIndicesInMarket(@PathVariable("marketId") String marketId) {
        marketService.getAllIndicesInMarket(marketId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/markets/{marketId}/stocks")
    public ResponseEntity<List<Stock>> getAllStocksInMarket(@PathVariable("marketId") String marketId){
        marketService.getAllStocksInMarket(marketId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
