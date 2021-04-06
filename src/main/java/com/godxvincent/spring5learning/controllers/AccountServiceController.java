package com.godxvincent.spring5learning.controllers;


import com.godxvincent.spring5learning.models.ATM;
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


    public AccountServiceController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping(value = "/withdraw" , consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> withdrawMoney(@RequestBody ATM atm) {

        return new ResponseEntity<String>("Everything was ok"+atm.getMoney(), HttpStatus.OK);
    }
}
