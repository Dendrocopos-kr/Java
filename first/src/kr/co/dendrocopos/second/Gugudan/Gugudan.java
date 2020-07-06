package kr.co.dendrocopos.second.Gugudan;

public class Gugudan {
	public static void main(String[] args) {
		/*
		 * gugudan(2, 5);
		 * 
		 * int sum = sum(1, 2); System.out.println(sum); sum = sum(1, 2, 3);
		 * System.out.println(sum); sum = sum(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12);
		 * System.out.println(sum);
		 
		int result = Utils.parsStringToInt("10", 0);
		System.out.println("result 0 : " + result);
		result = Utils.parsStringToInt("aa10", 1);
		System.out.println("result 1 : " + result);
		result = Utils.parsStringToInt("aa10");
		System.out.println("result 2 : " + result);
		result = Utils.parsStringToInt("9");
		System.out.println("result 3 : " + result);
*/
		int[] arr = { 4, 5, 11, 223, 3, 10 };
		Utils.sortASC(arr);
		Utils.printArr(arr);
		Utils.sortDESC(arr);
		Utils.printArr(arr);
		
		int[] rArr = Utils.createRandomArr(1,9,5);
		Utils.printArr(rArr);
		
		rArr = Utils.createRandomArr(5, 15, 10);
		Utils.printArr(rArr);

		rArr = Utils.createRandomArrNoDuplication(5,15,13);
		Utils.printArr(rArr);
		
		rArr = Utils.createRandomArrNoDuplication(5,15,11);
		Utils.printArr(rArr);
		
		String star = makeStarTriangle(5);
		System.out.println(star);
		
	}

	private static String makeStarTriangle(int max) {
		String str = "";
		for(int i = 0 ; i < max; i++) {
			for(int j = 0 ; j <= i; j ++) {
				str += "*";
			}
			str+= "\n";
		}
		return str;
	}

	public static int sum(int... is) {
		int tmp = 0;
		for (int i = 0; i < is.length; i++) {
			tmp += is[i];
		}
		return tmp;
	}

	public static void gugudan(int start, int end) {
		for (int i = start; i <= end; i++) {
			for (int j = 1; j < 10; j++) {
				if ((i * j) % 2 == 0) {
					System.out.printf("%d * %d = %d\n", i, j, i * j);
				}
			}
			System.out.println();
		}
	}
}
