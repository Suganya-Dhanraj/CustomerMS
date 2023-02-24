package com.customer.management.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;

@Entity
@Table(name = "CUSTOMER")
@Data
public class Customer {

	@Id
	@GenericGenerator(name = "uuid_generator", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator = "uuid_generator")
	@Column(name = "CUSTOMER_ID")
	private UUID customerId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "ADDRESS1")
	private String address1;
	@Column(name = "ADDRESS2")
	private String address2;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "PAN_CARD")
	private String panCard;
	@Column(name = "AADHAR")
	private String aadhar;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "GENDER")
	private String gender;
	@CreatedDate
    @Column(name = "RECORD_CREATION_DATE", nullable = false)
    private LocalDateTime recordCreationDate;
	@Column(name = "RECORD_UPDATED_DATE")
    private LocalDateTime recordUpdatedDate;
	

}
