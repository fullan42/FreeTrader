package com.example.freetrader.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @UuidGenerator
    private String id;

    private String name;

    private String surname;

    private String mail;

    private String phoneNumber;

    private String capital;

    @OneToMany(mappedBy = "client")
    private List<Asset> portfolio;

}
