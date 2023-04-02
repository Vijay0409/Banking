package com.ashoktechnologies.banking.Banking;

import com.ashoktechnologies.banking.Banking.controller.CustomerDetailsController;
import com.ashoktechnologies.banking.Banking.entity.CustomerDetails;
import com.ashoktechnologies.banking.Banking.repository.CustomerDetailsRepository;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)

class BankingApplicationTests {
	@Mock
	private CustomerDetailsRepository customerDetailsRepository;

	@InjectMocks
	private CustomerDetailsController customerDetailsController;

	@Test
	public void testSaveCustomerData() {
		// create a mock CustomerDetails object
		CustomerDetails customerDetails = new CustomerDetails();
		customerDetails.setUserId(20);
		customerDetails.setCustomerName("Vijay Kumar Reddy");
		customerDetails.setCustomerAddressOne("Manchi neela bavi");
		customerDetails.setCustomerAddressTwo("Hyderabad");
		customerDetails.setState("Telangana");
		customerDetails.setCity("HYD");
		customerDetails.setAccountNumber(Long.valueOf(1234567890));
		customerDetails.setZipCode(BigInteger.valueOf(586999));
		customerDetails.setPhoneNumber(BigInteger.valueOf(963258741));


		// configure the mock repository to return the same CustomerDetails object
		Mockito.when(customerDetailsRepository.saveAndFlush(Mockito.any(CustomerDetails.class)))
				.thenReturn(customerDetails);

		// call the controller method with the mock CustomerDetails object
		CustomerDetails result = customerDetailsController.saveCustomerData(customerDetails);

		// verify that the saveAndFlush() method was called with the same CustomerDetails object
		Mockito.verify(customerDetailsRepository, Mockito.times(1)).saveAndFlush(customerDetails);

		// verify that the returned CustomerDetails object is the same as the mock object
		Assert.assertEquals(customerDetails, result);
	}

}
