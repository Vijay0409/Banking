package com.ashoktechnologies.banking.Banking.repository;

import com.ashoktechnologies.banking.Banking.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer> {

}
