package com.spring.orm;


import jakarta.persistence.*;


//@Entity(name = "abc")  //table name or @Table(name="students")
@Entity  //create autometic class name table
@Table(name="pp")
public class Student {
	@Id    /// for making primary key
	@Column(name = "student_id")
	private int studentId;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_city")
	private String studentCity;
	
public Student() {
	// TODO Auto-generated constructor stub
}
	public Student(int studentId, String studentName, String studentCity) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}

}
