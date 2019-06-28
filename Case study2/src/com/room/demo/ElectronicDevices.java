package com.room.demo;

import java.util.Scanner;

public class ElectronicDevices implements GadgetsInterface
{
	String ElectronicDevices;
	Scanner sc=new Scanner(System.in);
	public void Addgadget()
	{
		System.out.println("ElectronicDevice is added..");
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
			System.out.println("Electronic devices are in ON condition");
		}
		else
		{
			System.out.println("Electronic devices are OFF");
		}
	}
	public void ON()
	{
		flag=1;
		System.out.println("Electronic devices are ON");
	}
	public void OFF()
	{
		flag=0;
		System.out.println("Electronic devices are OFF");
	}

}
