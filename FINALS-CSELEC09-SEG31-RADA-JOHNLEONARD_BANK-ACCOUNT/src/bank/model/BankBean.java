package bank.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity (name="bankcustomeraccount")
public class BankBean {

	//input instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; //will act as the primary key to the database
	private String name;
	private String accountType;
	private String message;
	private double accountBalance;
	
	//computed instance variables
	private double newBalance;
	
	//setter and getter methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(double newBalance) {
		this.newBalance = newBalance;
	}
	////////////////////
	//business logic methods
	public void process() {
		this.computeNewBalance();
	}	
	
	private void computeNewBalance() {
		if(this.accountType.equals("Savings Account")) {
			if(this.accountBalance < 2000){
				this.newBalance = this.accountBalance - 200;
				this.message = "Balance is below the minimum of Php2000. The deduction is Php200. Your new balance is: " + this.newBalance;
			} else {
				this.message = "You do not have any deductions";
			}
			
		} else if(this.accountType.equals("Current Account")) {
			if(this.accountBalance < 5000) {
				this.newBalance = this.accountBalance - 500;
				this.message = "Balance is below the minimum of Php5000. The deduction is Php500. Your new balance is: " + this.newBalance;
			} else {
				this.message = "You do not have any deductions";
			}
		}
	}

}
