package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("isPalindrome ::"+isPalindrome(121));

	}
	 public static boolean isPalindrome(int x) {
	        if(x == 0) return true;
	        if(x % 10 == 0 || x < 0) return false;
	        int rev =0;
	        while(x > rev){
	            int digit = x % 10;
	            rev = rev*10 + digit;
	            x/= 10;
	        }
	        return (x == rev || x == rev/10);
	    }

}
