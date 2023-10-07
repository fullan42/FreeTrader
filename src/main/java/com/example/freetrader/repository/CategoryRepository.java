package com.example.freetrader.repository;

import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
