package bank.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import bank.model.BankBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ComputeBankAction extends ActionSupport 
	implements ModelDriven <BankBean> {
	
	//create a has-a object relationship
	private BankBean bank = new BankBean();
	
	///////////////
	//execute as required by the ActionClass
	public String execute() {
		
		bank.process();
		
		SessionFactory sessionFactory = 
			new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(bank);
		session.getTransaction().commit();
			
		System.out.println("Employee Name: " + bank.getName());
		System.out.println("Account Type:" + bank.getAccountType());
		System.out.println("Account Balance: Php" + bank.getAccountBalance());
		
		return SUCCESS;
	}
	
	public BankBean getBank() {
		return bank;
	}

	public void setBank(BankBean bank) {
		this.bank = bank;
	}

	@Override
	public BankBean getModel() {
		return bank;
	}
}
