package com.tryJpa.TryJpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class account {
    @Id
    private int ID;
    private String EMAIL;
    private String PASSWORD;
    private String ADDRESS;
    private String CELLPHONE;
    private String CREATE_DATE;

}
