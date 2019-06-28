package com.java.thread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
public class Mythread1 extends Thread
{
    public static int x = 0,j=0;
    public static String line;
    public Mythread1(String threadName) 
    {     //Constuctor
        super(threadName);//Call to constructor of Thread class
    }

    public void run()
    {
    	while(x!=-1)
    	{
    		 if (Thread.currentThread().getName().contains("Reader"))
    		 {
                 if (x != -1&&j==0)
                 {
                	 j=1;
                	 String fileName = "f:/iacsd.txt";
                	 try
                	 {
                		// FileReader reads text files in the default encoding.
                         FileReader fileReader = new FileReader(fileName);

                         // Always wrap FileReader in BufferedReader.
                         BufferedReader bufferedReader = new BufferedReader(fileReader);

                         for (int check = 0; check <= x; check++) 
                         {
                             line = bufferedReader.readLine();
                         }
                         if (line == null) 
                         {
                             x = -1;
                         }
                         else 
                         {
                             System.out.println(line);
                             x++;
                         }
                         // Always close files.
                         bufferedReader.close();
                	 }
                	 catch(FileNotFoundException  e)
                	 {
                         System.out.println("Unable to open file '"+ fileName + "'");

                	 }
                	 catch(IOException e)
                	 {
                         System.out.println("Error reading file '"+ fileName + "'");

                	 }
                 }
                 yield();
    		 }
    		 else if (Thread.currentThread().getName().contains("Writer")) 
    		 {
    			    if (x != -1 && line != null&&j==1)
    			    {
    			                    j=0;

    			                    String fileName = "f:/iacsd.txt";

    			                    try {
    			                        // Assume default encoding.
    			                        FileWriter fileWriter =
    			                                new FileWriter(fileName, true);

    			                        // Always wrap FileWriter in BufferedWriter.
    			                        BufferedWriter bufferedWriter =
    			                                new BufferedWriter(fileWriter);

    			                        // Note that write() does not automatically
    			                        // append a newline character.
    			                        bufferedWriter.write(line);
    			                        bufferedWriter.newLine();
    			                        System.out.println("y");
    			                        // Always close files.
    			                        bufferedWriter.close();
    			                    } 
    			                    catch (IOException ex) 
    			                    {
    			                        System.out.println("Error writing to file '"+ fileName + "'");
    			                        // Or we could just do this:
    			                        // ex.printStackTrace();
    			                    }
    			    }     
    			                    Thread.yield();
    		}
    		else{}    		 
    	}
    }
}
