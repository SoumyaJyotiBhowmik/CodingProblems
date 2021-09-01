package programs;

public class PrintOppositeWithoutLogical {

	public static void main(String[] args) {
		System.out.println(print(1));
		System.out.println(print1(1));

	}
	public static int print(int a) {
		return 1-a;
	}
	//With binary operators
	public static int print1(int val) {
		return val ^ 1;
	}

}
