package com.grade_book_register;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Student {


	
	 @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long number;
	private String firstName;
	private String lastName;
	private String grades;
	

	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGrades()
	{
		return grades;
	}
	
	 
	    
	    
	
}
