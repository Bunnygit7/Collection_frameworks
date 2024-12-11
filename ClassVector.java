package com.collection_frameworks;

import java.util.Enumeration;
import java.util.Vector;

public class ClassVector {
	void meth1() {
		Vector v=new Vector();
		v.add(10);//insertion order is maintained
		v.add("java");
		v.add(20);//it is synchronized by default
		v.add(30);//vector is available from java 1.0V(legacy class)
		v.add(40);//Default capacity is 10
		v.add(50);//size will be increased by double(capacity*2)
		v.add(60);//heterogeneous elements are allowed 
		v.add(null);//null value is allowed
		v.add(10);//Duplicate values are allowed
		v.addElement(454545);
		v.removeElement(10);
		v.removeElementAt(5);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println("--------------------------------------------");
		System.out.println("printing using enumeration interface");
		Enumeration e=v.elements();	
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
	public static void main(String[] args) {
		new ClassVector().meth1();
	}
}
