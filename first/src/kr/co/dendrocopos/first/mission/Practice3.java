package kr.co.dendrocopos.first.mission;

import java.util.Random;

public class Practice3 {
	public static void main(String[] args) {
		int len = 10;
		int min_random_num = 1;
		int max_random_num = len + min_random_num;
		int[] arr_random = new int[len];


		for (int i = 0; i < arr_random.length; i++) {
			//int random_num = (int)(Math.random() * max_random_num + min_random_num);
			
			Random random = new Random();
			int random_num = random.nextInt(max_random_num - min_random_num) + min_random_num;
			
			System.out.println("나온 랜덤값: " + random_num);
			
			arr_random[i] = random_num;	
			for (int j = 0; j < i; j++) {
				if (arr_random[i] == arr_random[j]) {
					i --;
					break;
				}
			}
		}
		
		for (int i : arr_random) {
			System.out.print(i + ",");
		}
	}
}
