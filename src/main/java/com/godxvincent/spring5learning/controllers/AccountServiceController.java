package com.godxvincent.spring5learning.controllers;



import com.godxvincent.spring5learning.models.Withdraw;
import com.godxvincent.spring5learning.services.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/account")
public class AccountServiceController {

    private final AccountService accountService;

    // La documentación señala que si el bean tiene un constructor el autowire no es necesario
    // https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-spring-beans-and-dependency-injection
    public AccountServiceController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = "/withdraw" , consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> withdrawMoney(@RequestBody Withdraw withdraw) {
        Double newBalance = accountService.getBalance(withdraw);
        String response = "Amount required: " + withdraw.getAmount()
                + " Transaction Date: " + withdraw.getDate()
                + " New Balance: " + newBalance;
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
