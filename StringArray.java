package com.forloop;

public class StringArray {
	public static void main(String[]args)
	{
		System.out.println("start the program");
String[]strArray={"car","bike","truck","lamberghini","scorpio","bolero"};
		strArray[0]="car";
		strArray[1]="bike";
		strArray[2]="truck";
		strArray[3]="lamberghini";
		strArray[4]="scorpio";
		strArray[5]="bolero";
		System.out.println("The value of index 0 in strArray is "+strArray[0]);
		System.out.println("The value of index 1 in strArray is "+strArray[1]);
		System.out.println("The value of index 2 in strArray is "+strArray[2]);
		System.out.println("The value of index 3 in strArray is "+strArray[3]);
		System.out.println("The value of index 4 in strArray is "+strArray[4]);
		System.out.println("The value of index 5 in strArray is "+strArray[5]);
int leng=strArray.length;
for(int i=0;i<leng;i++)
{
	
	System.out.println("The value is: "+strArray[i]);
}
System.out.println("end the program");
}
}
