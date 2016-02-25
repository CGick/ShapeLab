package cis232ShapeLabMain;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import cis232ShapeLab.*;


public class MainMethod {

	public static void main(String[] args) throws IOException{

		File inputFile = new File("Dumbshapes.csv");
		Scanner input = new Scanner(inputFile);
		ArrayList<Shape> shapes = new ArrayList<>();
		StringTokenizer st;
		

		while(input.hasNextLine()){
			
			st = new StringTokenizer(input.nextLine(), ",");
			String shapeName = st.nextToken();
			if(shapeName.equalsIgnoreCase("Circle")){
				double rad = Double.parseDouble(st.nextToken());
				Circle c = new Circle(rad);
				shapes.add(c);
			}
			if(shapeName.equalsIgnoreCase("Square")){
				double l = Double.parseDouble(st.nextToken());
				Square s = new Square(l);
				shapes.add(s);
			}
			if(shapeName.equalsIgnoreCase("Rectangle")){
				double l = Double.parseDouble(st.nextToken());
				double w = Double.parseDouble(st.nextToken());
				Rectangle r = new Rectangle(l,w);
				shapes.add(r);
			}
			if(shapeName.equalsIgnoreCase("Triangle")){
				double l = Double.parseDouble(st.nextToken());
				double w = Double.parseDouble(st.nextToken());
				Rectangle t = new Rectangle(l,w);
				shapes.add(t);
			}
		}
		

	}

}
