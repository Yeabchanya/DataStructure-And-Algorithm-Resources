package com.dataStutureAndAlgorithm;

import java.util.LinkedList;

public class ApplicationTesting {

	public static void main(String[] args) {
		
		System.out.println("Test Linked in java");
		
		LinkedList<String> list = new LinkedList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		
		list.addFirst("00");
		list.addLast("DD");
		
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
	}

}
