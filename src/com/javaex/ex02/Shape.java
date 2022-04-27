package com.javaex.ex02;

public class Shape {
	
	// 부모 패키지
	
	// 필드
	private String fillColor;
	private String lineColor;
	
	// 생성자
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		System.out.println("생성자 Shape(2) 실행");
	}
	
	// 메소드 gs(경고 삭제용)
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	
	
	
	
}

