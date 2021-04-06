package com.godxvincent.spring5learning.services.impl;

import com.godxvincent.spring5learning.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final Double currentBalance = 1000000d;

    @Override
    public Double getBalance(Double withdraw) {
        if (withdraw < currentBalance) {
            return currentBalance - withdraw;
        } else {
            return 0d;
        }
    }
}
