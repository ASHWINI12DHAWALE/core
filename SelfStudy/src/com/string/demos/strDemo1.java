package com.string.demos;

public class strDemo1 
{
		public static void main(String args[])
		{
			
			String s1="welcome";
			String s2=new String("welcome");
			String s3=new String("welcome");
			String str1="Nilima";
			String str2="Nilima";//change str2 val and see the result:different
			String str3="Nil";
			
			System.out.println("using literal.............");
			if(str1==str2)
				System.out.println("Strings are equal\n\n");
			else
				System.out.println("Strings are different");
			
			
			System.out.println("using literal...............");
			if("welcome"=="welcome")
				System.out.println("Strings are equal\n\n");
			else
				System.out.println("Strings are different");
			
			
			System.out.println("using literal and new................");
			if(s1==s2)
				System.out.println("Strings are equal");
			else
				System.out.println("Strings are different\n\n");
			
			System.out.println("using new and new.................");
			if(s2==s3)
				System.out.println("Strings are equal[]");
			else
				System.out.println("Strings are different\n\n");
			
			System.out.println("Using two different literals........");
			if(str2==str3)
				System.out.println("");
			
			System.out.println("S1(of String Pool) : "+s1.hashCode());
			System.out.println("S2(of HEAP) : "+s2.hashCode());
		}

}
