package kr.co.dendrocopos.first.mission;

public class MethodMission01 {
	public static void main(String[] args) {
		//printGuGuDan( 5 );
		//printGuGuDan( 2 );

		printGuGuDan( 4, 7 );

	}

	public static void printGuGuDan(int n1) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n1, i, n1 * i);
		}
		System.out.println();
	}

	public static void printGuGuDan(int startDan, int endDan) {
		for (int i = startDan; i <= endDan; i++) {
			printGuGuDan(i);
		}
	}
}
