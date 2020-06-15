package kr.co.dendrocopos.first.misson;

import java.util.Random;

public class Practice2 {
	public static void main(String[] args) {
		//랜덤값 뽑기
		
		Random random_num = new Random();
		int ten  = random_num.nextInt(3) + 1;
		int one = random_num.nextInt(10) + 1;
				
		int[][] card = new int[4][13];
		
		for(int i = 0 ; i < 4 ; i ++)
		{
			for( int j = 0; j < 13; j++)
			{
				card[i][j] = j > 10 ? 11 : j+1 ;
				System.out.printf( "%d ", card[i][j]);
			}
			System.out.println();
		}
		
	}
}
