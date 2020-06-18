package kr.co.dendrocopos.first.level2;

public class Method1 {
	
	public static void main(String[] args) {
		int[] a = { 10, 15 };

		println_sum(a);
		println_sum(a[0], a[1]);
		printfln_minus(20,5);
	}
	
	public static void println_sum(int[] n1) {
		int sum = 0;
		for(int i = 0 ; i < n1.length; i++) {
			sum += n1[i];
		}

		System.out.println( sum );
	}
	public static void println_sum(int n1, int n2) {
		System.out.println( n1 + n2 );
	}
	
	public static void printfln_minus(int n1, int n2) {
		System.out.println( n1 - n2 );
	}
	
}
