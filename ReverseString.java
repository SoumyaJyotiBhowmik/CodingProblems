package programs;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Reverse for Hi I am a Good Boy :: "+reverse("Hi I am a Good Boy"));

	}
	static String reverse(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : s.toCharArray()) {
			stack.push(ch);
		}
		StringBuilder str = new StringBuilder();
		for(char ch : s.toCharArray()) {
			str.append(stack.pop());
		}
		return str.toString();
	}

}
