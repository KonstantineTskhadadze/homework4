package com.homework.main;

public class Main {
	public static void main(String[] args) {
		{
			com.homework.rectangle.IRectangle rectangle = new com.homework.rectangle.Rectangle(100, 100);
		}
		{
			com.homework.rectangle.IRectangle rectangle = new com.homework.rectangle.Rectangle(100);
		}
		{
			com.homework.rectangle.IRectangle rectangle = new com.homework.rectangle.Rectangle();
		}
		{
			com.homework.another.rectangle.IRectangle rectangle = new com.homework.another.rectangle.Rectangle(100, 100);
		}
		{
			com.homework.another.rectangle.IRectangle rectangle = new com.homework.another.rectangle.Rectangle(100);
		}
		{
			com.homework.another.rectangle.IRectangle rectangle = new com.homework.another.rectangle.Rectangle();
		}
		{
			final int size = 10;
			com.homework.rectangle.IRectangle[] list = new com.homework.rectangle.IRectangle[size];
			for(int i = 0; i < size; i++) 
				list[i] = new com.homework.rectangle.Rectangle(25 * i, 10 * i);
			System.out.println(com.homework.rectangle.IRectangle.max(list));
		}
		{
			final int size = 10;
			com.homework.another.rectangle.IRectangle[] list = new com.homework.another.rectangle.IRectangle[size];
			for(int i = 0; i < size; i++) 
				list[i] = new com.homework.another.rectangle.Rectangle(25 * i, 10 * i);
			System.out.println(com.homework.another.rectangle.IRectangle.max(list));
		}
	}
}
