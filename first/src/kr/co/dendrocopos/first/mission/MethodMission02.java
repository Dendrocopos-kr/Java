package kr.co.dendrocopos.first.mission;

public class MethodMission02 {
	public static void main(String[] args) {
		// printStar(6);

		// printStar(3);

		// printStarSqure(4);
		// printStarTriangle(5);

		printStarTriangleRevers(5);
	}

	public static void printStarTriangleRevers(int Star) {
		for (int i = 1; i <= Star; i++) {
			parintString(Star - i," ");
			parintString(i,"*");
			
			/*
			printBlank(Star - i);
			printStar(i);
			*/
			
			System.out.println();
		}
	}

	public static void printStarTriangle(int Star) {
		for (int i = 1; i <= Star; i++) {
			parintString(i,"*");
		}
		System.out.println();
	}

	public static void printStarSqure(int star) {
		for (int i = 0; i < star; i++) {
			parintString(star,"*");
		}
		System.out.println();
	}
	
	/*
	public static void printStar(int star) {
		for (int i = 0; i < star; i++) {
			System.out.print("*");
		}
	}

	public static void printBlank(int Blank) {
		for (int i = 0; i < Blank; i++) {
			System.out.print(" ");
		}
	}
	*/
	
	public static void parintString(int num, String str)
	{
		for (int i = 0; i < num; i++) {
			System.out.print(str);
		}
	}

}
