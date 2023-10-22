package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AssetRepository extends JpaRepository<Asset,String> {

    Optional<Asset> findByName(String name);
}
