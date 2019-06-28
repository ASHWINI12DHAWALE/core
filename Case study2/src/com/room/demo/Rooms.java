package com.room.demo;

import java.util.Scanner;

public class Rooms implements GadgetsInterface
{
	Scanner sc=new Scanner(System.in);
	public void Addgadget() 
	{
		int ch,ch2;
		do
		{
		System.out.println("Select a gadget to add : ");
		System.out.println("1.Electronic Device");
		System.out.println("2.Lights");
		System.out.println("3.AC");
		System.out.println("4.TV");
		System.out.println("5.Door");
		System.out.println("6.Shower");
		System.out.println("7.Exit");
		
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			ElectronicDevices e=new ElectronicDevices();
			e.Addgadget();
			e.Toggle();
			e.check_status();
	
			break;
		case 2:
			Lights l=new Lights();
			l.Addgadget();
			
			System.out.println("Switch ON or OFF[1/0]..?");
			ch2=sc.nextInt();
			if(ch2==1)
			{
				l.ON();
			}
			else
			{
				l.OFF();
			}
			break;
		case 3:
			AirConditioner ac=new AirConditioner();
			ac.Addgadget();
			
			System.out.println("Switch ON or OFF[1/0]..?");
			ch2=sc.nextInt();
			if(ch2==1)
			{
				ac.ON();
			}
			else
			{
				ac.OFF();
			}
			break;
		case 4:
			TV tv=new TV();
			tv.Addgadget();
			
			System.out.println("Switch ON or OFF[1/0]..?");
			ch2=sc.nextInt();
			if(ch2==1)
			{
				tv.ON();
			}
			else
			{
				tv.OFF();
			}
			break;
		case 5:
			Doors d=new Doors();
			d.Addgadget();
			
			System.out.println("Switch ON or OFF[1/0]..?");
			ch2=sc.nextInt();
			if(ch2==1)
			{
				d.ON();
			}
			else
			{
				d.OFF();
			}
			break;
		case 6:
			Shower sh=new Shower();
			sh.Addgadget();
			
			System.out.println("Switch ON or OFF[1/0]..?");
			ch2=sc.nextInt();
			if(ch2==1)
			{
				sh.ON();
			}
			else
			{
				sh.OFF();
			}
			break;
		case 7:exit(0);break;
		
		default:System.out.println("No Other gadgets available...");
		}
		}while(ch!=7);
	}

	private void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ON() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OFF() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Toggle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void check_status() {
		// TODO Auto-generated method stub
		
	}
	

}
