package com.sesoc.web2;

public class Person {
	String name;
	String phone;
	String com;
	
	//기본생성자 필수 public Person(){} 생성자를 쓰려면 빈거를 무조건 만들어야해
	public Person() {
	
	}


	//getter, setter 필수
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getCom() {
		return com;
	}


	public void setCom(String com) {
		this.com = com;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", com=" + com + "]";
	}

	

}