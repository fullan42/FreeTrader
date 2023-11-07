package com.example.freetrader.service;

import com.example.freetrader.converters.MarketConverter;
import com.example.freetrader.entity.*;
import com.example.freetrader.exception.Constant;
import com.example.freetrader.exception.MarketNotFoundException;
import com.example.freetrader.repository.MarketRepository;
import com.example.freetrader.request.CreateMarketRequest;
import com.example.freetrader.response.CreateMarketResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MarketService {
    private final MarketRepository marketRepository;
    private final MarketConverter marketConverter;

    public MarketService(MarketRepository marketRepository, MarketConverter marketConverter) {
        this.marketRepository = marketRepository;
        this.marketConverter= marketConverter;
    }

    public Optional<Market> findMarketById(String id) {
        return marketRepository.findById(id);
    }
    public CreateMarketResponse createMarket(CreateMarketRequest request){

            Market market= new Market(request.location(), request.currency(), request.owner(), request.marketCap(), request.foundedDate(), request.name(),request.numberOfListings());
            System.out.println(request);
            Market save = marketRepository.save(market);
            return marketConverter.marketConverter(save);

    }

    public void deleteMarket(String id){
        if (marketRepository.findById(id).isPresent()){
            marketRepository.deleteById(id);
        }else{
            throw new MarketNotFoundException(Constant.Market_Not_Found);
        }

    }

    public List<Asset> getAllAssetsInMarket(String marketId) {
        Market market = marketRepository.findById(marketId).orElseThrow(() -> new MarketNotFoundException(Constant.Market_Not_Found));
        return market.getAssetList();
    }
    public List<Stock> getAllStocksInMarket(String marketId) {
        List<Asset> assets = getAllAssetsInMarket(marketId);
        List<Stock> stocks = new ArrayList<>();

        for (Asset asset : assets) {
            if (asset instanceof Stock) {
                stocks.add((Stock) asset);
            }
        }

        return stocks;
    }
    public List<ETF> getAllETFsInMarket(String marketId) {
        List<Asset> assets = getAllAssetsInMarket(marketId);
        List<ETF> ETFS = new ArrayList<>();

        for (Asset asset : assets) {
            if (asset instanceof ETF) {
                ETFS.add((ETF) asset);
            }
        }

        return ETFS;
    }
    public List<Index> getAllIndicesInMarket(String marketId) {
        List<Asset> assets = getAllAssetsInMarket(marketId);
        List<Index> indices = new ArrayList<>();

        indices = assets.stream()
                .filter(asset -> asset instanceof Index)
                .map(asset -> (Index) asset)
                .collect(Collectors.toList());
        return indices;
    }
}
