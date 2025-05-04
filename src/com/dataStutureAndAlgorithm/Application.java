package com.dataStutureAndAlgorithm;

public class Application {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.append(10);
		linkedList.append(20);
		linkedList.append(30);
		
		
		linkedList.addFirst(00);;
		linkedList.addLast(40);
		linkedList.append(50);
		
		linkedList.printList();
		
		linkedList.addAffer(11, 20);
		linkedList.printList();
	}

}
