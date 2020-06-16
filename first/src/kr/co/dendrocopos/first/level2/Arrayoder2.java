package kr.co.dendrocopos.first.level2;

//선택정렬
public class Arrayoder2 {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 2, 46, 92, 1, 19 };
		int index = 0;
		
		for (int k : arr) {
			System.out.print(k + ", ");
		}
		System.out.println();
		
		for (int i = 0; i < arr.length - 1; i++) {
			index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if ( arr[index] > arr[j]) {
					index = j;					
				}
			}

			if( index != i) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				System.out.println("<<< "+arr[i] + " <-> " + arr[index]+" >>>");
				for (int k : arr) {
					System.out.print(k + ", ");
				}
				
			}
			
			System.out.println();
			
		}
		for (int i : arr) {
			System.out.print(i + ", ");
		}
	}
}
