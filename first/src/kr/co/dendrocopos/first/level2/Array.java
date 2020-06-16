package kr.co.dendrocopos.first.level2;

public class Array {
	public static void main(String[] args) {
		int max_array_num = 100;
		int[] arr_int = new int[max_array_num];
		char[] arr_char = new char[max_array_num];
		double[] arr_double = new double[max_array_num];
		String[] arr_String = new String[max_array_num];

		int[] arr_int2 = { 10, 20, 30, 40 };

		for (int i = 0; i < arr_int2.length; i++) {
			System.out.println(arr_int2[i]);
		}
	}
}
