package programs;

import java.util.LinkedList;
import java.util.List;

public class findSecondLargestNoInLinkedList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(35);
		list.add(1);
		list.add(10);
		list.add(34);
		list.add(1);
		int first,second;
		first = second = Integer.MIN_VALUE;
		for(int i: list) {
			if(i>first && i>second) {
				second = first;
				first = i;
			}
			if(i<first && i> second) {
				second = i;
			}
		}

		
		System.out.println("Second largest max is "+second);
	}

}
