package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] users = new User[3];
		
		User customer01 = new Customer("jws", "j1234", "정우성", 1000);
		User customer02 = new Customer("yjs", "y2345", "이효리", 2000);
		User employee01 = new Employee("master", "m7788", "운영자", 5000000);
		
		users[0] = customer01;
		users[1] = customer02;
		users[2] = employee01;
		
		for(int i=0; i<users.length; i++) {
			users[i].showInfo();
		}
	}

}
