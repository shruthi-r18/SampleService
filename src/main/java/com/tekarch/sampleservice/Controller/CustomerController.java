package com.tekarch.sampleservice.Controller;

import com.tekarch.sampleservice.Models.Customer;
import com.tekarch.sampleservice.Services.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }


    @GetMapping("/customer")
    public List<Customer> getCustomer(){
        return customerServiceImpl.getAllCustomer();
    }


    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServiceImpl.addCustomer(customer);
    }
}
