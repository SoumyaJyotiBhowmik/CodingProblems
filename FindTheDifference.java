package programs;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifference {

	public static void main(String[] args) {
		System.out.println(findTheDifferenceEasy("abcd","abcde"));
		System.out.println(findTheDifferenceBitWise("abcd","abcde"));
		System.out.println(findTheDifference("abcd","abcde"));

	}
	public static  char findTheDifferenceEasy(String s, String t) {
	    int totalSum = 0;
        for(char ch : t.toCharArray()) {
        	totalSum += (int) ch;
        }
        for(char ch : s.toCharArray()) {
        	totalSum -= (int) ch;
        }
        return (char) totalSum;
    }
	public static  char findTheDifferenceBitWise(String s, String t) {
	       
        List<Character> list = new ArrayList<Character>();
        int c = 0;

        for(char ch : s.toCharArray()){
        	c = c^ (int) ch;
        }
        for(char ch : t.toCharArray()){
        	c = c^ (int) ch;
        }
        return (char) c;
    }
	public static  char findTheDifference(String s, String t) {
	       
        List<Character> list = new ArrayList<Character>();
        int sum1 = 0;
        int sum2 = 0;
        for(char ch : s.toCharArray()){
        sum1 += (int) ch; 
        }
        for(char ch : t.toCharArray()){
        	 sum2 += (int) ch; 
        }
        return (char) (sum2- sum1);
    }
}
