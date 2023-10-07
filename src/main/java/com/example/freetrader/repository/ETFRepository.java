package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.ETF;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ETFRepository extends JpaRepository<ETF,String> {
}
