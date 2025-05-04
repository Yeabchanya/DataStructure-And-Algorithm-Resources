package com.dataStutureAndAlgorithm;

public class LinkedList {

	public Node head;

	public void append(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}

		// 10 -> 20 -> 30
		// append -> 40
		// 10 -> 20 -> 30 ->40

		Node last = head;
		while (last.next != null) {
			last = last.next;
		}

		last.next = newNode;
	}

	// show element
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}

}
