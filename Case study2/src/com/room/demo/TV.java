package com.room.demo;

import java.util.Scanner;

public class TV implements GadgetsInterface
{
	Scanner sc=new Scanner(System.in);

	public void Addgadget() 
	{
		System.out.println("T.V. is added..");
		
	}
	
	public void ON()
	{
		System.out.println("TV is turned ON");
	}
	public void OFF()
	{
		System.out.println("TV is turned  OFF");
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
			System.out.println("T.V. turned ON");
		}
		else
		{
			System.out.println("T.V. turned OFF");
		}
	}

}
