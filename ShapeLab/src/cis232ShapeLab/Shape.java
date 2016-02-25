package cis232ShapeLab;

import java.text.DecimalFormat;

public interface Shape {
	DecimalFormat format = new DecimalFormat("#,##0.00");
	double getArea();
	double getPerimeter();
}
