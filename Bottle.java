package com.forloop;

public class Bottle {
	String color;
	String material;
	int litrs;
	Bottle()
	{
		System.out.println("creating the object");
	}
	void pourWater()
	{
	System.out.println("pourWater");
	}
	void openCap()
	{
		System.out.println("open Cap");
	}
	void closingCap()
	{
		System.out.println("closigCap");
	}
	public static void main(String[]args)
	{
		Bottle pg=new Bottle();
		pg.color="green";
		pg.material="plastic";
		pg.litrs=3;
		System.out.println("The color is: "+pg.color);
		System.out.println("The material is: "+pg.material);
		System.out.println("The litrs is: "+pg.litrs);
		pg.pourWater();
		pg.openCap();
		pg.closingCap();
	}
		


}
