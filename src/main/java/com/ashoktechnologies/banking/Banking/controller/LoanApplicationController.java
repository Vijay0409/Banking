package com.ashoktechnologies.banking.Banking.controller;

import com.ashoktechnologies.banking.Banking.entity.CustomerDetails;
import com.ashoktechnologies.banking.Banking.entity.LoanApplicationForm;
import com.ashoktechnologies.banking.Banking.entity.LoansAppliedDetails;
import com.ashoktechnologies.banking.Banking.repository.CustomerDetailsRepository;
import com.ashoktechnologies.banking.Banking.repository.LoanApplicationFormRepository;
import com.ashoktechnologies.banking.Banking.repository.LoanAppliedDetailsRepository;
import com.ashoktechnologies.banking.Banking.service.LoanApplyService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
@RequestMapping("/banking")
@CrossOrigin
public class LoanApplicationController {
    @Autowired
    private LoanApplicationFormRepository loanApplyRepository;

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    public LoanApplicationController(LoanApplicationFormRepository loanApplyRepository, CustomerDetailsRepository customerDetailsRepository) {
        this.loanApplyRepository = loanApplyRepository;
        this.customerDetailsRepository=customerDetailsRepository;
    }
    @RequestMapping(value ="/loan-applied-details", method = RequestMethod.POST)
    public LoanApplicationForm saveLoanApplicationData(@RequestBody LoanApplicationForm loanApply) {
        CustomerDetails customerDetails = customerDetailsRepository.findById(loanApply.getUserId()).orElse(null);
        LoanApplicationForm loanApplicationForm=new LoanApplicationForm();

        Long accountNumber= customerDetails.getAccountNumber();
        int userId=customerDetails.getUserId();

        loanApplicationForm.setUserId(userId);
        loanApplicationForm.setAccountNumber(BigInteger.valueOf(accountNumber));
        loanApplicationForm.setLoanAmount(loanApply.getLoanAmount());
        loanApplicationForm.setSalary(loanApply.getSalary());
        loanApplicationForm.setProfession(loanApply.getProfession());
        loanApplicationForm.setCreditScore(loanApply.getCreditScore());
        loanApplicationForm.setLoadnTerm(loanApply.getLoadnTerm());
        return loanApplyRepository.saveAndFlush(loanApplicationForm);
    }

    public void addingData(){
        //this is testing
    }

    public void testDataAdding(){
        //testing data
    }
}
