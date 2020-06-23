package kr.co.dendrocopos.first.level3;

import java.util.Arrays;

public class List {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int[] temp = new int[4];
	
		for(int j = 0 ; j < arr.length; j++){
			temp[j] = arr[j];		
		}
		temp[arr.length] = 4;
		
		arr = temp;
		
		System.out.println(Arrays.toString(arr));
	}
}
