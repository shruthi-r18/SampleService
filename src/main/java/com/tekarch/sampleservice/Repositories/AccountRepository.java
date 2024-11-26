package com.tekarch.sampleservice.Repositories;

import com.tekarch.sampleservice.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
