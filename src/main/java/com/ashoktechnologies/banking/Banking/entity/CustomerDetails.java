package com.ashoktechnologies.banking.Banking.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;

@Entity
@Data
@Table(name = "CustomerDetails", schema = "BankingData")
public class CustomerDetails {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int userId;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "customerAddressOne")
    private String customerAddressOne;
    @Column(name = "customerAddressTwo")
    private String customerAddressTwo;
    @Column(name = "state")
    private String state;
    @Column(name = "city")
    private String city;
    @Column(name = "account_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_generator")
    @SequenceGenerator(name = "seq_generator", sequenceName = "account_number", initialValue = 100, allocationSize = 1)
    private Long accountNumber;
    @Column(name = "zipCode")
    private BigInteger zipCode;
    @Column(name = "phoneNumber ")
    private BigInteger phoneNumber;

}
