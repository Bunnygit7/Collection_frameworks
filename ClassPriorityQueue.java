package com.collection_frameworks;

import java.util.PriorityQueue;

public class ClassPriorityQueue {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		pq.offer(100);//in priority queue initially smallest number is placed and then rest all are placed randomly
//		pq.offer("java");//heterogeneous data is not allowed
//		pq.offer(null);//null value is not allowed
		pq.offer(100);//duplicates are allowed
		pq.add(40);//we can use add()
		pq.offer(50);//insertion order is not maintained
		pq.offer(60);//default value:11
		pq.offer(20);//it is available from java 1.5v
		pq.offer(30);//it is not synchronized
		pq.offer(10);
		System.out.println(pq);
		System.out.println("popped first element==>"+pq.poll());
		System.out.println(pq);
		System.out.println("peek element====>"+pq.peek());
		System.out.println(pq);
		System.out.println("Removed using remove()===>"+pq.remove());
		System.out.println(pq);
		pq.clear();
		System.out.println(pq.poll());
		System.out.println(pq.peek());
//		System.out.println(pq.remove());//this returns an exception
		System.out.println(pq);
	}
	

	

}
