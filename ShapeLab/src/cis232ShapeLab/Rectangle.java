package cis232ShapeLab;

public class Rectangle implements Shape {

	private double length, width;
	
	public Rectangle(){
		this.length = 1.0;
		this.width = 1.0;
	}
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
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

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		
		return (length * 2) + (width * 2);
	}

}
