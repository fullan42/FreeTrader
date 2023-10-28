package com.example.freetrader.service;

import com.example.freetrader.converters.MarketConverter;
import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Market;
import com.example.freetrader.exception.Constant;
import com.example.freetrader.exception.MarketAlreadyExistException;
import com.example.freetrader.exception.MarketNotFoundException;
import com.example.freetrader.repository.MarketRepository;
import com.example.freetrader.request.CreateMarketRequest;
import com.example.freetrader.response.CreateMarketResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

}
