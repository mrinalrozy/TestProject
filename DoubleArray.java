package com.forloop;

public class DoubleArray 
{
	public static void main(String[]args) {
		System.out.println("start of program");
		double[]dArray=new double[5];
		dArray[0]=1.23;
		dArray[1]=2.34;
		dArray[3]=3.67;
		dArray[4]=4.24;
		System.out.println("The value in index 0 of the dArray is "+dArray[0]);
		System.out.println("The value in index 1 of the dArray is "+dArray[1]);
		System.out.println("The value in index 2 of the dArray is "+dArray[2]);
		System.out.println("The value in index 3 of the dArray is "+dArray[3]);
		System.out.println("The value in index 4 of the dArray is "+dArray[4]);
		int length=dArray.length;
		for(int i=0;i<length;i++)
		{
			System.out.println(dArray[i]);
		}
		System.out.println("end of program");
		
		}
}
