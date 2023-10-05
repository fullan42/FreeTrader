package com.example.freetrader.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @UuidGenerator
    private String id;

    @ManyToMany
    @JoinTable(
            name = "category_asset",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "asset_id")
    )
    private List<Assets> assetsList;

    private String name;

}
