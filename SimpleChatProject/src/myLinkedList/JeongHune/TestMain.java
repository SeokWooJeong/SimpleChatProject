package myLinkedList.JeongHune;

class MyLinkedList {
	private Node head = null;
	private Node tail = null;
	private int size = 0;

	private class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		if (head != null)
			head.prev = newNode;
		head = newNode;
		size++;
		if (head.next == null)
			tail = newNode;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		newNode.prev = tail;
		if (tail != null)
			tail.next = newNode;
		tail = newNode;
		size++;
		if (tail.prev == null)
			head = newNode;
	}

	public void add(int data) {
		addLast(data);
	}

	public void removeFrist() {
		head = head.next;
		if (head != null)
			head.prev = null;
		// size--;
	}

	public void removeLast() {
		tail = tail.prev;
		tail.next = null;
		// size--;
	}

	public void remove(int index) {
		if (index == 0)
			removeFrist();
		if (index == size)
			removeLast();

		Node temp = node(index - 1);
		temp.next.prev = temp;

		size--;

	}

	public void remove() {
		remove(size - 1);
	}

	public void set(int index, int data) {
		node(index).data = data;
	}

	public int get(int index) {
		return node(index).data;
	}

	Node node(int index) {
		if (index > size - 1) {
			System.out.println("에러");
			throw new NullPointerException();
		} else if (index < size / 2) {
			Node x = head;
			for (int i = 0; i < index; i++)
				x = x.next;
			return x;
		} else {
			Node x = tail;
			for (int i = size - 1; i > index; i--)
				x = x.prev;
			return x;
		}

	}

	public void printAll() {
		System.out.print("[");
		for (int i = 0; i < size; ++i) {
			System.out.print(node(i).data + " ");
		}
		System.out.println("]");

	}

}

public class TestMain {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addFirst(3);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		list.addLast(1111);

		list.printAll();
		list.remove();
		list.printAll();

	}
}
