package kr.co.dendrocopos.first.level2;

//순차정렬
public class Arrayorder1 {
	public static void main(String[] args) {

		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		
		// --------------------------설명을 돕기위한 출력문
		System.out.print("순차정렬 전 : { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
		}
		System.out.println(" }\n[] = 비교중인 값\n");
		// --------------------------------------//
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			/*
			// --------------------------설명을 돕기위한 출력문
			for (int k = 0; k < arr.length; k++) {
				System.out.printf(k > 0 ? ", [%2d]" : "[%2d]",k);
			}
			System.out.println(" <== Array 표시");
			// --------------------------------------//
			*/
			
			for (int j = i + 1; j < arr.length; j++) {

				// --------------------------설명을 돕기위한 출력문
				for (int k = 0; k < arr.length; k++) {
					System.out.print(k > 0 ? ", " : "");
					System.out.printf(k == i || k == j ? "[%2d]" : " %2d ", arr[k]);
				}
				System.out.printf(" = [ %2d > %2d ] %s\n", arr[i], arr[j], (arr[i] > arr[j]) ? "=> 두수 변경 " : "");
				// --------------------------------------//

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println();
		}
		System.out.print("순차정렬 후 : { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
		}
		System.out.println(" }");
	}
}
