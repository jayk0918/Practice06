package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		// 생성자 확인목적이므로 별도의 출력물 구성은 하지 않았음
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		// 예상 : shape 적용, shape(2) 실행 멘트 출력될 것임
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		// 예상 : triangle은 shape의 자식클래스
		// 기본형 생성자에는 super();가 생략된 상태로 구성됨
		// 따라서 shape(0) + triangle(0)이 출력될 것임
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		// 예상 : triangle(2)에 부합한 생성자 조건식임
		// 더하여 super 인자에 shape(2)에 해당하는 String값을 정의하였음
		// shape(2) + triangle(2)가 출력될 것임
		
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		// 예상 : 일명 '섞어쓰기', Shape와 Triangle을 혼용하였음
		// Shape의 형태를 띄고 있으나 자식인 Triangle에서 정의된 triangle(4)가 override할 것임
		// 한가지 놓친 점 : override까지는 예상했는데 shape2도 나온다는 걸 간과함
		// 어찌되었든 Shape에서 String값에 맞는 생성자를 찾을 것이고, 이후 자식 클래스에서 정의된 생성자를 찾아 override하는 것
	}

}

