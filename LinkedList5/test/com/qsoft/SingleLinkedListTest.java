package com.qsoft;

import com.qsoft.linkedlist.Node;
import com.qsoft.linkedlist.SingleLinkedList;

import junit.framework.TestCase;

public class SingleLinkedListTest extends TestCase {
	private SingleLinkedList linkedList;
	private int size = 10;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		linkedList = new SingleLinkedList();
		createSampleSingleLinkedList(linkedList, size);
	}

	// 1
	public void testGetSizeOfList() {
		assertEquals(size, linkedList.getSize());
	}

	// 2
	public void testInsertToAfterANode() {
		Node node = new Node();
		Object o1 = Integer.valueOf(100);
		node.setNodeValue(o1);
		int location = 5;
		linkedList.insertAfter(location, node);
		assertEquals(100, linkedList.get(location + 1).getNodeValue());
	}

	// 3
	public void testGetFirstNode() {
		Node firstNode = new Node();
		firstNode = linkedList.getFist();
		assertEquals(1, firstNode.getNodeValue());
	}

	// 4
	public void testGetLastNode() {
		Node lastNode = new Node();
		lastNode = linkedList.getLast();
		assertEquals(10, lastNode.getNodeValue());
	}

	public void createSampleSingleLinkedList(SingleLinkedList linkedList,
			int size) {

		for (int i = 0; i < size; i++) {
			Node node = new Node();
			Object o1 = Integer.valueOf(i + 1);
			node.setNodeValue(o1);
			linkedList.add(node);
		}
	}
}
