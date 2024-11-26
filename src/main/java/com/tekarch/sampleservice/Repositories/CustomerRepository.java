package com.tekarch.sampleservice.Repositories;

import com.tekarch.sampleservice.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CustomerRepository extends JpaRepository<Customer,Long>{


}
