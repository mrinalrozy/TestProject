package com.forloop;

public class CharacterArray {
	public static void main(String[]args)
	{
		System.out.println("start the program");
		char[]chArray= new char[5];
		chArray[0]='A';
		chArray[1]='E';
		chArray[2]='I';
		chArray[3]='o';
		chArray[4]='U';
		System.out.println("The value of index 0 in chArray is "+chArray[0]);
		System.out.println("The value of index 1 in chArray is "+chArray[1]);
		System.out.println("The value of index 2 in chArray is "+chArray[2]);
		System.out.println("The value of index 3 in chArray is "+chArray[3]);
		System.out.println("The value of index 4 in chArray is "+chArray[4]);
		int leng=chArray.length;
		for(int i=0;i<=chArray.length-1;i++)
		{
			System.out.println(chArray[i]);
		}
		System.out.println("end of program");
	}
}
