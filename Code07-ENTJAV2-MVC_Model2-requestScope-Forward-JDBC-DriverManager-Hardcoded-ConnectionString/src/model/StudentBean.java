package model;

import java.sql.*;

import utility.DBOperation;

public class StudentBean implements DBOperation {

	//Create Instance Variables.
	//Input Values From The User.
	private String id;
	private String name;
	private double midterm;
	private double preFinal;
	
	//Computed Values.
	private double finalGrade;
	private String remarks;
	
	//Create Default Constructor.
	public StudentBean() {
	}
	
	//Create Parameterized Constructor.
	public StudentBean(String id, String name, double midterm, double preFinal) {
		this.id = id;
		this.name = name;
		this.midterm = midterm;
		this.preFinal = preFinal;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMidterm() {
		return midterm;
	}

	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}

	public double getPreFinal() {
		return preFinal;
	}

	public void setPreFinal(double preFinal) {
		this.preFinal = preFinal;
	}

	public double getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(double finalGrade) {
		this.finalGrade = finalGrade;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void computeFinalGrade() {
		this.finalGrade = this.midterm * 0.5 + this.preFinal * 0.5;
	}
	
	public void determineRemarks() {
		this.remarks = (this.finalGrade >= 60)
			? "Congratulations you passed."
			: "You have to re-enroll this subject next term.";		
	}
	
	
	/////////////////////////////////////////
	/////////////JDBC Operations/////////////
	/////////////////////////////////////////
	private Connection getConnection() {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/seg31-cselec09_db",
				"root","");
		} catch (ClassNotFoundException cfne) {
			cfne.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return connection;
	}
	
	public boolean isRecordInserted() {
		boolean isSuccessful = false;
		Connection connection = getConnection();
		
		if (connection != null) {
			try {
				PreparedStatement pstmnt = connection.prepareStatement(INSERT_RECORD);
				
				pstmnt.setString(1, this.id);
				pstmnt.setString(2, this.name);
				pstmnt.setDouble(3, this.midterm);
				pstmnt.setDouble(4, this.preFinal);
				pstmnt.setDouble(5, this.finalGrade);
				pstmnt.setString(6, this.remarks);
				
				pstmnt.executeUpdate();
				isSuccessful = true;
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		} 
		return isSuccessful;
	}
}
