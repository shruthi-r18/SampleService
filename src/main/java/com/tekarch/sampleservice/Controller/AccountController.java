package com.tekarch.sampleservice.Controller;

import com.tekarch.sampleservice.Models.Account;
import com.tekarch.sampleservice.Services.AccountServiceImpl;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Repository
public class AccountController {

    private final AccountServiceImpl accountServiceImpl;

    public AccountController(AccountServiceImpl accountServiceImpl) {
        this.accountServiceImpl = accountServiceImpl;
    }

    @GetMapping("/account")
    public List<Account> getAccount(){
        return accountServiceImpl.getAllAccounts();
    }


    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account){
        return accountServiceImpl.addAccount(account);
    }
}
