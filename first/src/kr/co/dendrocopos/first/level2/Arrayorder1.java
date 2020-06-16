package kr.co.dendrocopos.first.level2;

//순차정렬
public class Arrayorder1 {
	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
}
