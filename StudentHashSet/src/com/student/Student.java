package com.student;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public  class Student implements Comparable<Student> {

	private Integer id;
	private String name;
	private Course course;
	private LocalDate doB;
	private List<Address> addressList;
	
	public Student() {
		super();
	}
	
	public Student(Integer id, String name, Course course, LocalDate doB, List<Address> addressList) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.doB = doB;
		this.addressList = addressList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getDoB() {
		return doB;
	}

	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}
	
	
	public List<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}


	public void addAddress(Address address) {
		System.out.println("In function");
		if(null == addressList) {
			this.addressList = new LinkedList<Address>();
		}
		this.addressList.add(address);
	}

	@Override
	public int compareTo(Student o) {
		return this.id.compareTo(o.id);
	}
	
	
	@Override
	public int hashCode() {
		int result = 1;
		result = result * 31 + this.id.hashCode();
		result = result * 31 + this.name.hashCode();
		System.out.println("Student id: "+id+"Hash: "+result);
		return result;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals Called"+ this.id);
		
		if( null == obj) {
			return false;
		}
		if( this.getClass() != obj.getClass()) {
			return false;
		}
		if( this == obj) {
			return true;
		}
		Student s = (Student)obj;
		return (this.id.equals(s.getId()) &&
				this.name.equals(s.getName()));
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", doB=" + doB + ", addressList="
				+ addressList + "]";
	}
	

	
	
	
	
}
