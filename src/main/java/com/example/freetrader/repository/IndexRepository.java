package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Index;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndexRepository extends JpaRepository<Index,String> {
}
