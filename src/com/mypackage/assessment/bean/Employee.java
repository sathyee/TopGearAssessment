package com.mypackage.assessment.bean;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private String address;
	private double sal;
	
	public Employee(int id, String name, String address, double sal) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.sal = sal;
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
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getSal() {
		return sal;
	}
	
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public int compareTo(Employee e2) {
		if(this.sal < e2.sal) {
			return -1;
		} else if(this.sal > e2.sal) {
			return 1;
		}
		return 0;
	}
	
	public String toString() {
		return "Employee - id: " + id + ", name : " + name + ", address : " + address + "; sal : " + sal;
	}
}
