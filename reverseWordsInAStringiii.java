package programs;

import java.util.Stack;

public class reverseWordsInAStringiii {

	public static void main(String[] args) {
		//System.out.println(reverseWords("Let's take LeetCode contest"));
		//System.out.println(reverseWords2("Let's take LeetCode contest"));
		System.out.println(reverseWordsBest ("Let's take LeetCode contest"));
	}
	public static String reverseWordsBest(String s) {
		int i=0,j=0;
		
		char ch[] = s.toCharArray();
		for(;j< ch.length;j++) {
			if(ch[j] == ' ') {
				reverseWord(ch,i,j-1);
				i = j+1;
			}
		}
		reverseWord(ch,i,j-1);
		return new String(ch);
	}
	
	 private static void reverseWord(char[] ch, int start, int end) {
		
		 for(;start< end; start++,end--) {
			 char temp = ch[start];
			 ch[start] = ch[end];
			 ch[end] = temp;
		 }
		
	}
	public static String reverseWords(String s) {
		
	        StringBuilder str = new StringBuilder();
	        Stack<Character> stack = new Stack<Character>();
	        for(char ch : s.toCharArray()){
	           if(ch != ' '){
	               stack.push(ch);
	           }else{
	                while(!stack.isEmpty()){
	                str.append(stack.pop());
	                 }
	               str.append(" ");
	           }
	        }
	        while(!stack.isEmpty()){
                str.append(stack.pop());
                 }
	        return str.toString();
	    }
	 
	 public static String reverseWords2(String s) {
	        StringBuilder str = new StringBuilder();
	       
	        String[] words = s.split(" ");
	        for(String word : words){
	           str.append(new StringBuffer(word).reverse().toString() + " ");
	        }
	        
	        return str.toString().trim();
	    }

}
