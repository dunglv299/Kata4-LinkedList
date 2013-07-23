package com.qsoft.linkedlisttest;

import junit.framework.TestCase;

import com.qsoft.linkedlist.Node;
import com.qsoft.linkedlist.SingleLinkedList;

public class SingleLinkedListTest extends TestCase {

	public void testCreateNewEmptyList() {
		SingleLinkedList linkedList = new SingleLinkedList();
		int listSize = 10;
		createSampleData(linkedList, listSize);
		assertEquals(10, linkedList.getSize());
	}

	public void createSampleData(SingleLinkedList linkedList, int listSize) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= listSize; i++) {
			Node node = new Node();
			Object o1 = Integer.valueOf(i);
			node.setmObject(o1);
			linkedList.insert(node);
		}
	}

}
