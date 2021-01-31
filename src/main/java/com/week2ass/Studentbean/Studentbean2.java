package com.week2ass.Studentbean;

import org.springframework.stereotype.Component;

@Component("studentbean2")
public class Studentbean2 {
	private int id;
	 private String name;
	 private AddressBean a;
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
	public AddressBean getA() {
		return a;
	}
	public void setA(AddressBean a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", a=" + a + "]";
	}
	public Studentbean2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Studentbean2(int id, String name, AddressBean a) {
		super();
		this.id = id;
		this.name = name;
		this.a = a;
	}

}
