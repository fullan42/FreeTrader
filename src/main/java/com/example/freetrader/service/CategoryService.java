package com.example.freetrader.service;
import com.example.freetrader.entity.Asset;
import com.example.freetrader.entity.Category;
import com.example.freetrader.repository.AssetRepository;
import com.example.freetrader.repository.CategoryRepository;
import com.example.freetrader.request.CreateCategoryRequest;
import com.example.freetrader.response.CreateCategoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final AssetRepository assetRepository;

    public CategoryService(CategoryRepository categoryRepository, AssetRepository assetRepository) {
        this.categoryRepository = categoryRepository;
        this.assetRepository = assetRepository;
    }

    public CreateCategoryResponse createCategory(CreateCategoryRequest request){
        List<Asset> allAssets = assetRepository.findAll();

        Category category=new Category(request.id(), request.assets(),request.name());
        return null;
    }
}
