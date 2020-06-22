package kr.co.dendrocopos.first.baseball;

import java.util.Scanner;

public class Baseball {
	// DEFAULT (자료형) => private + package;
	private int nBaseballs;
	public int getnBaseballs() {return nBaseballs;}
	public void setnBaseballs(int nBaseballs) {this.nBaseballs = nBaseballs;}
	
	private int nRange;
	public int getnRange() {return nRange;}
	public void setnRange(int nRange) {this.nRange = nRange;}
	
	private int nBaseballsCheck;
	public int getnBaseballsCheck() {return nBaseballsCheck;}
	public void setnBaseballsCheck(int nBaseballsCheck) {this.nBaseballsCheck = nBaseballsCheck;}
	
	private int nRangeCheck;
	public int getnRangeCheck() {return nRangeCheck;}
	public void setnRangeCheck(int nRangeCheck) {this.nRangeCheck = nRangeCheck;}
	
	private int[] arrBallNumber;
	public int[] getArrBallNumber() {return arrBallNumber;}
	public int getBallNumber(int i) {return arrBallNumber[i];}
	public void setBallNumber(int i, int arrBallNumber) {this.arrBallNumber[i] = arrBallNumber;}
	public void setArrBallNumber(int[] arrBallNumber) {this.arrBallNumber = arrBallNumber;}
	
	private int[] arrThrowNumber;
	public int[] getArrThrowNumber() {return arrThrowNumber;}
	public int getThrowNumber(int i) {return arrThrowNumber[i];}
	public void setThrowNumber(int i,int arrThrowNumber) {this.arrThrowNumber[i] = arrThrowNumber;}
	public void setArrThrowNumber(int[] arrThrowNumber) {this.arrThrowNumber = arrThrowNumber;}

	private int nTry;
	private Scanner scan;

	// 생성자
	Baseball() { // 기본생성자 ( 공3, 1~9범위 기본셋팅)
		this(3, 9); // 기본생성시 3개 맞추기, 1~9까지의 숫자가 셋팅됨
	}

	private Baseball(int nBaseballs, int nRange) { // 입력받은 받은 공 개수와 범위 저장, scan 생성
		setnBaseballs(nBaseballs);
		setnRange(nRange);
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
		setnBaseballsCheck(scan.nextInt());
		setnRangeCheck(scan.nextInt());
	}

	private void CheckingSet() { // 범위와 공 개수 확인 ( 공 0개이하 or 공개수 >= 범위면 초기값 공3,범위1~9 )
		
		if (getnBaseballsCheck() < 1 || getnRangeCheck() <= getnBaseballsCheck()) {
			System.out.println("설정 오류로 기본셋팅으로 시작합니다.");
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", getnBaseballs(), getnRange());
		} else {
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", getnBaseballsCheck(), getnRangeCheck());
			setnBaseballs(getnBaseballsCheck());
			setnRange(getnRangeCheck());
		}
		arrBallNumber = new int[getnBaseballs()];
		arrThrowNumber = new int[getnBaseballs()];
	}

	private void SuffleBallNumber() { // 숫자 섞기
		// int minRandomNumber = 1; // 최소시작점 셋팅을 하지않음. 1부터 시작임.
		int maxRandomNumber = getnRange();
		for (int i = 0; i < getnBaseballs(); i++) {

			setBallNumber(i,(int) (Math.random() * maxRandomNumber) + 1);
			//arrBallNumber[i] = (int) (Math.random() * maxRandomNumber) + 1;
			// arrBallNumber[i] = (int) (Math.random() * maxRandomNumber - minRandomNumber +
			// 1) + minRandomNumber; // 최소 시작점 셋팅시 윗 라인과 변경
			for (int j = 0; j < i; j++) {
				if (getBallNumber(i) == getBallNumber(j)) {
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
		System.out.printf("------- %d 숫자 야구게임 ------- \n", getnBaseballs());
	}

	public boolean CheckingSBO() { // 숫자 확인 SBO 출력
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		nTry++;
		for (int i = 0; i < getnBaseballs(); i++) {
			for (int j = 0; j < getnBaseballs(); j++) {
				if(getBallNumber(i) == getThrowNumber(j)) {
					if(i == j)
					{
						nStrike++;
					}else {
						nBall++;
					}
				}
			}
		}
		nOut = getnBaseballs() - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return (nStrike == getnBaseballs()) ? true : false;
	}

	public void ThrowNumber() { // 숫자 입력 받기
		System.out.printf("숫자 %d개를 입력하세요.", getnBaseballs());
		for (int i = 0; i < getnBaseballs(); i++) {
			setThrowNumber(i,scan.nextInt());
			//arrThrowNumber[i] = scan.nextInt();
			RangeCheck(i);
		}
	}

	private void RangeCheck(int selectedNumber) { // 범위 밖의 숫자 입력시
		while (true) {
			if(getThrowNumber(selectedNumber) >= 1 && getThrowNumber(selectedNumber) <= getnRange()) {
				break;
			}else {
				System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", getThrowNumber(selectedNumber), getnRange());
				setThrowNumber(selectedNumber,scan.nextInt());
			}
			/*
			if (arrThrowNumber[selectedNumber] >= 1 && arrThrowNumber[selectedNumber] <= nRange) {
				break;
			} else {
				System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", arrThrowNumber[selectedNumber], nRange);
				arrThrowNumber[selectedNumber] = scan.nextInt();
			}
			*/
		}
	}

	public void Release() { // 정답출력, scan 닫기
		System.out.printf("도전횟수 : %d \n정답 : ", nTry);
		for (int i = 0; i < getnBaseballs(); i++) {
			System.out.print( getBallNumber(i) + " ");
			//System.out.print(arrBallNumber[i] + " ");
		}
		scan.close();
	}
}
