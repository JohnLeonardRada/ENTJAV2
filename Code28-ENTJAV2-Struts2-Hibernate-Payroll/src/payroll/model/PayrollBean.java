package payroll.model;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity (name="employeesalary")
public class PayrollBean {

	//input instance variables
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; //will act as the primary key to the database
	private String name;
	private double hoursWorked;
	private double ratePerHour;
	
	//computed instance variables
	private double basicPay;
	private double overtimePay;
	private double grossPay;
	private double tax;
	private double netPay;
	
	//setter and getter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double getRatePerHour() {
		return ratePerHour;
	}
	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getOvertimePay() {
		return overtimePay;
	}
	public void setOvertimePay(double overtimePay) {
		this.overtimePay = overtimePay;
	}
	public double getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getNetPay() {
		return netPay;
	}
	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	////////////////////
	//business logic methods
	public void process() {
		this.computeBasicPayment();
		this.computeOvertimePayment();
		this.computeGrossPayment();
		this.computeTax();
		this.computeNetPayment();
	}	
	
	private void computeBasicPayment() {
		this.basicPay = (this.hoursWorked > 40)
			? 40 * this.ratePerHour
			: this.hoursWorked * this.ratePerHour; 		
	}
	
	private void computeOvertimePayment() {
		this.overtimePay = (this.hoursWorked > 40)
			? (this.hoursWorked - 40) * this.ratePerHour * 1.5
			: 0;		
	}
	
	private void computeGrossPayment() {
		this.grossPay = this.basicPay + this.overtimePay;
	}
	
	private void computeTax() {
		this.tax = this.grossPay * 0.1;
	}
	
	private void computeNetPayment() {
		this.netPay = this.grossPay - this.tax;
	}
}
