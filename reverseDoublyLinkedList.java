package programs;

public class reverseDoublyLinkedList {

	public static void main(String[] args) {
	
		DoublyLinkedList list = new DoublyLinkedList();
		list.addAtFront(6);
		list.addAtFront(2);
		list.addAtEnd(9);
		list.printList();
		System.out.println("After reversing");
		list.reverseList();
		list.printList();
		list.addAtEnd(1);
		list.addAtFront(11);
		list.printList();

	}

}
class DoublyLinkedList{
	
	DoubleNode head;
	DoubleNode tail;
	
	public DoublyLinkedList() {
	head = null;
	tail = null;
	}
	
	public void addAtFront(int data) {
		DoubleNode node = new DoubleNode(data);
		if(head == null) {
			head = tail = node;
		}else {
		node.next = head;
		node.prev = null;
		head = node;
		}
	}
	public void addAtEnd(int data) {
		DoubleNode node = new DoubleNode(data);
		if(tail == null) {
			head = tail = node;
		}else {
		tail.next = node;
		node.prev = tail;
		node.next = null;
		tail = node;
		}
	}
	public void printList() {
		if(head == null) {
			System.out.println("Empty List");
		}else {
			DoubleNode temp = head;
			
			System.out.print("List is ");
			while(temp != null) {
				System.out.print(" <--> ");
				System.out.print(temp.data);
				temp = temp.next;
			}
		}
		System.out.println();
	}
	
	public void reverseList() {
		DoubleNode prev = null;
		DoubleNode next = null;
		DoubleNode temp = head;
		tail = head;
		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			temp.prev = next;
			prev = temp;
			temp = next;
		}
		head = prev;
	}
	
}
class DoubleNode{
	
	int data;
	DoubleNode prev;
	DoubleNode next;
	DoubleNode(int data){
	this.data = data;	
	prev = null;
	next = null;
	}
}
