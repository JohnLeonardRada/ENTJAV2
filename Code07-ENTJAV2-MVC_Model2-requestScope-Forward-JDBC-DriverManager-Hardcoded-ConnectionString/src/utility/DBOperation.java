package utility;

public interface DBOperation {
	
	String INSERT_RECORD = "insert into student (studentId, name, midterm, "
		+ "preFinal, finalGrade, remarks) values (?,?,?,?,?,?)";

}
