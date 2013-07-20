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

	public void delete(int index) {
		// TODO Auto-generated method stub
		listNumber.remove(index - 1);
	}

	public int getFirst() {
		// TODO Auto-generated method stub
		return listNumber.get(0);
	}

	public int getLast() {
		// TODO Auto-generated method stub
		return listNumber.get(listNumber.size() - 1);
	}

	public int getBefore(int index) {
		// TODO Auto-generated method stub
		return listNumber.get(index - 2);
	}

	public int getAfter(int index) {
		// TODO Auto-generated method stub
		return listNumber.get(index);
	}

	public int find(int value) {
		// TODO Auto-generated method stub
		return listNumber.indexOf(value) + 1;
	}

	public int append(int value) {
		// TODO Auto-generated method stub
		listNumber.add(value);
		return listNumber.size();
	}

	public int insertFirst(int i) {
		// TODO Auto-generated method stub
		return -1;
	}

}
