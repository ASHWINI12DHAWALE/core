package com.dbt.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection 
{
	public static void main(String[] args) throws IOException
	{
		try 
		{
		int ch;
	     
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/megha","root","root");
	 Statement stmt=con.createStatement();
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("1.INSERT");
			System.out.println("2.SELECT");
			System.out.println("3.DELETE by City");
			System.out.println("4.UPDATE");
			System.out.println("5.EXIT\n");
			System.out.println("Enter choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					String p;
					String pname;
					String colour;
					int weight;
					String city;
				
					System.out.println("Enter P-code[p1],pname,colour,weight,city");
				
					p=br.readLine();  
				
					pname=br.readLine();  
					
					colour=br.readLine();  
					
					weight=Integer.parseInt(br.readLine()); 
				
					city=br.readLine();  
					PreparedStatement stmt1=con.prepareStatement("insert into parts values(?,?,?,?,?)");  
					//String query="insert into PARTS values('P9','Cyl','Gold',4,'Jamner')";
					stmt1.setString(1,p);
					stmt1.setString(2,pname);  
					stmt1.setString(3,colour);  
					stmt1.setInt(4,weight);  
					stmt1.setString(5,city);  
					int updateRowCount = stmt1.executeUpdate();
					System.out.println("Row inserted....");
					break;
				case 2:
					
					ResultSet rs = stmt.executeQuery("select * from PARTS");
					while(rs.next())
					{
						System.out.println(rs.getString(1));
						System.out.println(rs.getString(2));
						System.out.println(rs.getString(3));
						System.out.println(rs.getString(4));
						System.out.println(rs.getString(5)+"\n-----------------");
					}
					break;
				case 3:
					//String query1 ="delete from PARTS where city IS NULL";
					System.out.println("Enter city : ");
					String cty=br.readLine();
					String query1 ="delete from PARTS where city=cty";
					int rs2 = stmt.executeUpdate(query1);
					System.out.println("Row deleted....");
					break;
				case 4:
					System.out.println("Enter P_code : ");
					String pcode=br.readLine();
					String query2 ="update PARTS set city='Amaravati' where p=pcode";
					int rs3 = stmt.executeUpdate(query2);
					System.out.println("Row updated....");
					break;
				case 5:exit(0);break;
				default:System.out.println("Wrong choice....");
			}
		}while(ch!=5);
		con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	
	/*	try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/megha","root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from PARTS");
			//String query="insert into PARTS values('P4','Cylinder','Silver',4,'Kolhapur')";
			//int updateRowCount = stmt.executeUpdate(query);
			//System.out.println("Row inserted..!!!");
			//con.close();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5)+"\n-----------------");
			}
			
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}*/
	
	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	
}
