package com.ashoktechnologies.banking.Banking.repository;

import com.ashoktechnologies.banking.Banking.entity.LoanApplicationForm;
import com.ashoktechnologies.banking.Banking.entity.LoansAppliedDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationFormRepository extends JpaRepository<LoanApplicationForm, Integer> {
}
