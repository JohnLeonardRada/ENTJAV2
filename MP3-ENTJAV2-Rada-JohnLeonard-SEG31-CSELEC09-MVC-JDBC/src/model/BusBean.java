package model;

import java.sql.*;

import javax.sql.*;

import utility.DBOperation;

import javax.naming.*;

public class BusBean implements DBOperation {
	
	private String id;
	private String busName;
	private String plateNo;
	private String busDriver;
	private String coding;
	
	public BusBean() {
	}
	
	public BusBean(String id, String busName, String plateNo, String busDriver) {
		this.id = id;
		this.busName = busName;
		this.plateNo = plateNo;
		this.busDriver = busDriver;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getBusDriver() {
		return busDriver;
	}
	public void setBusDriver(String busDriver) {
		this.busDriver = busDriver;
	}
	
	public String getCoding() {
		return coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public void busCoding() {
		if (plateNo.endsWith("1")) {
			this.coding = "Monday";
		}else if (plateNo.endsWith("2")) {
			this.coding = "Monday"; 
		} else if (plateNo.endsWith("3")) {
			this.coding = "Tuesday";
		} else if (plateNo.endsWith("4")) {
			this.coding = "Tuesday";
		}else if (plateNo.endsWith("5")) {
			this.coding = "Wednesday";
		}else if (plateNo.endsWith("6")) {
			this.coding = "Wednesday";
		}else if (plateNo.endsWith("7")) {
			this.coding = "Thursday";
		}else if (plateNo.endsWith("8")) {
			this.coding = "Thursday";
		}else if (plateNo.endsWith("9")) {
			this.coding = "Friday";
		}else if (plateNo.endsWith("0")) {
			this.coding = "Friday";
		}
	}
	
	private Connection getConnection()  {
		Connection connection = null;
		
		//Context initContext;
		try {
			/*initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/SEG31_DS");
			connection = ds.getConnection();*/
			
			connection = ((DataSource)InitialContext.doLookup("java:/comp/env/jdbc/SEG31_DS"))
				.getConnection();
			
		} catch (NamingException e) {
			e.printStackTrace();
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
				connection.setAutoCommit(false); //start of transaction
				
				PreparedStatement pstmntCreate = connection.prepareStatement(CREATE_TABLE);
				pstmntCreate.executeUpdate();
				
				PreparedStatement pstmnt = connection.prepareStatement(INSERT_RECORD);
				
				pstmnt.setString(1, this.busName);
				pstmnt.setString(2, this.plateNo);
				pstmnt.setString(3, this.busDriver);
				pstmnt.setString(4, this.coding);
				
				pstmnt.executeUpdate();
				connection.commit();
				isSuccessful = true;
			} catch (SQLException sqle) {
				try {
					connection.rollback();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				sqle.printStackTrace();
			}
		} 
		return isSuccessful;
	}
	
	public ResultSet getAllRecords() {
		ResultSet records = null;
		Connection connection = getConnection();
		
		if (connection != null) {
			try {
				PreparedStatement pstmnt = connection.prepareStatement(GET_ALL_RECORDS);
				
				records = pstmnt.executeQuery();
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		} 
		return records;
	}
}
