package kr.co.dendrocopos.first.misson;

public class Misson7_2 {
	public static void main(String[] args) {
		int nSum = 0;
		int nNum = 1;
		while( nNum <= 100 ) {
			nSum += nNum++;
		}
		System.out.println("1~100까지 더한 값은 :" + nSum);
	}
}
