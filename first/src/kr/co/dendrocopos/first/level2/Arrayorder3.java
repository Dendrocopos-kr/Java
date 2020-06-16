package kr.co.dendrocopos.first.level2;

//버블정렬
public class Arrayorder3 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
}
