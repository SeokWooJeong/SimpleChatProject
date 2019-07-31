package myLinkedList.JeongHun;

import java.util.LinkedList;

class MyLinkedList {
	private Node head;
	private Node tail;
	public int size;
	
	public MyLinkedList(){
		head = null;
		tail = null;
		size = 0;
	}
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
		
		if (head.next == null)
			tail = newNode;
		size++;
	}

	public void addLast(int data) {
		Node newNode = new Node(data);
		newNode.prev = tail;
		if (tail != null)
			tail.next = newNode;
		tail = newNode;
		
		if (tail.prev == null)
			head = newNode;
		size++;
	}

	public void add(int data) {
		addLast(data);
	}

	public void removeFrist() {
		head = head.next;
		if (head != null)
			head.prev = null;
		size--;
	}

	public void removeLast() {
		tail = tail.prev;
		if (tail != null)
			tail.next = null;
		size--;
	}

	public void remove(int index) {
		if (index == 0) 
			removeFrist();
		else if (index == size-1) 
			removeLast();
		else {
			Node temp = node(index-1);
			temp.next = temp.next.next;
			temp.next.prev = temp;
			size--;
		}
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
			System.out.println("index값이 size를 초과했습니다.");
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
//		MyLinkedList list = new MyLinkedList();
//		list.removeLast();
//		System.out.println(list.size);
		LinkedList test = new LinkedList();
		System.out.println(test.getClass());
	}
}
