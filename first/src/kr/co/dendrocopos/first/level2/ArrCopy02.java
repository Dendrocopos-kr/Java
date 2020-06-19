package kr.co.dendrocopos.first.level2;

import java.util.Arrays;

public class ArrCopy02 {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10, 55 };
		int[] arr2 = copyArr(arr);
		int[] arr3 = copyArr(arr);

		System.out.println("arr == arr2 : " + (arr == arr2));
		System.out.println("arr == arr3 : " + (arr == arr3));
		System.out.println("arr2 == arr3 : " + (arr2 == arr3));
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
	}

	public static int[] copyArr(int[] arr) {
		
		/*
		int[] result2 = Arrays.copyOf(arr, arr.length);
		return result2;
		*/
		
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[i];
		}
		
		return result;
	}
}
