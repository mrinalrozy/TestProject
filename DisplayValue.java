package com.forloop;

public class DisplayValue {
	DisplayValue()
	{
		System.out.println("this is my no-arg constructor");
	}
	void display(String strValue)
	{
		System.out.println("The received string value is: "+strValue);
	}
	void display(char charValue,boolean booleanValue)
	{
		System.out.println("The received string value is: "+charValue);
		System.out.println("The received string value is: "+booleanValue);
	}
	public static void main(String[]args)
	{
		DisplayValue disp=new DisplayValue();
		disp.display("mrinal");
		System.out.println("============");
		disp.display('n',false);
		
		
		
	}

}
