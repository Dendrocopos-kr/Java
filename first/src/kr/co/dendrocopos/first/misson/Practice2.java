package kr.co.dendrocopos.first.misson;

import java.util.Random;

public class Practice2 {
	public static void main(String[] args) {
		//랜덤값 뽑기
		
		Random random_num = new Random();
		int a  = random_num.nextInt(100) - 50;
		
		System.out.println(a);
	}
}
