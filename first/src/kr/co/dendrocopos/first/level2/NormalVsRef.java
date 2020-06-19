package kr.co.dendrocopos.first.level2;

public class NormalVsRef {
	public static void main(String[] args) {
		int num = 10;
		System.out.println("Before num : " + num);
		changeVal(num);
		System.out.println("after num : " + num);
		int[] numArr = {10};
		System.out.println("Before num : " + numArr[0]);
		changeVal(numArr);
		System.out.println("after num : " + numArr[0]);
	}

	public static void changeVal(int num) {
		num = 30;
	}
	
	public static void changeVal(int[] num) {
		num[0] = 30;
	}
}
