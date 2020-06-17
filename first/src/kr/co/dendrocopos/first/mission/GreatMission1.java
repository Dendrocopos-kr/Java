package kr.co.dendrocopos.first.mission;

import java.util.Scanner;

public class GreatMission1 {
	public static void main(String[] args) {

		final int LEN = 3;
		int ARRLENGTH = 9;
		int minRandomNumber = 1;
		int maxRandomNumber = ARRLENGTH + minRandomNumber;
		int nBall = 0;
		int nStrike = 0;
		int nOut = 0;

		int[] answerNumber = new int[LEN];
		int[] throwNumber = new int[LEN];

		System.out.println("------- 야구게임 -------");
		// 랜덤 숫자 배분
		for (int i = 0; i < answerNumber.length; i++) {
			int random_num = (int)(Math.random() * maxRandomNumber + minRandomNumber);

			/*
			Random random = new Random();
			int random_num = random.nextInt(maxRandomNumber - minRandomNumber) + minRandomNumber;
			 */
			
			answerNumber[i] = random_num;
			for (int j = 0; j < i; j++) {
				if (answerNumber[i] == answerNumber[j]) {
					i--;
					break;
				}
			}
		}
		
		/*
		for (int i : answerNumber) {
			System.out.print(i + " ");
		}
		System.out.println();
		 */
		
		Scanner scan = new Scanner(System.in);

		// 숫자 맞히는 부분
		while (true) {
			nStrike = nBall = 0;
			System.out.printf("숫자 %d개를 입력하세요.\n", LEN);
			for (int i = 0; i < LEN; i++) {
				throwNumber[i] = scan.nextInt();
			}

			for (int i = 0; i < LEN; i++) {
				for (int j = 0; j < LEN; j++) {
					if (answerNumber[i] == throwNumber[j] && i == j) {
							nStrike++;
						} else if(answerNumber[i] == throwNumber[j] && i != j){
							nBall++;
					}
				}
			}

			nOut = LEN - nStrike - nBall;
			System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

			if (nStrike == LEN) {
				System.out.print("승리 \n정답 : ");
				for (int i = 0; i < LEN; i++) {
					System.out.print(answerNumber[i] + " ");
				}
				break;
			}
		}

		scan.close();

	}
}
