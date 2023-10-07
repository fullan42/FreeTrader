package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,String> {
}
