package com.tryJpa.TryJpa.service;

import com.tryJpa.TryJpa.model.testDAO;
import com.tryJpa.TryJpa.model.account;
import org.springframework.stereotype.Service;

@Service
public class testService implements testDAO {

    @Override
    public account findAll() {

        return null;
    }
}
