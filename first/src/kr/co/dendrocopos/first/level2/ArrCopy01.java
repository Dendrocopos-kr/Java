package kr.co.dendrocopos.first.level2;

import java.util.Arrays;

public class ArrCopy01 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = null;
		
		/*
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		*/
		
		arr2 = Arrays.copyOf(arr, arr.length);

		System.out.println(arr == arr2);
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));

	}
	
}
