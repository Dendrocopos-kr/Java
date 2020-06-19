package kr.co.dendrocopos.first.level2;

public class Method04 {
	public static void main(String[] args) {
		sum(4, 5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
		sum("",1, 2, 3, 4, 5);
	}
	
	
	public static void sum(String g, int ...arr) {
		
	}

	public static void sum(int ...arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
}
