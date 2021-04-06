package com.godxvincent.spring5learning.services.impl;

import com.godxvincent.spring5learning.models.Withdraw;
import com.godxvincent.spring5learning.services.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final Double currentBalance = 1000000d;

    @Override
    public Double getBalance(Withdraw withdraw) {
        if (withdraw.getAmount() < currentBalance) {
            return currentBalance - withdraw.getAmount();
        } else {
            return 0d;
        }
    }
}
