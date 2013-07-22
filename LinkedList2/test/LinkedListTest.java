import junit.framework.TestCase;

public class LinkedListTest extends TestCase {

	// 1
	public void testCreateEmptyLinkedList() {
		MyLinkedList linkedList = new MyLinkedList();
		assertEquals(0, linkedList.size());
	}
}
