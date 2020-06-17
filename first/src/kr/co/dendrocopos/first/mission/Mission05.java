package kr.co.dendrocopos.first.mission;

import java.util.Scanner;

public class Mission05 {
	public static void main(String[] args) {
		System.out.print("정수를 입력해주세요: ( 0 ~ 100 )");

		Scanner scan = new Scanner(System.in);
		String strScore = scan.next();
		int nScore = Integer.parseInt(strScore);

		int nScore_Ten = nScore / 10;
		int nScore_Mod = nScore % 10;

		final int perfect = 100; // 100점일때
		final int puls = 7; // 뒷자리 7 이상일때 +
		final int minus = 3; // 뒷자리 3 이하일때 -
		
		if (nScore > perfect || nScore < 0) {
			System.out.println("잘못입력하셨습니다.");
		} else if (nScore == perfect) {
			System.out.println("A++");
		} else {
			switch (nScore_Ten) {
			case 9:
				System.out.print("A");
				break;
			case 8:
				System.out.print("B");
				break;
			case 7:
				System.out.print("C");
				break;
			default:
				System.out.print("D");
				break;
			}

			if (nScore_Ten >= 7) {
				if (nScore_Mod >= puls) {
					System.out.println("+");
				} else if (nScore_Mod <= minus) {
					System.out.println("-");
				}
			}
		}

		scan.close();
	}
}
