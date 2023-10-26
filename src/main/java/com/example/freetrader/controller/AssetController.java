package com.example.freetrader.controller;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Market;
import com.example.freetrader.repository.AssetRepository;
import com.example.freetrader.request.CreateAssetRequest;
import com.example.freetrader.response.CreateAssetResponse;
import com.example.freetrader.service.AssetService;

import com.example.freetrader.service.MarketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assets")
public class AssetController {

    private final AssetRepository assetRepository;
    private final AssetService assetService;
    private final MarketService marketService;

    public AssetController(AssetRepository assetRepository, AssetService assetService, MarketService marketService) {
        this.assetRepository = assetRepository;
        this.marketService = marketService;
        this.assetService = assetService;
    }
    @PatchMapping("/{id}/update-price")
    public ResponseEntity<Asset> updateAssetPrice(@RequestBody Asset asset) {
            asset = assetService.updateAssetPrice(asset);
            return new ResponseEntity<>(asset, HttpStatus.OK);

    }
    @PostMapping("create-asset")
    public ResponseEntity<CreateAssetResponse> createAssetResponse(@RequestBody CreateAssetRequest request) {
            CreateAssetResponse response = assetService.createAsset(request);
            return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
    @PatchMapping("/{id}/update-shares")
    public ResponseEntity<Asset> updateAssetShares(@RequestBody Asset asset) {
            asset = assetService.updateAssetShares(asset);
            return new ResponseEntity<>(asset, HttpStatus.OK);
    }
    @PatchMapping("/{id}/update-market-cap")
    public ResponseEntity<Asset> updateAssetMarketCap(@RequestBody Asset asset) {
            asset = assetService.updateAssetMarketCap(asset);
            return new ResponseEntity<>(asset, HttpStatus.OK);

    }
    @DeleteMapping("/{id}/delete")
    public ResponseEntity<?> deleteAssetById(@PathVariable Asset asset) {

            assetService.deleteAssetById(asset.getId());
            return new ResponseEntity<>(HttpStatus.OK);

    }
    @GetMapping("/find-by-name/{name}")
    public ResponseEntity<Asset> findAssetByName(@PathVariable String name) {
        Optional<Asset> asset = assetService.findByName(name);

        if (asset.isPresent()) {
            return new ResponseEntity<>(asset.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/market/{marketId}")
    public ResponseEntity<List<Asset>> getAssetsInMarket(@PathVariable String marketId) {
        Optional<Market> market = marketService.findMarketById(marketId);
        if (market != null) {
            List<Asset> assets = assetService.getAllAssetsInMarket(market);
            return ResponseEntity.ok(assets);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
