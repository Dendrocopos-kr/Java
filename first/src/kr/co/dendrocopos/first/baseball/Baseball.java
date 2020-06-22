package kr.co.dendrocopos.first.baseball;

import java.util.Scanner;

public class Baseball {
	// DEFAULT (자료형) => private + package;
	private int nBaseballs;
	private int nRange;

	private int nBaseballsCheck;
	private int nRangeCheck;

	private int nTry;
	private int[] arrBallNumber;
	private int[] arrThrowNumber;

	private Scanner scan;

	// 생성자
	Baseball() { // 기본생성자 ( 공3, 1~9범위 기본셋팅)
		this(3, 9); // 기본생성시 3개 맞추기, 1~9까지의 숫자가 셋팅됨
	}

	private Baseball(int nBaseballs, int nRange) { // 입력받은 받은 공 개수와 범위 저장, scan 생성
		this.nBaseballs = nBaseballs;
		this.nRange = nRange;
		scan = new Scanner(System.in);
	}

	public void Initialization() { 	// 	    초기화
		InsertBaseballsNRange(); 	// 1. 범위와 공개수 입력
		CheckingSet();				// 2. 범위와 공개수 오류검출
		SuffleBallNumber();			// 3. 공의 숫자섞기
		StartGame();				// 4. 시작문구 출력
	}

	private void InsertBaseballsNRange() { // 공개수와 범위 입력
		System.out.println("숫자 야구게임을 시작합니다. \n\n맞출 숫자의 갯수와 범위를 정해주세요");
		System.out.print("맞출숫자 < 맞출범위 :");
		nBaseballsCheck = scan.nextInt();
		nRangeCheck = scan.nextInt();
	}

	private void CheckingSet() { // 범위와 공 개수 확인 ( 공 0개이하 or 공개수 >= 범위면 초기값 공3,범위1~9 )
		if (nBaseballsCheck < 1 || nRangeCheck <= nBaseballsCheck) {
			System.out.println("설정 오류로 기본셋팅으로 시작합니다.");
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", nBaseballs, nRange);
		} else {
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", nBaseballsCheck, nRangeCheck);
			nBaseballs = nBaseballsCheck;
			nRange = nRangeCheck;
		}
		arrBallNumber = new int[nBaseballs];
		arrThrowNumber = new int[nBaseballs];
	}

	private void SuffleBallNumber() { // 숫자 섞기
		// int minRandomNumber = 1; // 최소시작점 셋팅을 하지않음. 1부터 시작임.
		int maxRandomNumber = nRange;
		for (int i = 0; i < nBaseballs; i++) {
			arrBallNumber[i] = (int) (Math.random() * maxRandomNumber) + 1;
			// arrBallNumber[i] = (int) (Math.random() * maxRandomNumber - minRandomNumber +
			// 1) + minRandomNumber; // 최소 시작점 셋팅시 윗 라인과 변경
			for (int j = 0; j < i; j++) {
				if (arrBallNumber[i] == arrBallNumber[j]) {
					i--;
					break;
				}
			}
		}
	
		/*
		// 정답 확인용 출력 구문 
		for (int i : arrBallNumber) { System.out.print(i + " "); }
		System.out.println();
		*/
	}

	private void StartGame() { // 시작문구 출력
		System.out.printf("------- %d 숫자 야구게임 ------- \n", nBaseballs);
	}

	public boolean CheckingSBO() { // 숫자 확인 SBO 출력
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		nTry++;
		for (int i = 0; i < nBaseballs; i++) {
			for (int j = 0; j < nBaseballs; j++) {
				if(arrBallNumber[i] == arrThrowNumber[j]) {
					if(i == j)
					{
						nStrike++;
					}else {
						nBall++;
					}
				}
			}
		}
		nOut = nBaseballs - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return (nStrike == nBaseballs) ? true : false;
	}

	public void ThrowNumber() { // 숫자 입력 받기
		System.out.printf("숫자 %d개를 입력하세요.", nBaseballs);
		for (int i = 0; i < nBaseballs; i++) {
			arrThrowNumber[i] = scan.nextInt();
			RangeCheck(i);
		}
	}

	private void RangeCheck(int selectedNumber) { // 범위 밖의 숫자 입력시
		while (true) {
			if (arrThrowNumber[selectedNumber] >= 1 && arrThrowNumber[selectedNumber] <= nRange) {
				break;
			} else {
				System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", arrThrowNumber[selectedNumber], nRange);
				arrThrowNumber[selectedNumber] = scan.nextInt();
			}
		}
	}

	public void Release() { // 정답출력, scan 닫기
		System.out.printf("도전횟수 : %d \n정답 : ", nTry);
		for (int i = 0; i < nBaseballs; i++) {
			System.out.print(arrBallNumber[i] + " ");
		}
		scan.close();
	}
}
