package programs;

public class bitwise {

	public static void main(String[] args) {
		
		int a=12;
	
		/* findSetBitPos(a); 
		 * isEvenNumber(a);
		 * setithBit(a,3);
		 * clearithBit(a,3);
		 * noOfDiffBits(22,27);
		 * toggleBitsinRange(27,1,4);
		 * isKthbitSet(27,5);
		 * */
		
		
	}

	private static void isKthbitSet(int a, int k) {
		
		int mask = 1<<k-1;
		if((a&mask) == 0) {
			System.out.println("Not Set");
		}else {
			System.out.println("Set");
		}
	}

	private static void toggleBitsinRange(int a, int left, int right) {
		int mask =1<<left-1;
		int i=left+1;
		
		while(i<right) {
			mask<<=1;
			a^= mask;
			i++;
		}
		System.out.println(a);
		
	}

	private static void noOfDiffBits(int i, int j) {
		int max= i;
		int min = j;
		int count =0;
	 int mask =1;
		if(j>i)
			max = j;
		min = i;
		while( max != 0) {
			if((max&mask) != (min&mask))
			{
			++count;
			}
			max>>=1;
			min>>=1;
			
		}
		System.out.println(count);
	}

	private static void clearithBit(int a, int i) {
		int mask = 1;
		mask <<=i-1;
		System.out.println(a^mask);
		
	}

	private static void setithBit(int a, int i) {
		int mask = 1;
		mask <<=i-1;
		System.out.println(a|mask);
		
	}

	private static void isEvenNumber(int a) {
		if((a&1) == 0) {
			System.out.println("Even");
		}else {
		System.out.println("Odd");
		}
		
	}

	private static void findSetBitPos(int a) {
		int mask = 1;
		int count =0;
		
		while(a!=0 && (a&mask) == 0) {
			++count;

			  a>>=1;
	
		}
		System.out.println(count);
	}

}
