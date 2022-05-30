package com.homework.another.rectangle;


public class Rectangle implements IRectangle {
	final private double width;
	final private double height;
	final private static double MAX_WIDTH;
	final private static double MAX_HEIGHT;
	final private static double DEFAULT;
	
	static {
		MAX_WIDTH = 100;
		MAX_HEIGHT = 100;
		DEFAULT = 0;
	}
	
	public Rectangle() {
		this(DEFAULT, DEFAULT);
	}
	
	public Rectangle(double width) {
		this(width, DEFAULT);
	}
	
	public Rectangle(double width, double height) {
		this.width = width < MAX_WIDTH ? width : MAX_WIDTH;
		this.height = height < MAX_HEIGHT ? height : MAX_HEIGHT;
	}
	
	@Override
	public int compareTo(IRectangle a, IRectangle b) {
		// TODO Auto-generated method stub
		return a.getPerimeter() > b.getPerimeter() ? 1
				:a.getPerimeter() < b.getPerimeter() ? -1
				: 0;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}
}
