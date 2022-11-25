package model;

public class BusBean {
	
	private String busName;
	private String plateNo;
	private String busDriver;
	private String coding;
	
	public BusBean() {
	}
	
	public BusBean(String busName, String plateNo, String busDriver) {
		this.busName = busName;
		this.plateNo = plateNo;
		this.busDriver = busDriver;
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
}
