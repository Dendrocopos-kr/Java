package kr.co.dendrocopos.first.baseball;

import java.util.Scanner;

public class Baseball {
	// DEFAULT (자료형) => private + package;
	
	// 공 개수
	private int balls; 
	public int getBalls() {return balls;}
	public void setBalls(int balls) {	this.balls = balls;}
	
	// 입력할 숫자 범위
	private int nRange; 
	public int getRange() {return nRange;}
	public void setRange(int nRange) {	this.nRange = nRange;}
	
	// 변경할 공 개수
	private int changeBaseballs;
	public int getChangeBalls() {return changeBaseballs;}
	public void setChangeBalls(int changeBaseballs) {this.changeBaseballs = changeBaseballs;}
	
	// 변경할 숫자 범위
	private int changeRange;
	public int getChangeRange() {return changeRange;}
	public void setChangeRange(int changeRange) {this.changeRange = changeRange;}
	
	// 공의 숫자가 적힐 배열
	private int[] arrBallNumber; 
	// 배열단위 입출력
	public int[] getArrBallNumber() {return arrBallNumber;}
	public void setArrBallNumber(int[] arrBallNumber) {this.arrBallNumber = arrBallNumber;}
	// 한개씩 입출력
	public int getBallNumber(int i) {return arrBallNumber[i];}
	public void setBallNumber(int i, int arrBallNumber) {this.arrBallNumber[i] = arrBallNumber;}

	// 입력할 숫자가 적힐 배열
	private int[] arrThrowNumber; 
	// 배열단위 입출력
	public int[] getArrThrowNumber() {return arrThrowNumber;}
	public void setArrThrowNumber(int[] arrThrowNumber) {this.arrThrowNumber = arrThrowNumber;}
	// 한개씩 입출력
	public int getThrowNumber(int i) {return arrThrowNumber[i];}
	public void setThrowNumber(int i, int arrThrowNumber) {this.arrThrowNumber[i] = arrThrowNumber;}

	// 시도 횟수
	private int Try; 
	public int getTry() {return Try;}
	public void setTry(int Try) {this.Try = Try;}

	// 스캔 객체 가져오기위한 선언.
	private Scanner scan; 

	// 생성자
	Baseball() { // 기본생성자 ( 공3, 1~9범위 기본셋팅)
		this(3, 9); // 기본생성시 3개 맞추기, 1~9까지의 숫자가 셋팅됨
	}
	
	// 입력받은 받은 공 개수와 범위 저장, scan 생성
	private Baseball(int balls, int nRange) { 
		setBalls(balls);
		setRange(nRange);
		scan = new Scanner(System.in);
	}

	// 공통 사항
	private void InsertBallsNRange() { // 공개수와 범위 입력
		System.out.println("숫자 야구게임을 시작합니다. \n\n맞출 숫자의 갯수와 범위를 정해주세요");
		System.out.print("맞출숫자 < 맞출범위 :");
		setChangeBalls(scan.nextInt());
		setChangeRange(scan.nextInt());
	}

	private void CheckingSet() { // 범위와 공 개수 확인 ( 공 0개이하 or 공개수 >= 범위면 초기값 공3,범위1~9 )

		if (getChangeBalls() < 1 || getChangeRange() <= getChangeBalls()) {
			System.out.println("설정 오류로 기본셋팅으로 시작합니다.");
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", getBalls(), getRange());
		} else {
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", getChangeBalls(), getChangeRange());
			setBalls(getChangeBalls());
			setRange(getChangeRange());
		}
		arrBallNumber = new int[getBalls()];
		arrThrowNumber = new int[getBalls()];
	}

	private void PrintStartGame() { // 시작문구 출력
		System.out.printf("------- %d 숫자 야구게임 ------- \n", getBalls());
	}
	// 공통 사항
	
	//-------------------- 각각 값으로 작동하는 메소드 구문

