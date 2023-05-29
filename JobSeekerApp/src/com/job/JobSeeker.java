package com.job;

import java.time.LocalDate;

public class JobSeeker implements Comparable<JobSeeker> {
	private int id;
	private String name;
	private String email;
	private String password;
	private LocalDate doB;
	private String addharId;
	private String mobileNo;
	private LocalDate grDate;
	private Degree degree;
	
	public JobSeeker() {
		super();
	}

	public JobSeeker(int id, String name, String email, String password, LocalDate doB, String addharId,
			String mobileNo, LocalDate grDate, Degree degree) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.doB = doB;
		this.addharId = addharId;
		this.mobileNo = mobileNo;
		this.grDate = grDate;
		this.degree = degree;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDoB() {
		return doB;
	}

	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}

	public String getAddharId() {
		return addharId;
	}

	public void setAddharId(String addharId) {
		this.addharId = addharId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getGrDate() {
		return grDate;
	}

	public void setGrDate(LocalDate grDate) {
		this.grDate = grDate;
	}

	public Degree getDegree() {
		return degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	
	@Override
	public int compareTo(JobSeeker o) {
		return this.email.compareTo(o.email); // ASC
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals called");
		if( obj instanceof JobSeeker) {
			JobSeeker other = (JobSeeker) obj;
			return this.getEmail() == other.getEmail();
		} 
		return false;
	}

	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", doB=" + doB
				+ ", addharId=" + addharId + ", mobileNo=" + mobileNo + ", grDate=" + grDate + ", degree=" + degree
				+ "]";
	}

	
	
}
