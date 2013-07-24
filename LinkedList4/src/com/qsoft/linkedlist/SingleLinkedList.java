package com.qsoft.linkedlist;

import java.util.LinkedList;

public class SingleLinkedList {

	LinkedList<Node> listNumber;

	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		listNumber = new LinkedList<Node>();
	}

	public void append(Node node) {
		// TODO Auto-generated method stub
		listNumber.addLast(node);
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return listNumber.size();
	}

	public void insertAfter(int possition, Node node) {
		// TODO Auto-generated method stub
		listNumber.add(possition, node);
	}

	public Node get(int i) {
		// TODO Auto-generated method stub
		return listNumber.get(i - 1);
	}

	public void delete(int possition) {
		// TODO Auto-generated method stub
		listNumber.remove(possition);
	}

	public Node getFirst() {
		// TODO Auto-generated method stub
		return listNumber.get(0);
	}

	public Node getLast() {
		// TODO Auto-generated method stub
		return listNumber.get(getSize() - 1);
	}

	public Node getBefore(Node node) {
		// TODO Auto-generated method stub
		return listNumber.get(node.getPossition() - 1);
	}

	public Node getAfter(Node node) {
		// TODO Auto-generated method stub
		return listNumber.get(node.getPossition() + 1);
	}

	public Node find(Object value) {
		// TODO Auto-generated method stub
		for (Node node : listNumber) {
			if (node.getNodeValue() == value) {
				return node;
			}
		}
		return null;
	}

	public void insertFist(Node node) {
		// TODO Auto-generated method stub
		listNumber.addFirst(node);;
	}
}
