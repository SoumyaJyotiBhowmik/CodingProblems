package programs;

public class hammingDistance {

	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}
	
    public static int hammingDistance(int x, int y) {
        int xor = x ^ y;
     int result = 0;
         
         while(xor > 0){
             result += xor & 1;
             xor = xor >> 1;
         }
         return result;
     }

}
