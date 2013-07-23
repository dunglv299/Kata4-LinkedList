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
		listNumber.add(position, node);

	}

	public Node get(int location) {
		// TODO Auto-generated method stub
		return listNumber.get(location - 1);
	}

	public void delete(int location) {
		// TODO Auto-generated method stub
		listNumber.remove(location - 1);
	}

	public Node getFirstNode() {
		// TODO Auto-generated method stub
		return listNumber.get(0);
	}

	public Node getLastNode() {
		// TODO Auto-generated method stub
		return listNumber.get(getSize() - 1);
	}

	public Node getBefore(int possition) {
		// TODO Auto-generated method stub
		return null;
	}

}
