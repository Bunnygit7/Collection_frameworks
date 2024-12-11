package com.collection_frameworks;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
	private static Object arr[];
	static {
		arr=new Object[1000000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Object();
		}
	}
	
	
	void arrayListTime()
	{
		long start,end;
		ArrayList al=new ArrayList();
		start=System.currentTimeMillis();	
		for(Object obj:arr) {
			al.add(obj);
		}
		end=System.currentTimeMillis();
		System.out.println("ArrayList Construction Time:"+(end-start));
	}
	
	
	void linkedListTime()
	{
		long start,end;
		LinkedList ll=new LinkedList();
		start=System.currentTimeMillis();
		for(Object obj:arr) {
			ll.add(obj);
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList Construction time:"+(end-start));
	}
	

	public static void main(String[] args) {
		ArrayListVsLinkedList obj=new ArrayListVsLinkedList();
		obj.arrayListTime();
		obj.linkedListTime();
	}
}
