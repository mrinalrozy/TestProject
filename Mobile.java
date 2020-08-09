package com.forloop;

public class Mobile {
	String brand;
	String color;
	double price;
	int ram;
	boolean issmartPhone;
	
		Mobile()
		{
			System.out.println("calling a constructor");
			brand="Samsung";
			color="black";
			price=10000.00;
			ram=4;
			issmartPhone=false;
			System.out.println("ending a constructor");
		}
	void  Call(long PhoneNum)
		{
		System.out.println("Call to: "+PhoneNum);
		}
	void  Charging(boolean isCharging)
	{
	System.out.println("Is the charging on: "+isCharging);
	}
	void  locked(boolean isLocked)
	{
	System.out.println("Is the phone locked: "+isLocked);
	}
	public static void main(String[]args)
	{
		System.out.println("start the program");
		Mobile nokia = new Mobile();
		System.out.println("brand: "+nokia.brand + "color: "+nokia.color + "price: "+nokia.price + "ram: "+nokia.ram + "issmartPhone: "+nokia.issmartPhone);
		nokia.brand="Vivo";
		nokia.color="white";
		nokia.price=5000.00;
		nokia.ram=3;
		nokia.issmartPhone=true;
		System.out.println("brand: "+nokia.brand + "color: "+nokia.color + "price: "+nokia.price + "ram: "+nokia.ram + "issmartPhone: "+nokia.issmartPhone);
		
			
		}
	}
	


