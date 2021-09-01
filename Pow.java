package programs;

public class Pow {

	public static void main(String[] args) {
		//System.out.println(powRecursive(2,-5));
		System.out.println(myPow(2,10));
		System.out.println(myPow(2.00000,-2147483648));

	}
	public static double powRecursive(int val,int power) {
		int res = 0;
		if(power < 0) {
			 res = pow(val,power*-1);
		}
		else {
			res = pow(val,power);
		}
		if(power<0) {
			return 1/res;
		}else {
			return res;
		}
	}
	
	public static int pow(int val,int power) {
		if(val == 0) return 1;
		else if(power == 1) {
			return  val;
		}else if(power % 2 != 0) {
			return val * pow(val,power-1);
		}else {
			return pow(val,power/2) * pow(val,power/2);
		}
	}
	 public static double myPow(double x, int n) {
	      
		 if(n == 0) return 1;
		 long pow = (n < 0) ? (-1*n) : n;
		 double res = 1.0;
		 
		 while(pow > 0) {
			 if((pow & 1) == 1) {//odd
				 res *= x;
				 pow--;
			 }else
			 {
				 x *= x;
				 pow>>=1;
			 }
		 }
		 
		 return (n<0)? (double)(1.0)/(double)(res) : res;
	    }

}
