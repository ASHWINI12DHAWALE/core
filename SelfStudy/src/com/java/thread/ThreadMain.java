package com.java.thread;

public class ThreadMain 
{
	public static void main(String[] args) 
	{
		Mythread1 t1=new Mythread1("Reader");
		Mythread1 t2=new Mythread1("Writer");
		t1.start();
		t2.start();
	}

}
