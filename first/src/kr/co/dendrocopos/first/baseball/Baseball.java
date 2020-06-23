package kr.co.dendrocopos.first.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class Baseball {
	// DEFAULT (자료형) => private + package;
	
	// 공 개수
	private int balls; 
	public int getBalls() {return balls;}
	public void setBalls(int balls) {	this.balls = balls;}
	
	// 입력할 숫자 범위
	private int Range; 
	public int getRange() {return Range;}
	public void setRange(int Range) {	this.Range = Range;}
	
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
	public void setBallNumber(int i, int BallNumber) {this.arrBallNumber[i] = BallNumber;}

	// 입력할 숫자가 적힐 배열
	private int[] arrThrowNumber; 
	// 배열단위 입출력
	public int[] getArrThrowNumber() {return arrThrowNumber;}
	public void setArrThrowNumber(int[] arrThrowNumber) {this.arrThrowNumber = arrThrowNumber;}
	// 한개씩 입출력
	public int getThrowNumber(int i) {return arrThrowNumber[i];}
	public void setThrowNumber(int i, int ThrowNumber) {this.arrThrowNumber[i] = ThrowNumber;}

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
	private Baseball(int balls, int Range) { 
		this.balls = balls;
		this.Range = Range;
		scan = new Scanner(System.in);
	}

	// 공통 사항
	private void InsertBallsNRange() { // 공개수와 범위 입력
		System.out.println("숫자 야구게임을 시작합니다. \n\n맞출 숫자의 갯수와 범위를 정해주세요");
		System.out.print("맞출숫자 < 맞출범위 :");
		changeBaseballs = scan.nextInt();
		changeRange = scan.nextInt();
	}

	private void CheckingSet() { // 범위와 공 개수 확인 ( 공 0개이하 or 공개수 >= 범위면 초기값 공3,범위1~9 )

		if (changeBaseballs < 1 || changeRange <= changeBaseballs) {
			System.out.println("설정 오류로 기본셋팅으로 시작합니다.");
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", balls, Range);
		} else {
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", changeBaseballs, changeRange);
			balls = changeBaseballs;
			Range = changeRange;
		}
		arrBallNumber = new int[balls];
		arrThrowNumber = new int[balls];
	}

	private void PrintStartGame() { // 시작문구 출력
		System.out.printf("------- %d 숫자 야구게임 ------- \n", balls);
	}
	

	private void SuffleBallNumber() { // 숫자 섞기 = 값 단위로 하나씩 변경
		int maxRandomNumber = Range;
		for (int i = 0; i < balls; i++) {

			arrBallNumber[i] = (int) (Math.random() * maxRandomNumber) + 1;
			for (int j = 0; j < i; j++) {
				if (arrBallNumber[i] == arrBallNumber[j]) {
					i--;
					break;
				}
			}
		}
	}

	public void Initialization() { // 개별로 시작시 초기화
		InsertBallsNRange(); // 1. 범위와 공개수 입력
		CheckingSet(); // 2. 범위와 공개수 오류검출
		SuffleBallNumber(); // 3.  공의 숫자섞기 하나씩
		PrintStartGame(); // 4. 시작문구 출력
	}
	
	public boolean CheckingSBO() { // 숫자 확인 SBO 출력
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		Try++;
		for (int i = 0; i < balls; i++) {
			for (int j = 0; j < balls; j++) {
				if (arrBallNumber[i] == arrThrowNumber[j]) {
					if (i == j) {
						nStrike++;
					} else {
						nBall++;
					}
				}
			}
		}
		nOut = balls - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return (nStrike == balls) ? true : false;
	}

	public void ThrowNumber() { // 숫자 입력 받기 한개씩
		System.out.printf("숫자 %d개를 입력하세요.", balls);
		for (int i = 0; i < balls; i++) {
			arrThrowNumber[i] = RangeCheck(scan.nextInt());
		}
	}
	
	private  int RangeCheck(int insertNumber) { // 범위 밖의 숫자 입력시
		while (true) {
			if (insertNumber >= 1 && insertNumber <= Range) {
				return insertNumber;
			} else {
				System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", insertNumber,Range);
				insertNumber = scan.nextInt();
			}
		}
	}

	public void Release() { // 정답출력, scan 닫기
		System.out.printf("도전횟수 : %d \n정답 : ", Try);
		System.out.println(Arrays.toString(arrBallNumber));
		scan.close();
	}
}
