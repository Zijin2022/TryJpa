package com.tryJpa.TryJpa.controller;

import com.tryJpa.TryJpa.model.Account;
import com.tryJpa.TryJpa.model.AccountRepository;
import com.tryJpa.TryJpa.model.testRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class testController {
//    @Autowired
//    private testRepository test;
    private final AccountRepository test;

    public testController(AccountRepository test) {
        this.test = test;
    }

//    @GetMapping("/")
//    public String hello(){
//        System.out.println("111");
//        return "hello world";
//    }

    @GetMapping("/all")
    public Collection<Account> getAll(){
        return test.findAll();
    }
}
