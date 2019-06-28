package com.room.demo;

import java.util.Scanner;

public class House 
{
	public void addRooms()
	{
		int choice;
		do
		{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Kitchen");
		System.out.println("2.Living area");
		System.out.println("3.Dining area");
		System.out.println("4.Bedroom");
		System.out.println("5.Washroom");
		System.out.println("6.Porch");
		System.out.println("7.Terrace");
		System.out.println("8.Corridors");
		System.out.println("Select room..");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				
				System.out.println("Kitchen is selected..");
				Rooms kitchen = new Rooms();
				kitchen.Addgadget();
				break;
			case 2:
				System.out.println("living is selected..");
				Rooms living = new Rooms();
				living.Addgadget();
				break;
			case 3:
				System.out.println("dining is selected..");
				Rooms dining = new Rooms();
				dining.Addgadget();
				break;
			case 4:
				System.out.println("bedroom is selected..");
				Rooms bedroom = new Rooms();
				bedroom.Addgadget();
				break;
			case 5:
				System.out.println("washroom is selected..");
				Rooms washroom = new Rooms();
				washroom.Addgadget();
				break;
			case 6:
				System.out.println("porch is selected..");
				Rooms porch = new Rooms();
				porch.Addgadget();
				break;
			case 7:
				System.out.println("terrace is selected..");
				Rooms terrace = new Rooms();
				terrace.Addgadget();
				break;
			case 8:
				System.out.println("Corridors is selected..");
				Rooms Corridors = new Rooms();
				Corridors.Addgadget();
				break;
			
			default:
				System.out.println("No rooms available...");
					
		}
		}while(choice != 8);
		
		
	}
	


}
