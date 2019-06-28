package com.app.list_set;

import java.util.HashSet;

//import java.util.ArrayList;
//import java.util.List;

public class HashMainAppl {

	public static void main(String[] args) 
	{
		HashCollection obj1 = new HashCollection("Nilima","Jalgaon",24,30000);
		HashCollection obj2 = new HashCollection("Tejaswini","Amravati",23,35000);
		HashCollection obj3 = new HashCollection("Megha","Sangli",22,30000);
		HashCollection obj4 = new HashCollection("Saurabh","Nashik",25,34000);
		HashCollection obj5 = new HashCollection("Amit","Pune",26,25000);
		HashCollection obj6 = new HashCollection("Arun","Mumbai",23,30000);
		
		HashSet<HashCollection> set = new HashSet<HashCollection>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);
		set.add(obj6);
		
		System.out.println("Initial Employee list \n");
		for(HashCollection hc:set)
		{
			System.out.println(hc.getName()+" "+hc.getPlace()+" "+hc.getAge()+" "+hc.getSalary());
		}
		set.remove(obj5);
		System.out.println("After removing obj5 Employee list \n");
		for(HashCollection hc:set)
		{
			System.out.println(hc.getName()+" "+hc.getPlace()+" "+hc.getAge()+" "+hc.getSalary());
		}
		
		HashSet<HashCollection> set1 = new HashSet<HashCollection>();
		HashCollection obj7 = new HashCollection("Aruna","Satara",20,30000);
		HashCollection obj8 = new HashCollection("Neha","Nagar",22,30000);
		set1.add(obj7);
		set1.add(obj8);
		set.addAll(set1);
		System.out.println("After inserting obj7 and obj8 Employee list \n");
		for(HashCollection hc:set)
		{
			System.out.println(hc.getName()+" "+hc.getPlace()+" "+hc.getAge()+" "+hc.getSalary());
		}
		
		//set.removeAll(set1);  // It will remove all set1 objects from list
		//set.clear();  // remove all the objects
		
		/*
		 * List<HashCollection> l = new ArrayList<HashCollection>(); l.add(obj1);
		 * l.add(obj2); l.add(obj3); l.add(obj3); // allowed duplication in list
		 * for(HashCollection h:l) {
		 * System.out.println(h.getName()+" "+h.getPlace()+" "+h.getAge()+" "+h.
		 * getSalary()); }
		 */
		 
		
		/*
		 * HashSet<HashCollection> set = new HashSet<HashCollection>(); set.add(obj1);
		 * set.add(obj2); set.add(obj3); set.add(obj3); // not allowed-----avoid
		 * duplicate values------same object name
		 * 
		 * for(HashCollection h:set) {
		 * System.out.println(h.getName()+" "+h.getPlace()+" "+h.getAge()+" "+h.
		 * getSalary()); }
		 */
		
		

	}

}
  