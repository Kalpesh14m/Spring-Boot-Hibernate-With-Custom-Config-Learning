package com.hibernet.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hibernet.demo.model.dto.RegistrationDTO;
import com.hibernet.demo.utils.DateUtility;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "user")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Data
@AllArgsConstructor
public class User {
	@GenericGenerator(name = "userid", strategy = "increment")
	@GeneratedValue(generator = "userid")
	@Id
	private Long id;

	@Column(name = "first_name", nullable = false)
	@Size(min = 3)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	@Size(min = 3)
	private String lastName;

	@Column(name = "email", unique = true, nullable = false)
	@Email
	private String email;

	@Column(name = "password", nullable = false)
	@Size(min = 3)
	private String password;

	@Column(name = "city", nullable = false)
	@Size(min = 3)
	private String city;

	@Column(name = "mobile_number", length = 10, unique = true)
	@NotNull
	private Long mobileNumber;

	@Column(name = "is_verify")
	@NotNull
	private boolean isVerify;

	@Column(name = "is_deleted")
	@NotNull
	private boolean isDeleted;

	@Column(name = "registration_date_time")
	@NotNull
	private LocalDateTime registrationDateTime;

	@Column(name = "update_date_time")
	@NotNull
	private LocalDateTime updateDateTime;

	public User() {
	}

	public User(RegistrationDTO req) {
		this.firstName = req.getFirstName();
		this.lastName = req.getLastName();
		this.email = req.getEmail();
		this.password = req.getPassword();
		this.city = req.getCity();
		this.mobileNumber = req.getMoblieNumber();
		this.isVerify = false;
		this.isDeleted = false;
		this.registrationDateTime = DateUtility.today();
		this.updateDateTime = DateUtility.today();
	}
}
