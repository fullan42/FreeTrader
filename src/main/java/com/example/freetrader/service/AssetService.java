package com.example.freetrader.service;
import com.example.freetrader.converters.AssetConverter;
import com.example.freetrader.entity.Asset;
import com.example.freetrader.exception.AssetAlreadyExistException;
import com.example.freetrader.exception.AssetNotFoundException;
import com.example.freetrader.exception.Constant;
import com.example.freetrader.repository.AssetRepository;
import com.example.freetrader.request.CreateAssetRequest;
import com.example.freetrader.response.CreateAssetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AssetService {
    private final AssetRepository assetRepository;
    private final AssetConverter assetConverter;

    public List<Asset> getAllAsset(){
         return assetRepository.findAll();
    }

    public Optional<Asset> findByName(String name){
         return assetRepository.findByName(name);
    }

    public Asset updateAssetPrice(Asset asset) {
        Optional<Asset> optionalAsset = assetRepository.findById(asset.getId());

        if (optionalAsset.isPresent()) {

            Asset existingAsset = optionalAsset.get();

            existingAsset.setPrice(asset.getPrice());

            return assetRepository.save(existingAsset);
        } else
        {
            throw new AssetNotFoundException(Constant.Asset_Not_Found);
        }
    }

    public Asset updateAssetMarketCap(Asset asset){
        Optional<Asset> asset1 = assetRepository.findById(asset.getId());

        if(asset1.isPresent()){


        Asset existingAsset=asset1.get();

        existingAsset.setMarketCap(asset.getMarketCap());

        return assetRepository.save((existingAsset));
        }else
        {
            throw new AssetNotFoundException(Constant.Asset_Not_Found);
        }
    }

    public CreateAssetResponse createAsset(CreateAssetRequest request){
        if(assetRepository.existsById(request.id())){
            throw new AssetAlreadyExistException(Constant.Asset_Already_Exist);
        }
        Asset asset= new Asset(
                request.id(),
                request.name(),
                request.rank(),
                request.openPrice(),
                request.price(),
                request.volume(),
                request.dayLow(),
                request.dayHigh(),
                request.week52Low(),
                request.week52High(),
                request.assetsUnderManagement(),
                request.shares(),
                request.marketCap(),
                request.country(),
                request.sharePrice(),
                request.change1Day(),
                request.change1Year(),
                request.year());
        return assetConverter.assetConverter(asset);


    }
}
