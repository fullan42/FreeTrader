package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset,String> {

    Optional<Asset> findByName(String name);

    List<Asset> findByMarket(Optional<Market> market);
}
