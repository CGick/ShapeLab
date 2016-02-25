package cis232ShapeLab;

public class Square extends Rectangle implements Shape {

	public Square() {
		
	}

	public Square(double length) {
		super(length, length);
		
	}
	public String toString(){
		String toString = "The square has perimeter of: " +String.valueOf(getPerimeter()) + " and area of: " +String.valueOf(getArea());
		return toString;
	}

}
