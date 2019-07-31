package myLinkedList.SeokWoo;

public class MyLinkedList {
	private Node headNode;
	private Node tailNode;
	private int size = 0;
	
	public int size() {
		return this.size;
	}
	
	public void addFirst(Object data) {
		Node newNode = new Node(data);//새 노드 생성
		newNode.setNextNode(headNode);//새 노드의 다음 노드를 해드노드로 지정
		if(headNode != null) headNode.setPrevNode(newNode);//새 노드가 처음 노드가 아니라면 기존의 해드노드를 뉴노드의 다음노드로 배치
		headNode = newNode;//뉴노드를 해드노드에 삽입
		size++;//사이즈 추가
		if(headNode.getNextNode() == null) tailNode = headNode; // 새 노드가 첨이라 다음 노드가 없다면 테일 노드도 새 노드로 지정		
	}
	
	public void addLast(Object data) {
		Node newNode = new Node(data);
		if(size>0) {
			tailNode.setNextNode(newNode);
			newNode.setPrevNode(tailNode);
			tailNode=newNode;
			size++;
			return;
			}
		addFirst(data);
	}
	
	public Node getNode(int index) {
		if(index>=size) {
			System.out.println("잘못된 인덱스 호출");
			return null;
		}
		if(index<size/2) {
			Node x = headNode;
			for(int i=0; i<index; i++) x=x.getNextNode();
			return x;
		}
		else {
			Node x = tailNode;
			for(int i=size-1; i>index; i--) x=x.getPrevNode();
			return x;
		}
	}
	
	public void add(int index, Object data) {
		if(index>0) {
			Node tempNode1 = getNode(index-1);
			if(tempNode1 != null) {//인덱스 초과로 tempNode1에 null 반환시 더 이상 실행 안함
				Node tempNode2 = tempNode1.getNextNode();//만약 temp1이 마지막 노드라면 null이 반활 될 것 
				Node newNode = new Node(data);
				tempNode1.setNextNode(newNode);
				newNode.setNextNode(tempNode2);
				//
				if(tempNode2 != null) tempNode2.setPrevNode(newNode);
				newNode.setPrevNode(tempNode1);
				//
				size++;
				if(newNode.getNextNode()==null) {
					tailNode = newNode;
				}
			} 
			return;
		}
		addFirst(data);//index가 0일경우 그냥 addFirst 실행
	}
	
	public String toString() {
		if(headNode != null) {
			Node tempNode = headNode;
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			while(tempNode.getNextNode() != null) {
				sb.append(tempNode.getData().toString());
				sb.append(", ");
				tempNode = tempNode.getNextNode();
			}
			sb.append(tempNode.getData().toString());
			sb.append("]");
			return sb.toString();
		}
		return "[]";
	}
	
	public void removeFirst() {
		Node tempNode = headNode;
		headNode = tempNode.getNextNode();
		Object returnData = tempNode.getData();
		tempNode = null;
		if(headNode != null) headNode.setPrevNode(null);
		size--;
	}
	
	public void remove(int index) {
		if(index != 0) {
			Node tempNode = getNode(index-1);
			if(tempNode == null) return;
			Node todoDeleted = tempNode.getNextNode();
			tempNode.setNextNode(tempNode.getNextNode().getNextNode());
			//삭제할 노드의 전후노드 연결
			if(tempNode.getNextNode() != null) tempNode.getNextNode().setPrevNode(tempNode);
			if(todoDeleted == tailNode) {
				tailNode = tempNode;
			}
			todoDeleted = null;
			size--;
			return;
		}
		removeFirst();
	}
	
	public void removeLast() {
		remove(size-1);
	}
	
	public Object get(int index) {
		Node tempNode = getNode(index);
		return tempNode.getData();
	}
	
	public int indexOf(Object data) {
		Node tempNode = headNode;
		int index = 0;
		while(tempNode.getData() != data) {
			tempNode = tempNode.getNextNode();
			index++;
			if(tempNode == null) return -1;
		}
		return index;
	}
	
}
