package kr.co.dendrocopos.first.mission;

import java.util.Random;

public class Practice2 {
	public static void main(String[] args) {
		//랜덤값 뽑기
		
		double r1 = Math.random();
		int rVal1 = (int)(r1 * 16);
		int rVal2 = (int)(Math.random() * 16);
		int rVal3 = (int)(Math.random() * 15) + 1;
		int rVal4 = (int)(Math.random() * 21) + 30;
		System.out.println(rVal4);
		
		Random r2 = new Random();
		int rVal0 = r2.nextInt(21) + 30;
		System.out.println(rVal0);
	}	
}