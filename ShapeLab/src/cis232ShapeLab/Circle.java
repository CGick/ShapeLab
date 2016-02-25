package cis232ShapeLab;
import java.lang.Math;

public class Circle implements Shape {

	private double radius;
	
	public Circle(){
		radius = 1.0;
	}
	public Circle(Double a){
		radius = a;
	}
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	public String toString(){
		String toString = "The circle has perimeter of: " +String.valueOf(getPerimeter()) + " and area of: " +String.valueOf(getArea());
		return toString;
	}

}
