package com.qsoft.linkedlisttest;

import junit.framework.TestCase;

import com.qsoft.linkedlist.Node;
import com.qsoft.linkedlist.SingleLinkedList;

public class SingleLinkedListTest extends TestCase {
	SingleLinkedList linkedList;
	int listSize;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		linkedList = new SingleLinkedList();
		listSize = 10;
	}

	public void createSampleData(SingleLinkedList linkedList, int listSize) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= listSize; i++) {
			Node node = new Node();
			Object o1 = Integer.valueOf(i);
			node.setValue(o1);
			linkedList.insert(node);
		}
	}

	// 1
	public void testCreateNewEmptyList() {
		createSampleData(linkedList, listSize);
		assertEquals(10, linkedList.getSize());
	}

	// 2
	public void testInsertAfter() {
		createSampleData(linkedList, listSize);
		int position = 5;
		Object o1 = Integer.valueOf(100);
		Node node = new Node();
		node.setValue(o1);
		linkedList.insertAfter(position, node);
		assertEquals(100, linkedList.get(6).getValue());
	}

	// 3
	public void testDeleteNode() {
		createSampleData(linkedList, listSize);
		linkedList.delete(7);
		assertEquals(9, linkedList.getSize());
	}

	// 4
	public void testGetFirstNode() {
		createSampleData(linkedList, listSize);
		Node node = linkedList.getFirstNode();
		assertEquals(1, node.getValue());
	}

	// 5
	public void testGetLastNode() {
		createSampleData(linkedList, listSize);
		Node node = linkedList.getLastNode();
		assertEquals(10, node.getValue());
	}

	// 6
	public void testGetBeforeNode() {
		createSampleData(linkedList, listSize);
		int possition = 5;
		Node node = linkedList.getBefore(possition);
		assertEquals(4, node.getValue());
	}

	// 7
	public void testGetAfterNode() {
		createSampleData(linkedList, listSize);
		int possition = 5;
		Node node = linkedList.getAfter(possition);
		assertEquals(6, node.getValue());
	}

	// 8
	public void testFindNode() {
		createSampleData(linkedList, listSize);
		Object o1 = Integer.valueOf(10);
		Node node = linkedList.find(o1);
		assertEquals(10, node.getValue());
	}

	// 9
	public void testAppend() {
		createSampleData(linkedList, listSize);
		Object o1 = Integer.valueOf(11);
		linkedList.append(o1);
		assertEquals(11, linkedList.get(11).getValue());
	}
}
