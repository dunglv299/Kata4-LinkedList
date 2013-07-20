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
}
