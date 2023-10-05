package com.example.freetrader.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.boot.autoconfigure.mail.MailProperties;

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
    private List<Assets> portfolio;

}
