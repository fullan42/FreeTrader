package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset,String> {
}
