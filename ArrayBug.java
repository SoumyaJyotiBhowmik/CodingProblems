package programs;

import java.util.ArrayList;
/*
The following code is supposed to rotate the array A by B positions.
A : [1 2 3 4 5 6]
		B : 1

		The output :

		[2 3 4 5 6 1]
*/
import java.util.Arrays;
import java.util.List;
	
public class ArrayBug {

	public static void main(String[] args) {
		ArrayList<Integer> l =  new ArrayList(Arrays.asList(1,2,3,4,5,6));
		List f = rotateArray(l,3);
		f.stream().forEach(a-> System.out.println(a));
	}
public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		    int index = 0;
			ArrayList<Integer> ret = new ArrayList<Integer>();
			for (int i = 0; i < A.size(); i++) {
			   
				ret.add(A.get((i+B) % A.size()));
			}
			return ret;
		}

}
