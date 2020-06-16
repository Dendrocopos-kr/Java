package kr.co.dendrocopos.first.mission;

public class Mission9_1 {
	public static void main(String[] args) {

		int max_index = 10;
		int sum = 0;
		int multiply = 2;
		
		int[] arr_int = new int[max_index];

		for (int i = 0; i < arr_int.length; i++) {
			arr_int[i] = (i + 1) * multiply;
		}

		for (int i = 0; i < arr_int.length; i++) {
			sum += arr_int[i];
		}

		/*
		 * for (int i = 1; i < arr_int.length; i+=2) { sum += arr_int[i]; }
		 */
		for (int i = 0; i < arr_int.length; i++) {
			if (i != 0) { 
			// if( i > 0 ) {
				System.out.print(",");
			}
			System.out.print(arr_int[i]);
		}

		// System.out.println(sum);
	}
}
