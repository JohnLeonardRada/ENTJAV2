package payroll.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import payroll.model.PayrollBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ComputePayrollAction extends ActionSupport 
	implements ModelDriven <PayrollBean> {
	
	//create a has-a object relationship
	private PayrollBean payroll = new PayrollBean();
	
	///////////////
	//execute as required by the ActionClass
	public String execute() {
		
		payroll.process();
		
		SessionFactory sessionFactory = 
			new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(payroll);
		session.getTransaction().commit();
			
		System.out.println("Employee Name: " + payroll.getName());
		System.out.println("Hours Worked: " + payroll.getHoursWorked());
		System.out.println("Rate per Hour: Php" + payroll.getRatePerHour());
		System.out.println("Basic Pay: Php" + payroll.getBasicPay());
		System.out.println("Overtime Pay: Php" + payroll.getOvertimePay());
		System.out.println("Gross Pay: Php" + payroll.getGrossPay());
		System.out.println("Withholding Tax: Php" + payroll.getTax());
		System.out.println("Net Pay: Php" + payroll.getNetPay());
			 
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		if (payroll.getName().trim().length() == 0 ) {
			addFieldError("name", "Invalid name");
		}
		
		if (payroll.getHoursWorked() < 0) {
			addFieldError("hoursWorked", "Must be positive value");
		}
		
		if (payroll.getRatePerHour() <= 0) {
			addFieldError("ratePerHour", "Must be positive value");
		}
	}

	public PayrollBean getPayroll() {
		return payroll;
	}

	public void setPayroll(PayrollBean payroll) {
		this.payroll = payroll;
	}

	@Override
	public PayrollBean getModel() {
		return payroll;
	}
}
