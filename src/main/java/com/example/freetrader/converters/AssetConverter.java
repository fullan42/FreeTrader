package com.example.freetrader.converters;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.response.CreateAssetResponse;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class AssetConverter {

    public CreateAssetResponse assetConverter(Asset asset){
        CreateAssetResponse response= new CreateAssetResponse(
                asset.getId(),
                asset.getName(),
                asset.getRank(),
                asset.getOpenPrice(),
                asset.getPrice(),
                asset.getVolume(),
                asset.getDayLow(),
                asset.getDayHigh(),
                asset.getWeek52Low(),
                asset.getWeek52High(),
                asset.getAssetsUnderManagement(),
                asset.getShares(),
                asset.getMarketCap(),
                asset.getCountry(),
                asset.getSharePrice(),
                asset.getChange1Day(),
                asset.getChange1Year(),
                asset.getYear());
            return response;
    }
}
