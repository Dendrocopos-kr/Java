package kr.co.dendrocopos.first.level2;

public class Array2 {
	public static void main(String[] args) {

		int[][] arr = new int[2][3];

		int[][] arr2 = { { 10, 20, 30 }, { 12, 13, 14 ,11}, { 15, 16 } }; // 가변가능

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
