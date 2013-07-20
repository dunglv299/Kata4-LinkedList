import java.util.ArrayList;
import java.util.List;

public class MySingleLinkedList {
	List<Integer> listNumber;

	public MySingleLinkedList() {
		// TODO Auto-generated constructor stub
		listNumber = new ArrayList<>();
	}

	public int getListSize() {
		return listNumber.size();
	}

	public void insertAfter(int nodeNumber, int value) {
		// TODO Auto-generated method stub
		listNumber.add(nodeNumber, value);
	}

	public void insert(int value) {
		// TODO Auto-generated method stub
		listNumber.add(value);
	}

	public int get(int index) {
		return listNumber.get(index - 1);
	}
}
