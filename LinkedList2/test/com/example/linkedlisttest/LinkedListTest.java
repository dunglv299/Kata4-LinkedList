package com.example.linkedlisttest;

import com.example.linkedlist2.MyLinkedList;
import com.example.linkedlist2.Node;

import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

	// 1
	public void testCreateEmptyLinkedList() {
		MyLinkedList linkedList = new MyLinkedList();
		assertEquals(0, linkedList.size());
	}

	// 2
	public void testInsertAfter() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		Object o1 = Integer.valueOf(1);
		int nodeNumber = 5;
		linkedList.insertAfter(nodeNumber, o1);
		assertEquals(11, linkedList.size());
	}

	// 3
	public void testDelete() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		int nodeNumber = 3;
		linkedList.delete(nodeNumber);
		assertEquals(9, linkedList.size());
	}

	// 4
	public void testGetFirst() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		assertEquals(1, linkedList.getFirst().getNodeValue());
	}

	// 5
	public void testGetBefore() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		assertEquals(4, linkedList.getBefore(5).getNodeValue());
	}

	// 6
	public void testGetAfter() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		assertEquals(6, linkedList.getAfter(5).getNodeValue());
	}

	// 7
	public void testFind() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		Object o1 = Integer.valueOf(5);
		assertEquals(5, linkedList.find(o1).getNodeValue());
	}

	// 8
	public void testAppend() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		Object o1 = Integer.valueOf(5);
		linkedList.append(o1);
		assertEquals(5, linkedList.getAfter(10).getNodeValue());
	}

	// 9
	public void testInsertFirst() {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.createListNode(10);
		Object o1 = Integer.valueOf(5);
		linkedList.insertFirst(o1);
		assertEquals(5, linkedList.getFirst().getNodeValue());

	}
}
