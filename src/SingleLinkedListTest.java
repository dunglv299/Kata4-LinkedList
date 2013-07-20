import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingleLinkedListTest {
	// step 2
	@Test
	public void testCreateNewSingleLinkedList() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		assertTrue(linkedList != null);
		assertEquals(0, linkedList.getListSize());
	}

	// step 3
	@Test
	public void testGetSizeOfList() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		assertEquals(0, linkedList.getListSize());
	}

	// step 4:
	@Test
	public void testInsertAfter() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		linkedList.insert(1);
		linkedList.insertAfter(1, 10);
		assertEquals(10, linkedList.get(2));
	}

	// step 5:
	@Test
	public void testDeleteNumber() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		linkedList.insert(10);
		linkedList.delete(1);
		assertEquals(0, linkedList.getListSize());
	}

	// step 6:
	@Test
	public void testGetFirstElement() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		linkedList.insert(10);
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.insert(13);
		assertEquals(10, linkedList.getFirst());
	}

	// step 7
	@Test
	public void testGetLastElement() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		linkedList.insert(10);
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.insert(13);
		assertEquals(13, linkedList.getLast());
	}

	// step 8
	@Test
	public void testGetBeforeElement() {
		MySingleLinkedList linkedList = new MySingleLinkedList();
		linkedList.insert(10);
		linkedList.insert(11);
		linkedList.insert(12);
		linkedList.insert(13);
		assertEquals(11, linkedList.getBefore(3));
	}
}
