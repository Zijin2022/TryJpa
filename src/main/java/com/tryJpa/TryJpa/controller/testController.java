package com.tryJpa.TryJpa.controller;

import com.tryJpa.TryJpa.model.account;
import com.tryJpa.TryJpa.model.testRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class testController {
//    @Autowired
//    private testRepository test;
    private final testRepository test;

    public testController(testRepository test) {
        this.test = test;
    }

    @GetMapping("/")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/all")
    public Collection<account> getAll(){
        return test.findAll();
    }
}
