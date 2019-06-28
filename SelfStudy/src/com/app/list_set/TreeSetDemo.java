package com.app.list_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo 
{

	public static void main(String[] args) 
	{
		Set<Book> blist=new TreeSet<Book>();
		
		Book b1 =new Book(3,"Book 1","XYZ","Publisher 1",100);
		Book b2 =new Book(2,"Book 2","LMN","Publisher 2",10);
		Book b3 =new Book(1,"Book 3","JPL","Publisher 3",1);
		
		blist.add(b1);
		blist.add(b2);
		blist.add(b3);
		
		System.out.println("Book list : \n");
		for(Book book:blist)
		{
			System.out.println(book.getId()+"  "+book.getName()+"  "+book.getAuthor()+"  "+book.getPublisher()+"  "+book.getQuantity());
		}
	}

}
