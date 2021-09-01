package programs;

public class checkStringRotation {

	public static void main(String[] args) {
		System.out.println(isStringRotation1("ABCDE","CDEAB"));

	}
	//Appending original string twice(s3) and checking if s2 is a substring of s3
	public static boolean isStringRotation1(String s1,String s2) {
		
		String s3 = s1+s1;
		return s3.contains(s2);
		
	}
	//

}
