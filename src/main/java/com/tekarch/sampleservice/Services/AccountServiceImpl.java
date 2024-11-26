package com.tekarch.sampleservice.Services;

import com.tekarch.sampleservice.Models.Account;
import com.tekarch.sampleservice.Repositories.AccountRepository;
import com.tekarch.sampleservice.Services.Interfaces.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public Account addAccount(Account account) {
        return  accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
