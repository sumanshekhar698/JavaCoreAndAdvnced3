package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();// MinHeap
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());// MaxHeap

		priorityQueue.add(4);
		priorityQueue.add(54);
		priorityQueue.add(74);
		priorityQueue.add(48);
		priorityQueue.add(42);
		priorityQueue.add(4);

		System.out.println(priorityQueue);
		Integer poll = priorityQueue.poll();
		System.out.println(poll);
		System.out.println(priorityQueue);

		poll = priorityQueue.poll();
		System.out.println(poll);
		System.out.println(priorityQueue);

		poll = priorityQueue.poll();
		System.out.println(poll);
		System.out.println(priorityQueue);
		
		Integer peek = priorityQueue.peek();
		System.out.println(peek);
		System.out.println(priorityQueue);

	}

}
