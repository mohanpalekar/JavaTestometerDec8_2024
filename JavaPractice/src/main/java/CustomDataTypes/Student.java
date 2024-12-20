package CustomDataTypes;

import java.util.Arrays;

public class Student {

	/*
	 * name - String
	 * rollNo - String
	 * subjects - String []
	 * class - String
	 */
	
	private String name;

	private String rollNo;

	private String className;

	private String [] subjects;

	

	//constructor in java
	public Student(String name, String rollNo, String className, String [] subjects) {
		this.name = name;
		this.rollNo = rollNo;
		this.className = className;
		this.subjects= subjects;
	}
	
	//getter - returns value to the user or console
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", className=" + className + ", subjects="
				+ Arrays.toString(subjects) + "]";
	}





}
