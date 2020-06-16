package kr.co.dendrocopos.first.level2;

//선택정렬
public class Arrayorder2 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		int index = 0;

		// --------------------------설명을 돕기위한 출력문
		System.out.print("선택정렬 전 : { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
		}
		System.out.println(" }\n() = i 위치, [],<> = 비교중인 값 => 비교하여 작은값에 <>표시 \n");
		// --------------------------------------//

		for (int i = 0; i < arr.length - 1; i++) {
			index = i;

			
			// --------------------------설명을 돕기위한 출력문
			for (int k = 0; k < arr.length; k++) {
				System.out.printf(k > 0 ? ", [%2d]" : "[%2d]",k);
			}
			System.out.println(" <== Array 표시");
			// --------------------------------------//
			
			
			for (int j = i + 1; j < arr.length; j++) {
				
				// --------------------------설명을 돕기위한 출력문
				for (int k = 0; k < arr.length; k++) {
					System.out.print(k > 0 ? ", " : "");
					if( k == index) {
						System.out.printf("<%2d>",arr[k]);
					}else if ( k == i ) {
						System.out.printf("(%2d)",arr[k]);
					}else if ( k == j ) {
						System.out.printf("[%2d]",arr[k]);
					}else {
						System.out.printf(" %2d ",arr[k]);
					}
				}
				// --------------------------------------//
				
				if (arr[index] > arr[j]) {
					index = j;
				}
				
				// --------------------------설명을 돕기위한 출력문
				System.out.println("   \t현재 제일 작은값 위치 (least) : "+ index);
				// --------------------------------------//
				
			}
			
			
			if (index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				
				// --------------------------설명을 돕기위한 출력문
				System.out.printf(" => [ %2d > %2d ] ... ()와<> 교환 \n",arr[i],arr[index]);		
			}else {
				System.out.printf(" => 교환없음 \n");
				// --------------------------------------//		
				
			}

			System.out.println();

		}
		System.out.print("선택정렬  후 : { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i > 0 ? ", " + arr[i] : arr[i]);
		}
		System.out.println(" }");
	}
}
