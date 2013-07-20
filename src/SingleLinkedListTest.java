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
}
