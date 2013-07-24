package com.qsoft.linkedlisttest;

import com.qsoft.linkedlist.Node;
import com.qsoft.linkedlist.SingleLinkedList;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {
	SingleLinkedList linkedList;
	int size;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		linkedList = new SingleLinkedList();
		size = 10;
		createSampleSingleLinkedList(linkedList, size);
	}

	// 1
	public void testAppend() {
		assertEquals(size, linkedList.getSize());
	}

	// 2
	public void testInsertAfter() {
		int possition = 5;
		Object o1 = Integer.valueOf(100);
		Node node = new Node();
		node.setNodeValue(o1);
		linkedList.insertAfter(possition, node);
		assertEquals(100, linkedList.get(possition + 1).getNodeValue());
	}

	// 3
	public void testDeleteNode() {
		int possition = 5;
		linkedList.delete(possition);
		assertEquals(size - 1, linkedList.getSize());
	}

	// 4
	public void testGetFirst() {
		assertEquals(1, linkedList.getFirst().getNodeValue());
	}

	// 5
	public void testGetLast() {
		assertEquals(10, linkedList.getLast().getNodeValue());
	}

	// 6
	public void testGetBefore() {
		Node node = new Node();
		int possition = 5;
		node = linkedList.get(possition);
		assertEquals(4, linkedList.getBefore(node).getNodeValue());
	}

	// 7
	public void testGetAfter() {
		Node node = new Node();
		int possition = 5;
		node = linkedList.get(possition);
		assertEquals(6, linkedList.getAfter(node).getNodeValue());
	}

	// 8
	public void tetsFindNode() {
		Node node = new Node();
		Object value = Integer.valueOf(5);
		node = linkedList.find(value);
		assertEquals(5, node.getNodeValue());
	}

	// 9
	public void testInsertFirst() {
		Node node = new Node();
		Object value = Integer.valueOf(0);
		node.setNodeValue(value);
		linkedList.insertFist(node);
		assertEquals(0, linkedList.getFirst().getNodeValue());
	}

	public void createSampleSingleLinkedList(SingleLinkedList linkedList,
			int size) {
		int pos = 0;
		for (int i = 1; i <= size; i++) {
			Node node = new Node();
			node.setNodeValue(i);
			node.setPossition(pos);
			linkedList.append(node);
			pos++;
		}
	}
}
