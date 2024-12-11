package com.collection_frameworks;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;
public class ClassTreeSet {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);//insertion order is not maintained but stored is sorting order(ascending order)
//		ts.add("java");//heterogeneous data is not allowed(only homogeneous)
//		ts.add(null);//null value is not allowed
		ts.add(20);//default capacity:16
		ts.add(30);//Load factor:0.75 i.e.,initially out of 16 data locations we can only store 12 after that the capacity will be doubled(32){12/16=0.75}
		ts.add(40);//it is available from java 1.2v
		ts.add(50);//it not synchronized
		ts.add(10);//duplicates are not allowed
		System.out.println(ts);
		Iterator i=ts.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("========================================");
		Iterator di=ts.descendingIterator();
		while(di.hasNext())
		{
			System.out.println(di.next());
		}
		System.out.println("========================================");
		System.out.println(ts.headSet(30));
		System.out.println(ts.tailSet(30));
		
	}

}
