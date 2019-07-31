package myLinkedList.SeokWoo;

public class Main {

	public static void main(String[] args) {
		MyLinkedList myLinkedListInteger = new MyLinkedList();
		myLinkedListInteger.addLast(3);//3
		myLinkedListInteger.addFirst(1);//13ㄴ
		myLinkedListInteger.addLast(4);//3
		myLinkedListInteger.add(1,2);
		System.out.println(myLinkedListInteger.toString());
		System.out.println("size = "+myLinkedListInteger.size());
		System.out.println("myLinkedListInteger.get(0) = "+myLinkedListInteger.get(0));
		System.out.println("myLinkedListInteger.get(1) = "+myLinkedListInteger.get(1));
		System.out.println("myLinkedListInteger.get(2) = "+myLinkedListInteger.get(2));
//		System.out.println("myLinkedListInteger.get(4) = "+myLinkedListInteger.get(4));
		System.out.println("myLinkedListInteger.getNode(0).getData() = "+myLinkedListInteger.getNode(0).getData());
		System.out.println("myLinkedListInteger.indexOf(3) = "+myLinkedListInteger.indexOf(3));
		myLinkedListInteger.removeFirst();
		myLinkedListInteger.removeLast();
		myLinkedListInteger.remove(1);
		System.out.println(myLinkedListInteger.toString());
		System.out.println("\n=================================================\n");
		MyLinkedList myLinkedListString = new MyLinkedList();
		myLinkedListString.addLast("test3");
		myLinkedListString.addFirst("test1");
		myLinkedListString.addLast("test4");
		myLinkedListString.add(1,"test2");
		System.out.println(myLinkedListString.toString());
		System.out.println("size = "+myLinkedListString.size());
		System.out.println("myLinkedListString.get(0) = "+myLinkedListString.get(0));
		System.out.println("myLinkedListString.get(1) = "+myLinkedListString.get(1));
		System.out.println("myLinkedListString.get(2) = "+myLinkedListString.get(2));
		System.out.println("myLinkedListString.getNode(0).getData() = "+myLinkedListString.getNode(0).getData());
		System.out.println("myLinkedListString.indexOf(3) = "+myLinkedListString.indexOf(3));
		myLinkedListString.removeFirst();
		myLinkedListString.removeLast();
		myLinkedListString.remove(1);
		System.out.println(myLinkedListString.toString());
	}

}
