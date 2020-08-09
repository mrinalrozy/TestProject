package com.forloop;

public class LongArray
{
	public static void main(String[]args)
	{
		System.out.println("start the program");
		long[]lgArray={2523,32456,46567,58678};
		lgArray[0]=(long) 25123;
		lgArray[1]=(long)32456;
		lgArray[2]=(long)46567;
	lgArray[3]=(long)58678;
	System.out.println("The value of index 0 in lgArray is:"+lgArray[0]);
	System.out.println("The value of index 1 in lgArray is:"+lgArray[1]);
	System.out.println("The value of index 2 in lgArray is:"+lgArray[2]);
	System.out.println("The value of index 3 in lgArray is:"+lgArray[3]);
	int leng=lgArray.length;
	for(int i=0;i<leng;i++)
	{
		System.out.println("The value is: "+lgArray[i]);
	}
	System.out.println("end the program");
	}
}
			
	
	
	
	
		
