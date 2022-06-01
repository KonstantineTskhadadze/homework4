package com.homework.main;

public class Main {
	public static void main(String[] args) {
		{
			com.homework.rectangle.Rectangle rectangle = new com.homework.rectangle.Rectangle(100, 100);
		}
		{
			com.homework.rectangle.Rectangle rectangle = new com.homework.rectangle.Rectangle(100);
		}
		{
			com.homework.rectangle.Rectangle rectangle = new com.homework.rectangle.Rectangle();
		}
		{
			com.homework.another.rectangle.Rectangle rectangle = new com.homework.another.rectangle.Rectangle(100, 100);
		}
		{
			com.homework.another.rectangle.Rectangle rectangle = new com.homework.another.rectangle.Rectangle(100);
		}
		{
			com.homework.another.rectangle.Rectangle rectangle = new com.homework.another.rectangle.Rectangle();
		}
		{
			final int size = 10;
			com.homework.rectangle.Rectangle[] list = new com.homework.rectangle.Rectangle[size];
			for(int i = 0; i < size; i++) 
				list[i] = new com.homework.rectangle.Rectangle(25 * i, 10 * i);
			com.homework.rectangle.Rectangle.max(list);
		}
		{
			final int size = 10;
			com.homework.another.rectangle.Rectangle[] list = new com.homework.another.rectangle.Rectangle[size];
			for(int i = 0; i < size; i++) 
				list[i] = new com.homework.another.rectangle.Rectangle(25 * i, 10 * i);
			com.homework.another.rectangle.Rectangle.max(list);
		}
	}
}
