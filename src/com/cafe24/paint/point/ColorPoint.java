package com.cafe24.paint.point;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint(int x,int y,String color) {
		super(x,y); //부모생성자를 호출
		this.color = color;
	}
	@Override
	public void show() {
		System.out.println("점("+super.x+","+y+")에 "+color+ "색 점을 찍었습니다.");
	}
}
