package kr.co.dendrocopos.first.level2;

//버블정렬
public class Arrayorder3 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };

		for (int i = arr.length - 1; i > 0; i--) { // 최대개수 -1 부터 0이 되기 전까지
			for (int j = 0; j < i; j++) { // 0부터 i 까지
				if (arr[j + 1] < arr[j]) { // j, j+1 비교 -> 배열범위 넘지 않음, 위에서 -1을 해줬기 때문
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
				// System.out.print(i + " " + j + "," );
			}
			// System.out.println();
		}

		/*
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		*/
		
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
}
