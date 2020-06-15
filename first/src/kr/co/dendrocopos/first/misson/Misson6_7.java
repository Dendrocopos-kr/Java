package kr.co.dendrocopos.first.misson;

public class Misson6_7 {
	public static void main(String[] args) {
		int star = 5;
		
		for(int i = 1 ; i <= star ; i++ ) {			
			for ( int j = star ; j > 0; j--) {
				System.out.print( i < j ? " " : "*");
				/*
				if( i < j) {
					System.out.printf(" ");					
				}
				else {
					System.out.printf("*");					
				}
				*/
				
			}
			System.out.println();
		}
	}
}
