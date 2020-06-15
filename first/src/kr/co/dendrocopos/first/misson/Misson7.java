package kr.co.dendrocopos.first.misson;

import java.util.Scanner;

public class Misson7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int nSum = 0;
		
		while (true) {
			System.out.print("숫자를 입력:(종료:0) ");
			String strNum = scan.next();
			int nNum = Integer.parseInt(strNum);

			if (nNum == 0) {
				break;
			}

			nSum += nNum;
		}
		System.out.println("합계 : " + nSum);
		scan.close();
	}
}
