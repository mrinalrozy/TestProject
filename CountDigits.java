package com.forloop;

public class CountDigits 
{
	public static void main(String[]args)
	{
		int num=1234,count=0;
		do
		{
			num=num/10;
			count++;
		}
		while(num>0);
		System.out.println("no of digits="+count);
			
		}
	}


