package com.forloop;

public class InBuild {
	int a,b;
	public InBuild(int inputa,int inputb)
	{
		a=inputa;
		b=inputb;
	}
	void sum(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum of two numbers: "+sum);
		
	}
	void sum(long a,float b)
	{
		double sum=a+b;
		System.out.println("sum of two numbers: "+sum);
	}
	public static void main(String[]args)
	{
		InBuild ib=new InBuild(10,20,870000l,12.12345f);
		ib.sum(ib.a,ib.b);
		ib.sum(10,20);
		ib.sum(870000l, 12.12345f);
	}
		
	}


