package kr.co.dendrocopos.first.mission;

public class MethodMission03 {
	public static void main(String[] args) {
		int result = abs(10);
		System.out.println(result);

		result = abs(-10);
		System.out.println(result);
	}

	public static int abs(int n) {
		return (n < 0) ? -n : n;
	}
}
