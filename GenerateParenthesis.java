package programs;

import java.util.ArrayList;
import java.util.List;

//Create possible combination of parenthesis of n pairs
//n=2,(()),()()
//n=3,((())),(())(),()(()),etc
public class GenerateParenthesis {

	public static void main(String[] args) {
		
		int max=2;
		List<String> result = new ArrayList<String>();
		generate(max,"",result,0,0);
		result.stream().forEach(System.out::println);
		
	}

		private static void test(int s) {
		s= 12;
		
	}

		public static void generate(int max,String currentString,List<String> result,int left,int right){
			if(currentString.length() == 2*max) {
				result.add(currentString);
				return;
			}
			if(left < max) {
				generate(max,currentString+"(",result,left+1,right);
			}
			if(right<left) {
				generate(max,currentString+")",result,left,right+1);	
			}
		}
}
