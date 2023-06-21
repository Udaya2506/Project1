package com.example.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	@NotEmpty(message = "UserName is Mandatory")
	@Size(min = 4 ,max =12 ,message = "UserNmae shld be in 4 to 12 characters")
	private String userName;
	
	@NotEmpty(message = "userEmail is Mandatory")
	@Email(message = "Email is required")
	private String userEmail;
	
	@NotEmpty(message = "UserName is Mandatory")
	private String userPassword;
	
	@NotNull(message = "UserName is Mandatory")
	@Min(value = 5 , message = "minimum value is 5")
	private Integer userAge;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword
				+ ", userAge=" + userAge + "]";
	}
	
	

}
