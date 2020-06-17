package kr.co.dendrocopos.first.mission;

import java.util.Scanner;

public class GreatMission1 {
	public static void main(String[] args) {

		final int BALLCOUNT = 3;
		int ARRLENGTH = 9;
		int minRandomNumber = 1;
		int maxRandomNumber = ARRLENGTH + minRandomNumber;
		int nBall = 0;
		int nStrike = 0;
		int nOut = 0;
		int nTry = 0;

		int[] answerNumber = new int[BALLCOUNT];
		int[] throwNumber = new int[BALLCOUNT];

		System.out.printf("------- %d 숫자 야구게임 ------- \n", BALLCOUNT);
		// 랜덤 숫자 배분
		for (int i = 0; i < BALLCOUNT; i++) {

			/*
			int random_num = (int)(Math.random() * maxRandomNumber + minRandomNumber);
			Random random = new Random();
			int random_num = random.nextInt(maxRandomNumber - minRandomNumber) + minRandomNumber;
			 */
			
			answerNumber[i] = (int)(Math.random() * maxRandomNumber + minRandomNumber) ;//random_num;
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
			System.out.printf("숫자 %d개를 입력하세요.\n", BALLCOUNT);
			for (int i = 0; i < BALLCOUNT; i++) {
				throwNumber[i] = scan.nextInt();
			}
			nTry++;

			for (int i = 0; i < BALLCOUNT; i++) {
				for (int j = 0; j < BALLCOUNT; j++) {
					if (answerNumber[i] == throwNumber[j] && i == j) {
							nStrike++;
						} else if(answerNumber[i] == throwNumber[j] && i != j){
							nBall++;
					}
				}
			}

			nOut = BALLCOUNT - nStrike - nBall;
			System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

			if (nStrike == BALLCOUNT) {
				System.out.printf("도전횟수 : %d \n정답 : ",nTry);
				for (int i = 0; i < BALLCOUNT; i++) {
					System.out.print(answerNumber[i] + " ");
				}
				break;
			}
		}

		scan.close();

	}
}
