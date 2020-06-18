package kr.co.dendrocopos.first.mission;

public class MethodMission02 {
	public static void main(String[] args) {
		// printStar(6);

		// printStar(3);

		// printStar(3,6);
		printStarSqure(4);
	}

	public static void printStar(int sStar, int eStar) {
		for (int i = sStar; i <= eStar; i++) {
			printStar(i);
		}
	}

	public static void printStar(int star) {

		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void printStarSqure(int star) {

		for (int i = 0; i < star; i++) {
			printStar(star);
		}
		System.out.println();
	}

}
