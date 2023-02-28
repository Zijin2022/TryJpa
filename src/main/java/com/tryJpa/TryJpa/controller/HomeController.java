package com.tryJpa.TryJpa.controller;

import com.tryJpa.TryJpa.model.Account;
import com.tryJpa.TryJpa.model.AccountRepository;
import com.tryJpa.TryJpa.model.testRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Tag(name = "Todo list 相關api")
@RestController
public class HomeController {
    private final AccountRepository test;

    public HomeController(AccountRepository test) {
        this.test = test;
    }

    @GetMapping("/")
    public String home(Principal principal) {
        return "Hello, " ;
    } // + principal.getName()

    @Operation(summary = "取得所有代辦事項列表")
    @ApiResponses({
            @ApiResponse(responseCode="401",description="沒有權限"),
            @ApiResponse(responseCode="404",description="找不到路徑")
    })
    @PostMapping("/create")
    public String Create() throws ParseException {
        Account acc = new Account();
        acc.setId(3);
        acc.setEmail("ee");
        acc.setPassword("ff");
        acc.setAddress("gg");
        acc.setCellphone("hh");
        DateTime dateTime = new DateTime();

        acc.setCreateDate(dateTime.toDate());
        test.save(acc);
        return "Create Success";
    }

    @PostMapping("/read")
    public Optional<Account> Read() throws ParseException {
        Optional<Account> acc = Optional.of(new Account());

        acc = test.findById(2);

        return acc;
    }

    @PostMapping("/update")
    public Optional<Account> Update() throws ParseException {
        Optional<Account> acc = Optional.of(new Account());

        Account a = test.findById(3).get();
        a.setAddress("zz");
        a.setCellphone("gg");
        test.save(a);

        acc = test.findById(3);

        return acc;
    }

    @PostMapping("/delete")
    public List<Account> Delete() throws ParseException {
        List<Account> acc = new ArrayList<>();

        Account a = test.findById(3).get();
        test.delete(a);

        acc = test.findAll();

        return acc;
    }
}
