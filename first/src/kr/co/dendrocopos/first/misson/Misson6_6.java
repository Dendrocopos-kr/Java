package kr.co.dendrocopos.first.misson;

public class Misson6_6 {
	public static void main(String[] args) {
		int star = 9;
		for (int i = 1; i <= star; i++) {
			for (int j = ( star - i ); j < star; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
