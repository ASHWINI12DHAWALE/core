import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Hash 
{
   public static void main(String args[])throws Exception
   {
	  Coin c1;
	  Scanner sc=new Scanner(System.in);
	  int n,price,year;
	  String country,Name,wish;
      TreeSet<Coin> t1=new TreeSet<Coin>(); 
	  int ch;
	  do
	  {
		  FileOutputStream fout=null;
		  System.out.println("Enter 1. for Add Detail 2.for Serach Coin country vice ");
		  ch=sc.nextInt();
		  switch(ch)
		  {
		  case 1:
		   System.out.println("Enter the number in which do yo want to add coin Detail");
		      n=sc.nextInt();
		      for(int i=0;i<n;i++)
		      {
		          System.out.println("Enter country name");
		          country=sc.next();

		          System.out.println("Enter price");
		          price=sc.nextInt();

		          System.out.println("Enter year");
		          year=sc.nextInt();
				  t1.add(new Coin(price,country,year));

		          
		          try 
		          {
		  			
		  			fout=new FileOutputStream("text1.txt");
		  			ObjectOutputStream oin=new ObjectOutputStream(fout);
		  			oin.writeObject(t1);
		  			
		  	       } 
		          catch (FileNotFoundException e) {
		  			// TODO Auto-generated catch block
		  			e.printStackTrace();
		  		}
		      }
		      break;
		  case 2:
			 System.out.println("Enter Country Name");
			 Name=sc.next();
			 System.out.println(t1.size());
			 FileInputStream fin=new FileInputStream("text1.txt");
			 ObjectInputStream oin1=new ObjectInputStream(fin);
			 TreeSet<Coin> st=new TreeSet<Coin>();
			 st=(TreeSet<Coin>) oin1.readObject();
			 
			for(Coin c5:st)
			{
				if(c5.getCountry().equals(Name))
				{
					System.out.println(c5.getPrice());
					System.out.println(c5.getYear());
				}
			}
			 break;
		
		  }
		  System.out.println("do you want to continue");
		  wish=sc.next();
	   
	      
	  }while(wish.equals("Y") || wish.equals("y"));
	
   }
}
