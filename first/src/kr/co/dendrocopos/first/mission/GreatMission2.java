package kr.co.dendrocopos.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] arrMenus = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유" };
		int[] arrPrice = { 500, 600, 700, 800, 400, 400 };
		
		int inputNumber = 0;
		int bill = 0;

		// 메뉴표시
		System.out.println("-메뉴-");
		for (int i = 0; i < arrPrice.length; i++) {
			System.out.printf("%d. %s (%,d원)\n", i + 1, arrMenus[i], arrPrice[i]);
		}
		// 메뉴표시 끝

		while (true) {
			System.out.print("메뉴를 선택하세요: (종료:0)");
			inputNumber = scan.nextInt();

			while (true) { // 잘못입력 걸러내기
				if (0 <= inputNumber && inputNumber <= arrPrice.length) {
					break;
				} else {
					System.out.println("잘 못 입력!");
					System.out.print("메뉴를 선택하세요: (종료:0)");
					inputNumber = scan.nextInt();
				}
			}
			// 가격 합산 및 출력
			if (inputNumber != 0) {
				bill += arrPrice[inputNumber - 1];
				System.out.printf("%s %,d원\n", arrMenus[inputNumber - 1], arrPrice[inputNumber - 1]);
			} else {
				System.out.printf("종료! %,d원 사용", bill);
				break;
			}
		}

		scan.close();
	}
}
