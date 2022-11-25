package payroll.action;

import com.opensymphony.xwork2.ActionSupport;

public class ComputePayrollAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	//Input Instance Variables
	private String name;
	private double hoursWorked;
	private double ratePerHour;
	
	//Computed Instance Variables
	private double basicPay;
	private double overtimePay;
	private double grossPay;
	private double tax;
	private double netPay;
	
	//Execute as required by the ActionClass
	public String execute() {
		
		String status = ERROR;
		
		if(this.name.trim().length() != 0 && this.hoursWorked > 0 && this.ratePerHour > 0) {
				
			this.computeBasicPayment();
			this.computeOvertimePayment();
			this.computeGrossPayment();
			this.computeTax();
			this.computeNetPayment();
			
			System.out.println("Employee Name: " + this.name);
			System.out.println("Hours Worked: " + this.hoursWorked);
			System.out.println("Rate per Hour: Php" + this.ratePerHour);
			System.out.println("Basic Pay: Php" + this.basicPay);
			System.out.println("Overtime Pay: Php" + this.overtimePay);
			System.out.println("Gross Pay: Php" + this.grossPay);
			System.out.println("Withholding Tax: Php" + this.tax);
			System.out.println("Net Pay: Php" + this.netPay);
			
			status = SUCCESS;
				
			}
		return status;
	}
	
	//Setter and Getter Methods
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
	
	//Business Logic Methods
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