	public void Initialization() { // 개별로 시작시 초기화
		InsertBallsNRange(); // 1. 범위와 공개수 입력
		CheckingSet(); // 2. 범위와 공개수 오류검출
		SuffleBallNumber(); // 3.  공의 숫자섞기 하나씩
		PrintStartGame(); // 4. 시작문구 출력
	}

	private void SuffleBallNumber() { // 숫자 섞기 = 값 단위로 하나씩 변경
		int maxRandomNumber = getRange();
		for (int i = 0; i < getBalls(); i++) {

			setBallNumber(i, (int) (Math.random() * maxRandomNumber) + 1);
			for (int j = 0; j < i; j++) {
				if (getBallNumber(i) == getBallNumber(j)) {
					i--;
					break;
				}
			}
		}
	}

	public boolean CheckingSBO() { // 숫자 확인 SBO 출력
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		setTry(getTry()+1);
		for (int i = 0; i < getBalls(); i++) {
			for (int j = 0; j < getBalls(); j++) {
				if (getBallNumber(i) == getThrowNumber(j)) {
					if (i == j) {
						nStrike++;
					} else {
						nBall++;
					}
				}
			}
		}
		nOut = getBalls() - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return (nStrike == getBalls()) ? true : false;
	}

	public void ThrowNumber() { // 숫자 입력 받기 한개씩
		System.out.printf("숫자 %d개를 입력하세요.", getBalls());
		for (int i = 0; i < getBalls(); i++) {
			setThrowNumber(i, RangeCheck(scan.nextInt()));
		}
	}
	//-------------------- 각각 값으로 작동하는 메소드 구문
	
	//-------------------- 배열로 작동하는 메소드 구문

	public void ArrInitialization() { // 배열로 시작시 초기화
		InsertBallsNRange(); // 1. 범위와 공개수 입력
		CheckingSet(); // 2. 범위와 공개수 오류검출
		ArrSuffleBallNumber(); // 3. 공의 숫자섞기 배열단위
		PrintStartGame(); // 4. 시작문구 출력
	}

	private void ArrSuffleBallNumber() { // 숫자 섞기 = 배열단위로 한번에 리턴.
		int maxRandomNumber = getRange();
		int[] tempArr = getArrBallNumber();
		for (int i = 0; i < getBalls(); i++) {
			tempArr[i] = (int) (Math.random() * maxRandomNumber) + 1;
			for (int j = 0; j < i; j++) {
				if (tempArr[i] == tempArr[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public boolean ArrCheckingSBO() { // 숫자 확인 SBO 출력
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		setTry(getTry()+1);
		int[] tempArr1 = getArrBallNumber();
		int[] tempArr2 = getArrThrowNumber();
		for (int i = 0; i < getBalls(); i++) {
			for (int j = 0; j < getBalls(); j++) {
				if (tempArr1[i] == tempArr2[j]) {
					if (i == j) {
						nStrike++;
					} else {
						nBall++;
					}
				}
			}
		}
		nOut = getBalls() - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return (nStrike == getBalls()) ? true : false;
	}

	public void ArrThrowNumber() { // 숫자 입력 배열단위로 받기
		System.out.printf("숫자 %d개를 입력하세요.", getBalls());
		int[] tempArr = getArrThrowNumber();
		for (int i = 0; i < getBalls(); i++) {
			tempArr[i] = RangeCheck(scan.nextInt());
		}
	}
	//-------------------- 배열로 작동하는 메소드 구문
	private  int RangeCheck(int insertNumber) { // 범위 밖의 숫자 입력시
		while (true) {
			if (insertNumber >= 1 && insertNumber <= getRange()) {
				return insertNumber;
			} else {
				System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", insertNumber,getRange());
				insertNumber = scan.nextInt();
			}
		}
	}

	public void Release() { // 정답출력, scan 닫기
		System.out.printf("도전횟수 : %d \n정답 : ", getTry());
		for (int i : getArrBallNumber()) {
			System.out.print(i + " ");
		}
		scan.close();
	}
}
