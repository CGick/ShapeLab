package cis232ShapeLab;
import java.lang.Math;

public class RightTriangle implements Shape {

	
	private double length;
	private double width;
	private double hypotenuse;
	
	public RightTriangle(){
		length = 1.0;
		width = 1.0;
		hypotenuse = getHypotenuse();
	}
	public RightTriangle(double a, double b){
		length = a;
		width = b;
		hypotenuse = getHypotenuse();
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getArea() {
		double area = length * width * .5;
		return area;
	}
	public double getPerimeter() {
		return length + width + hypotenuse;
	}
	private double getHypotenuse(){
		double val;
		val = length * length * width * width;
		hypotenuse = Math.sqrt(val);
		return hypotenuse;
	}
	public String toString(){
		String toString = "The triangle has perimeter of: " +String.valueOf(getPerimeter()) + " and area of: " +String.valueOf(getArea());
		return toString;
	}
}
