package com.iiht.training.eloan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="loan_nusr")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="firstName")
	@NotNull(message="firstName is mandatory")
	@NotBlank(message="firstName can not be null")
	@Size(min=3,max=100,message="firstName must be 4 to 50 chars in length")
	private String firstName;
	@Column(name="lastName")
	@NotNull(message="lastName is mandatory")
	@NotBlank(message="lastName can not be null")
	@Size(min=3,max=100,message="lastName must be 4 to 50 chars in length")
	private String lastName;
	@Column(name="email")
	@NotNull(message="Mail Id is mandate")
	@NotBlank(message="Mail Id is mandate")
	@Email(message = "Email Id is not valied")
	private String email;
	@Column(name="mobile")
	@NotNull(message="Mobile number is mandate")
	@NotBlank(message="Mobile number is mandate")
	@Pattern(regexp = "[1-9][0-9]{9}",message = "Mobile number must be exactly ten digits")
	private String mobile;
	@Column(name="role")
	private String role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
