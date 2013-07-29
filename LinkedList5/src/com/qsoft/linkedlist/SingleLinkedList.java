package com.qsoft.linkedlist;

import java.util.LinkedList;

public class SingleLinkedList {
	private LinkedList<Node> listNumber;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		listNumber = new LinkedList<Node>();
	}

	public void add(Node node) {
		// TODO Auto-generated method stub
		listNumber.add(node);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return listNumber.size();
	}

	public void insertAfter(int location, Node node) {
		// TODO Auto-generated method stub
		listNumber.add(location, node);
	}

	public Node get(int location) {
		// TODO Auto-generated method stub
		return listNumber.get(location - 1);
	}

	public Node getFist() {
		// TODO Auto-generated method stub
		return listNumber.getFirst();
	}

	public Node getLast() {
		// TODO Auto-generated method stub
		return listNumber.getLast();
	}

}
