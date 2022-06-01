package com.homework.rectangle;

public class Rectangle implements IRectangle {
	private double width;
	private double height;
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

	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public int compareTo(Rectangle rectangle) {
		// TODO Auto-generated method stub
		return this.getArea() > rectangle.getArea() ? 1
				: this.getArea() < rectangle.getArea() ? -1
				: 0;
	}

	public static int max(Rectangle[] array) {
		final int size = array.length;
		double max = 0;
		int index = 0;
		for(int i = 0; i < size; i++) {
			double area = array[i].getArea();
			if(area > max) {
				max = area;
				index = i;
			}
		}
		return index;
	}
	
}
