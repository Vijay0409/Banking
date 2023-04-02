package com.ashoktechnologies.banking.Banking.service;

import com.ashoktechnologies.banking.Banking.entity.CustomerDetails;
import com.ashoktechnologies.banking.Banking.entity.LoanApplicationForm;
import com.ashoktechnologies.banking.Banking.entity.LoansAppliedDetails;
import com.ashoktechnologies.banking.Banking.repository.CustomerDetailsRepository;
import com.ashoktechnologies.banking.Banking.repository.LoanAppliedDetailsRepository;
import com.ashoktechnologies.banking.Banking.repository.LoanApplicationFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;

@Service
public class LoanApplyServiceImp implements LoanApplyService {

    @Autowired
    CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    LoanAppliedDetailsRepository loanAppliedDetailsRepository;

    @Autowired
    LoanApplicationFormRepository loanApplicationFormRepository;

    @Override
    public LoansAppliedDetails laonDetails(int userId) {

        CustomerDetails customerDetails = customerDetailsRepository.findById(userId).orElse(null);
//        String customerNAme = customerDetails.getCustomerName();
       // BigInteger accountNumber = customerDetails.getAccountNumber();
        LoanApplicationForm loanApply = loanApplicationFormRepository.findById(userId).orElse(null);

        LoansAppliedDetails loansAppliedDetails =new LoansAppliedDetails();
//        BigInteger loanAmount = loanApply.getLoanAmount();
//        BigInteger creditScore= loanApply.getCreditScore();
//        BigInteger loanTerm = loanApply.getLoadnTerm();
        loansAppliedDetails.setAmountLoan(loanApply.getLoanAmount());
        loansAppliedDetails.setUserId(userId);
        loansAppliedDetails.setLoanTerm(loanApply.getLoadnTerm());
        loansAppliedDetails.setAccountNumber(loanApply.getAccountNumber());

        loanAppliedDetailsRepository.save(loansAppliedDetails);

        return loansAppliedDetails;
    }
}
