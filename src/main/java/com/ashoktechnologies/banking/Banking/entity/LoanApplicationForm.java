package com.ashoktechnologies.banking.Banking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
@Table(name = "loan_apply")
public class LoanApplicationForm {
    @Id
    @Column(name = "USER_ID")
    private int userId;
    private BigInteger salary;
    private String profession;
    private BigInteger loanAmount;
    private BigInteger creditScore;
    private BigInteger loadnTerm;
    @Column(name = "accountNumber")
    private BigInteger accountNumber;
}
