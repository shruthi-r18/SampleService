package com.tekarch.sampleservice.Services.Interfaces;

import com.tekarch.sampleservice.Models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();
    Customer addCustomer(Customer customer);
}
