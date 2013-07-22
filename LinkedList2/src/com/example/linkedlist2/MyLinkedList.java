package com.example.linkedlist2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
	private LinkedList<Node> listNode;

	public MyLinkedList() {
		listNode = new LinkedList<Node>();
		// TODO Auto-generated constructor stub
	}

	public List<Node> createListNode(int size) {

		for (int i = 1; i <= size; i++) {
			Node node = new Node();
			node.setNodeValue(i);
			listNode.add(node);
		}
		return listNode;
	}

	public int size() {
		// TODO Auto-generated method stub
		return listNode.size();
	}

	public void insertAfter(int nodeNumber, Object o1) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.setNodeValue((Integer) o1);
		listNode.add(nodeNumber, node);
	}

	public void delete(int nodeNumber) {
		// TODO Auto-generated method stub
		listNode.remove(nodeNumber - 1);
	}

	public Node getFirst() {
		// TODO Auto-generated method stub
		return listNode.getFirst();
	}

	public Node getBefore(int nodeNumber) {
		// TODO Auto-generated method stub
		return listNode.get(nodeNumber - 2);
	}

	public Node getAfter(int nodeNumber) {
		// TODO Auto-generated method stub
		return listNode.get(nodeNumber);
	}

	public Node find(Object o1) {
		// TODO Auto-generated method stub
		for (Node node : listNode) {
			if (node.getNodeValue() == (Integer) o1) {
				return node;
			}
		}
		return null;
	}

	public void append(Object o1) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.setNodeValue((Integer) o1);
		listNode.addLast(node);
	}

	public void insertFirst(Object o1) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.setNodeValue((Integer) o1);
		listNode.addFirst(node);
	}

}
