package com.capg.onlinewallet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Onlinewallet_Spring")
public class OnlineWallet {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)

	private int customerId;

	/*@NotBlank(message="Customer Name cannot be blank")
	@NotNull(message = "Customer Password is Mandatory field. Please provide customer Password")
	@Pattern(regexp="^[A-Za-z ]*$")*/
	private String customerPassword;

	/*@NotEmpty(message = "Customer Name is mandatory field and it must be only alphabets. So please provide customer name")
	@NotBlank(message = "Customer Name cannot be blank")
	@Size(min = 2, max = 10, message = "Length of the name must be between 2-10 letters")
 @Pattern(regexp = "^[A-Za-z ]*$")*/
	private String customerName;

	/*@NotNull(message = "Account Balance should not be null")
	 @Min(value=1,message="Account Balance cannot be less than 1")
	 @Max(value=3,message="screenId cannot be greater than 3")*/
	private int accountBalance;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

}
