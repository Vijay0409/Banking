package com.ashoktechnologies.banking.Banking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@Table(name = "loans")
public class LoansAppliedDetails {
    @Id
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "accountNumber")
    private BigInteger accountNumber;

    private BigInteger amountLoan;

    private Date maturityDate;

    private Integer EMIAmount;

    private Integer interstRate;
    private BigInteger monthlyAmount;

    private BigInteger dueAmount;
    private Date lastPaidDate;

    private BigInteger loanTerm;


}
