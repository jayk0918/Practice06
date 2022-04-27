package com.javaex.ex03;

public class Shape {
	
	// 필드
	protected String fillColor;	// 자식 클래스 Triangle에서 필드값을 허용해주기 위해 private을 protected으로 완화적용
	protected String lineColor;
	
	// 생성자
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		super();
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 gs
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	
}

