package com.ashoktechnologies.banking.Banking.controller;

import com.ashoktechnologies.banking.Banking.entity.LoanApplicationForm;
import com.ashoktechnologies.banking.Banking.entity.LoansAppliedDetails;
import com.ashoktechnologies.banking.Banking.repository.LoanAppliedDetailsRepository;
import com.ashoktechnologies.banking.Banking.service.LoanApplyService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/banking")
@CrossOrigin
public class LoanAppliedDetailsController {
    @Autowired
    private LoanApplyService loanApplyService;
    @Autowired
    public LoanAppliedDetailsController(LoanApplyService loanApplyService) {
        this.loanApplyService = loanApplyService;
    }
    @RequestMapping(value ="/{userID}/get-loan-details", method = RequestMethod.GET)
    public LoansAppliedDetails saveLoanApplicationData(@PathVariable("userID") int userId) {
        System.out.println("Application started");

        LoansAppliedDetails loansAppliedDetailsData = loanApplyService.laonDetails(userId);

        return loansAppliedDetailsData;
    }


}
