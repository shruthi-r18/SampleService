package com.tekarch.sampleservice.Services.Interfaces;

import com.tekarch.sampleservice.Models.Account;

import java.util.List;

public interface AccountService {
    Account addAccount( Account account);
    List<Account> getAllAccounts();
}
