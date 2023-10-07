package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Emtia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmtiaRepository extends JpaRepository<Emtia,String> {
}
