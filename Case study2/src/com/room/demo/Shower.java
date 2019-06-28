package com.room.demo;

import java.util.Scanner;

public class Shower implements GadgetsInterface
{
	String Shower;
	Scanner sc=new Scanner(System.in);
	public void Addgadget()
	{
		System.out.println("Door is added..");
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
	public void ON()
	{
		flag=1;
		System.out.println("Door is Open");
	}
	public void OFF()
	{
		flag=0;
		System.out.println("Door is Closed");
	}
}
