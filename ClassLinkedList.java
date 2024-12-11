package com.collection_frameworks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ClassLinkedList {
	public static void main(String[] args) {
		//linked list occupies more memory than array list
		//so construction time is more for linked list
		LinkedList ll=new LinkedList();
		ll.add(10);//Insertion order is maintained
		ll.add("java");//Heterogeneous data is allowed
		ll.add(null);//null is allowed
		ll.add(20);//it is available from java1.
		ll.add(30);//default capacity:0
		ll.add(40);//Elements will be stored in the form of Node[previous address,data,next address] structure
		ll.add(50);//it is not synchronized
		ll.add(10);//duplicates are allowed
		
		System.out.println(ll);
		
		ListIterator li=ll.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		
		
		
		System.out.println();
		
		//previous() and hasPrevious() methods does not display anything when we use it before forward{next()} printing.
		//Because initially the cursor will be at starting position so  hasPrevious() will return false and previous() will not return anything.
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
		
		System.out.println();
		
		
		Iterator di=ll.descendingIterator();
		while(di.hasNext()) {
			System.out.print(di.next()+" ");
		}
	}

}
