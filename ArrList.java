package com.collection_frameworks;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrList {
	void meth1() {
		ArrayList al=new ArrayList();
		al.add(10);//insertion order is maintained
		al.add(1);//heterogeneous elements allowed
		al.add(10);//Duplicates are allowed
		al.add("java");//Default capacity:10
		al.add(69);//size will increase by {(capacity*3/2)+1} (we can almost by half)
		al.add(78);//It is not synchronized by default
		al.add(null);//null values are allowed
		al.add(100);//It is available from java 1.2v
		System.out.println("ArrayList==>"+al);
		al.add(3,"hello");
		al.remove(6);
		al.remove((Object) 100);
		System.out.println("is java contains==>"+al.contains("java"));
		
		System.out.println("printing elements using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("printing elements using for each loop");
		for(Object o:al)
		{
			System.out.println(o);
		}
		System.out.println("printing elements using iterator");
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("ArrayList Size==>"+al.size());
		System.out.println("isEmpty()==>"+al.isEmpty());
		al.clear();
		System.out.println("ArrayList aftr clear ==>"+al);
	}
	
	void meth2() {
		ArrayList<Integer> al=new ArrayList<Integer>();//<generic>
		al.add(10);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println("In method 2 generic is mentioned for storing the that type of data");
		System.out.println(al);
	}
	public static void main(String[] args) {
		new ArrList().meth1();
		new ArrList().meth2();

		
	}

}
