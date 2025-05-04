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

	// insert First
	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	// addLast
	public void addLast(int data) {

		Node newNode = new Node(data); // create new node
		Node lastNode = head;

		// find last node
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}

		lastNode.next = newNode;
	}

	// add Middle
	public void addAffer(int data, int previousData) {

		Node currentNode = head;

		// Find current node
		while (currentNode != null && currentNode.data != previousData) {
			currentNode = currentNode.next;
		}

		if (currentNode == null) {
			System.out.println("node null =" + previousData);
			return;
		}
		//
		Node newNode = new Node(data); // create new node
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}
}
