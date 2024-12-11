package com.collection_frameworks;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ClassLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();//underlying dataStructure for LinkedHashSet is HashTable
		lhs.add(10);//insertion order is maintained
		lhs.add("java");//heterogeneous data is allowed
		lhs.add(null);//null value is allowed
		lhs.add(20);//Default capacity:16
		lhs.add(30);//Load factor :0.75 i.e.,initially out of 16 data locations we can only store 12 after that the capacity will be doubled(32){12/16=0.75}
		lhs.add(40);//it is not synchronized by default
		lhs.add(50);//available from java 1.4v
		lhs.add(10);//Duplicates are allowed
		System.out.println(lhs);
		Iterator i=lhs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
