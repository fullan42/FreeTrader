package com.example.freetrader.converters;

import com.example.freetrader.entity.Market;
import com.example.freetrader.response.CreateMarketResponse;
import jakarta.persistence.Converter;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MarketConverter {
    public CreateMarketResponse marketConverter(Market market){
        CreateMarketResponse marketResponse= new CreateMarketResponse(market.getId(),market.getLocation(), market.getCurrency(), market.getOwner(), market.getMarketCap(), market.getFoundedDate(), market.getName(), market.getNumberOfListings());
        return marketResponse;
    }

}
