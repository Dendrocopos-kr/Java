package kr.co.dendrocopos.first.level2;

//버블정렬
public class Arrayorder3 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		// --------------------------설명을 돕기위한 출력문
		System.out.print("버블정렬 전 : { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
		}
		System.out.println(" }\n");
		System.out.println("[] = 비교중인 값\n");
		// --------------------------------------//

		for (int i = arr.length - 1; i > 0; i--) { // 최대개수 -1 부터 0이 되기 전까지

			// --------------------------설명을 돕기위한 출력문
			for (int k = 0; k < arr.length; k++) {
				System.out.print(k > 0 ? ", " : "");
				System.out.printf( "[%2d]" , k);
			}
			System.out.println(" <== Array 표시");
			// --------------------------------------//
			
			for (int j = 0; j < i; j++) { // 0부터 i 까지

				// --------------------------설명을 돕기위한 출력문
				for (int k = 0; k < arr.length; k++) {
					System.out.print(k > 0 ? ", " : "");
					System.out.printf((k == j || k == (j + 1)) ? "[%2d]": " %2d ",arr[k]);
				}
				System.out.printf(" => [ %2d < %2d ] = %b",arr[j + 1], arr[j],(arr[j + 1] < arr[j]));
				System.out.println((arr[j + 1] < arr[j]) ? " => 두수 변경 " : "=> Skip");
				// --------------------------------------//

				if (arr[j + 1] < arr[j]) { // j, j+1 비교 -> 배열범위 넘지 않음, 위에서 -1을 해줬기 때문
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
			System.out.println();
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
		
		System.out.print("버블정렬  후 : {");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
		}
		System.out.println(" }");
	}
}
