package utility;

public interface DBOperation {
	
	String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS vehiclecoding "
            + "(id int(11) NOT NULL AUTO_INCREMENT,"
            + "busName varchar(150) NOT NULL,"
            + "plateNumber varchar(10) NOT NULL,"
            + "driver varchar(150) NOT NULL,"
            + "codingDayAssigned varchar(15) NOT NULL, "
            + "PRIMARY KEY (id))";
	
	String INSERT_RECORD = "insert into vehiclecoding (busName, plateNumber, driver, "
			+ "codingDayAssigned) values (?,?,?,?)";
	
	String GET_ALL_RECORDS = "select * from vehiclecoding";
	
}
