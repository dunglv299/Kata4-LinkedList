package com.qsoft.linkedlist;

import java.util.LinkedList;

public class SingleLinkedList {

	LinkedList<Node> listNumber;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		listNumber = new LinkedList<Node>();
	}

	public void insert(Node node) {
		// TODO Auto-generated method stub
		listNumber.addLast(node);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return listNumber.size();
	}

	public void insertAfter(int position, Node node) {
		// TODO Auto-generated method stub

	}

	public Node get(int location) {
		// TODO Auto-generated method stub
		return listNumber.get(location - 1);
	}

}
