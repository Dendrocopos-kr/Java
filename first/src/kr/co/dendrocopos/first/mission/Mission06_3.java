package kr.co.dendrocopos.first.mission;

public class Mission06_3 {
	public static void main(String[] args) {
		// 2~9단
		
		for(int p = 26 ; p < 34 ; p++ ){
			for( int j = 1; j < 10 ; j++ ) {
				int i = p - 24;
				System.out.printf("%d * %d = %d\n", i, j, i*j );
			}
			System.out.println("-----------"); 
		}
	}
}
