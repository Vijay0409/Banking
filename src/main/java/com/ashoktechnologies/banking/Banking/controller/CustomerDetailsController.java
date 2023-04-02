package com.ashoktechnologies.banking.Banking.controller;

import com.ashoktechnologies.banking.Banking.entity.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ashoktechnologies.banking.Banking.repository.CustomerDetailsRepository;

@RestController
@RequestMapping("/banking")
@CrossOrigin
public class CustomerDetailsController {
    private CustomerDetailsRepository customerDetailsRepository;
    @Autowired
    public CustomerDetailsController(CustomerDetailsRepository customerDetailsRepository) {
        this.customerDetailsRepository = customerDetailsRepository;

    }
    @RequestMapping(value ="/customer-details", method = RequestMethod.POST)
    public CustomerDetails saveCustomerData(@RequestBody CustomerDetails customerDetails) {
        return customerDetailsRepository.saveAndFlush(customerDetails);

    }
    public void finalTestingMethod(){
        // comment testing fit
        //yes this is from vijay branch
    }
}
