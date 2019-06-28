package com.app.list_set;

public class HashCollection 
{
	private String name;
	private String place;
	private int age;
	private double salary;
	
	public HashCollection()
	{
		this.name = null;
		this.place = null;
		this.age = 0;
		this.salary = 0;
	}
	
	public HashCollection(String name, String place, int age, double salary) 
	{
		super();
		this.name = name;
		this.place = place;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
