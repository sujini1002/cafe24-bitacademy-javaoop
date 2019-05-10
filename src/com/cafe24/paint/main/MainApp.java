package com.cafe24.paint.main;

import com.cafe24.paint.graphics.GraphicString;
import com.cafe24.paint.i.Drawable;
import com.cafe24.paint.point.ColorPoint;
import com.cafe24.paint.point.Point;
import com.cafe24.paint.shape.Circle;
import com.cafe24.paint.shape.Rect;
import com.cafe24.paint.shape.Triangle;

public class MainApp {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		draw(p1);
		Point p2 = new ColorPoint(50,100,"레드");
//		drawPoin(p2);
		
		p2.show(true);
		
		p1.show(false);
		p2.show(false);
		
		Triangle triangle = new Triangle();
		draw(triangle);
		Rect rect = new Rect();
		draw(rect);
		Circle circle = new Circle();
		draw(circle);
		
		draw(new GraphicString("hello"));
		
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
//	public static void draw(Point point) {
//		point.show();
//	}
//	public static void draw(Shape shape) {
//		shape.draw();
//	}
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
}
