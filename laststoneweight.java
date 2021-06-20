package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class laststoneweight {

	public static void main(String[] args) {

List l = new ArrayList();
l.add(2);
l.add(7);
l.add(4);
l.add(1);
l.add(8);
l.add(1);

System.out.println(lastweight(l));


	}
	
	public static int lastweight(List a) {

		
		  if(a.size() ==1) {
		  
		  return (Integer) a.get(0); }
		  
		 
		while(a.size()>1) {
			a.sort(null);
			int one = (int) a.remove(a.size()-1);
			int two = (int) a.remove(a.size()-1);
			
			if(one != two) {
				int left = one -two;
				a.add(left);
				
			}
			
			
		}
		if(a.size() == 0) {
			return 0;
		}
		
		return (Integer) a.get(0);
	
	}

}
