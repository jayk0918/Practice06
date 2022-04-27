package com.javaex.ex04;

public class Employee extends User{
	// 자식 클래스
	
	// 필드
	private int salary;
	
	// 생성자
	public Employee() {
		super();
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	// 메소드 gs
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 메소드 일반
	public void showInfo() {
		System.out.println("#아이디:" + super.id + ", #패스워드:" + super.password + ", #이름:" + super.name + ", #월급: " + this.salary);
		if(name == "운영자") {
			System.out.println("운영자의 월급은 " + salary + "원 입니다.");
		}
	}
	
	
	
	
	

	
}
