package programs;

import java.util.Stack;
//Explained well in geekforgeeks
public class maximumNestingDepthOfTheParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int maxDepth(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        int max=0;
	        int curr = 0;
	        
	        for(char ch : s.toCharArray()){
	            if(ch == '('){
	                stack.push(ch);
	                curr++;
	                if(curr > max){
	                    max = curr;
	                }
	            }else if(ch == ')'){
	                if(stack.peek() == '('){
	                        stack.pop();
	                        curr--;
	                 
	                }else{
	                    return -1;
	                }
	              
	            }
	        }
	         return (stack.isEmpty()) ? max : -1;
	    }
	 
	 public int maxDepthFast(String s) {
	        
	        int max=0;
	        int curr = 0;
	        for(char ch: s.toCharArray()){
	            if(ch == '('){
	                curr++;
	                if(curr > max){
	                    max = curr;
	                }
	            }else if(ch == ')'){
	                curr--;
	            }   
	        }
	         return (curr != 0) ? -1 : max;
	    }
}
