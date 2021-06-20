package programs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*Given a singly linked list, arrange the nodes such that all even index nodes appear before the odd index nodes.

When we refer to "index" we are referring to the node's zero-indexed position in the input (original) list.

The relative ordering of the nodes within the same region must be maintained.

Example 1:
Input:  5 -> 1 -> 3 -> 7 -> 3 -> X  
Output: 5 -> 3 -> 3 -> 1 -> 7 -> X 
Explanation: All the even index nodes go first, followed by the odd. The relative ordering of the nodes is maintained.

Example 2:
Input:  1 -> 2 -> 3 -> 4 -> 5 -> X
Output: 1 -> 3 -> 5 -> 2 -> 4 -> X

Example 3:
Input:  4 -> 1 -> X
Output: 4 -> 1 -> X
*/

public class evenOddPartition {

	public static void main(String[] args) {
		


		List l = new LinkedList();
		l.addAll(Arrays.asList(5,1,3,7,3));
		List lst = partition(l);
		lst.forEach(System.out::println);
	}

	public static List partition(List l) {
		List oddList = new LinkedList();
		List evenList = new LinkedList();
		for(int i=0;i<l.size();i++) {
			if(i==0) {
				evenList.add(l.get(i));
				continue;
			}
			if(i%2 != 0) {
				oddList.add(l.get(i));
			}else {
				evenList.add(l.get(i));
			}
		}
		evenList.addAll(oddList);
		return evenList;
	}

}
