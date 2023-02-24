package com.customer.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.management.dto.CustomerDto;
import com.customer.management.service.CustomerManagementService;

/*
 * CustomerManagementController to Manage Customer Create/Read/Update/Delete operations
 * @Author Suganya 
 * @Version 0.1
 */
@Controller
public class CustomerManagementController {
	
	@Autowired
	private CustomerManagementService customerMS;
	
	@PostMapping("/addCustomer")
	public ResponseEntity<String> addCustomer(@RequestBody CustomerDto customerDto){
		
		//Validate Input Date
				
		return null;				
	}
	
	
	

}
