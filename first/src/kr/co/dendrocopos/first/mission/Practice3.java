package kr.co.dendrocopos.first.mission;

import java.util.Random;

public class Practice3 {
	public static void main(String[] args) {
		int arrLength = 10;
		int minRandomNumber = 1;
		int maxRandomNumber = arrLength + minRandomNumber;
		int[] arrRandomNumber = new int[arrLength];


		for (int i = 0; i < arrRandomNumber.length; i++) {
			//int random_num = (int)(Math.random() * maxRandomNumber + minRandomNumber);
			
			Random random = new Random();
			int random_num = random.nextInt(maxRandomNumber - minRandomNumber) + minRandomNumber;
			
			System.out.println("나온 랜덤값: " + random_num);
			
			arrRandomNumber[i] = random_num;	
			for (int j = 0; j < i; j++) {
				if (arrRandomNumber[i] ==arrRandomNumber[j]) {
					i --;
					break;
				}
			}
		}
		
		for (int i : arrRandomNumber) {
			System.out.print(i + ",");
		}
	}
}
