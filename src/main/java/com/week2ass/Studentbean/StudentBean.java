package com.week2ass.Studentbean;

import org.springframework.stereotype.Component;

@Component("stubean")
public class StudentBean {
	private int stuId;
	
	private String stuName;
	StudentBean(){
		
	}
	public StudentBean(int stuId, String stuName) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [stuId=" + stuId + ", name=" + stuName + "]";

	}

}
