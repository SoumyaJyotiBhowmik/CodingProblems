package programs;

import java.util.ArrayDeque;
import java.util.Deque;

public class reverseLinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
l.printList();
//l.reverseListUsingStack();
l.reverseList();
System.out.println("List after reversal");
l.printList();
	}
	
}
class LinkedList{
	private Node head;
	int size;
	
	public void add(int value) {
		if(head == null){//empty list
			head = new Node(value);
		}else {
			Node temp = head;
			while(temp.next!= null) {
				temp = temp.next;
			}
			temp.next = new Node(value);
		}
	}
	public void reverseList() {
		
		Node prev= null;
		Node next = null;
		Node temp = head;
		
		while(temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;	
		}
		head = prev;
		
	}
	public void printList() {
		Node temp = head;
		System.out.print("Head");
		while(temp != null) {
			System.out.print("--->");
			System.out.print(temp.value);
			temp=temp.next;
		}
		System.out.println();
	}
	public void reverseListUsingStack() {
		Node temp = head;
		Deque<Integer> stack = new ArrayDeque<Integer>();
		while(temp != null) {
			stack.push(temp.value);
			temp = temp.next;
		}
		head = null;
		while(!stack.isEmpty()) {
			add(stack.poll());
		}
	}
}
class Node{
	int value;
	Node next;
	Node(int value){
		this.value = value;
		next = null;
	}
}
