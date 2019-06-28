package com.room.demo;

import java.util.Scanner;

public class Lights implements GadgetsInterface
{
	String Lights;
	Scanner sc=new Scanner(System.in);
	public void ON()
	{
		System.out.println("Lights are ON");
	}
	public void OFF()
	{
		System.out.println("Lights are OFF");
	}
	public void Addgadget() 
	{
		System.out.println("Light is added..");
		
	}
	public void Toggle()
	{
		int ch2;

		System.out.println("Switch ON or OFF[1/0]..?");
		ch2=sc.nextInt();
		if(ch2==1)
		{
			ON();
		}
		else
		{
			OFF();
		}
	}
	
	int flag;
	
	public void check_status()
	{
		if(flag==1)
		{
			System.out.println("Doors is open");
		}
		else
		{
			System.out.println("Doors is closed");
		}
	}
}
