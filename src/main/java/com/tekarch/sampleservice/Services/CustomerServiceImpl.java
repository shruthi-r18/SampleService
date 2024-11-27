package com.tekarch.sampleservice.Services;

import com.tekarch.sampleservice.Models.Customer;
import com.tekarch.sampleservice.Repositories.CustomerRepository;
import com.tekarch.sampleservice.Services.Interfaces.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private static final Logger logger = LogManager.getLogger(CustomerServiceImpl.class);
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAllCustomer() {
        logger.info("Display all customer");
        return customerRepository.findAll();

    }

    @Override
    public Customer addCustomer(Customer customer) {
        logger.info("add new  customer");
        return customerRepository.save(customer);
    }
}
