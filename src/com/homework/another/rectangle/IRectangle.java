package com.homework.another.rectangle;


public interface IRectangle {
	int compareTo(IRectangle a, IRectangle b);
	double getArea();
	double getPerimeter();
	static int max(IRectangle[] array) {
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


