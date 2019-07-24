package myLinkedList.SeokWoo;

public class Node {
	private Object data;
	private Node nextNode;
	private Node prevNode;
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prevNode) {
		this.prevNode = prevNode;
	}
	
	Node(Object data){
		this.data = data;
		this.nextNode = null;
		this.prevNode = null;
	}
	@Override
	public String toString() {
		return String.valueOf(this.data);
	}
	
	
}
