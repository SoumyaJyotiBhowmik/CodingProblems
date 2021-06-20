package programs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class validParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("isValid:"+isValid("[]"));
	}
	  public static boolean isValid(String s) {
	      
		  Stack<Character> stack = new Stack<Character>();
		  
		  for(char ch : s.toCharArray()) {
			  if(ch == '[' || ch == '(' || ch == '{') {
				  stack.push(ch);
			  }else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
				  stack.pop();
			  }
			  else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
				  stack.pop();
			  }
			  else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
				  stack.pop();
			  }else {
				  return false;
			  }
		  }
		  return stack.isEmpty();
	        }

}
