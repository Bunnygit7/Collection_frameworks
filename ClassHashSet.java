package com.collection_frameworks;

import java.util.HashSet;
import java.util.Iterator;

public class ClassHashSet {
	public static void main(String[] args) {
		HashSet hs=new HashSet();//Underlying DataStructure for HashSet is HashTable
		hs.add(10);//insertion order is not maintained
		hs.add("java");//heterogeneous data is allowed
		hs.add(null);//null value is allowed
		hs.add(20);//default capacity:16
		hs.add(30); //size will be increased by double(capacity*2)
		hs.add(40);//Load factor:0.75 i.e.,initially out of 16 data locations we can only store 12 after that the capacity will be doubled(32){12/16=0.75}
		hs.add(50);//it is available from java 1.2v
		hs.add(60);//it is not synchronized by default
		hs.add(10);//duplicate values allowed
		System.out.println(hs);
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" "); 
		}
	}
}
