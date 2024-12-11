package com.collection_frameworks;

import java.util.LinkedList;

public class QClassLinkedList {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.offer(10);//insertion order is maintained
		ll.offer("java");//heterogeneous data is allowed
		ll.offer(null);//null value is allowed
		ll.offer(20);
		ll.offer(30);
		ll.offer(40);
		ll.offer(5);
		ll.offer(50);
		ll.offer(60);
		ll.add(120);//we can use add()
		ll.offer(10);//duplicates are allowed
		System.out.println(ll);
		
		
	}

}
