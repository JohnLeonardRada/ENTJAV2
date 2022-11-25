package model;

import java.io.Serializable;

public class StudentBean implements Serializable {
	private String name;
	private String course;
	private String yearLevel;
	
	public StudentBean() {
	}
	
	public StudentBean(String name, String course, String yearLevel) {
		this.name = name;
		this.course = course;
		this.yearLevel = yearLevel;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(String yearLevel) {
		this.yearLevel = yearLevel;
	}
	
}
