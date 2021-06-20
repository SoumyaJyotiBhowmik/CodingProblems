package programs;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfArrayItems {

	public static void main(String[] args) {

		//doSum();
		doSumWithStream();
		

	}

	private static void doSumWithStream() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the numbers with space separtor");
	
		String string = sc.nextLine();
		long sum = Arrays.asList(string.split(" ")).parallelStream().mapToLong(i->Long.parseLong(i)).sum();
		System.out.println(sum);
		
	}

	private static void doSum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the numbers with space separtor");
		long sum=0;
		String [] string = sc.nextLine().split(" ");
		for(int i=0;i<num;i++) {
			sum += Long.parseLong(string[i]);
		}
		System.out.println(sum);
		
	}

}
