package kr.co.dendrocopos.first.baseball;

import java.util.Scanner;

public class Baseball {
	int ballCount;
	int numberCount;
	int minRandomNumber = 1;
	int maxRandomNumber = numberCount + minRandomNumber;
	
	int nBall;
	int nStrike;
	int nOut;
	int nTry;
	int[] answerNumber;
	int[] throwNumber;
	
	Scanner scan;
	
	Baseball(){
	}
	
	Baseball(int ballCount, int numberCount){
		this.ballCount = ballCount;
		this.numberCount = numberCount;
		answerNumber = new int[ballCount];
		throwNumber = new int[ballCount];
	}
	
	public void GameStart() {
		System.out.printf("------- %d 숫자 야구게임 ------- \n", ballCount);
	}
	
	public void SuffleNumber() {
		for (int i = 0; i < ballCount; i++) {
			
			answerNumber[i] = (int)(Math.random() * maxRandomNumber + minRandomNumber) ;//random_num;
			for (int j = 0; j < i; j++) {
				if (answerNumber[i] == answerNumber[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public void CheckingNumber() {

		
		nStrike = nBall = 0;
		
		nTry++;

		for (int i = 0; i < ballCount; i++) {
			for (int j = 0; j < ballCount; j++) {
				if (answerNumber[i] == throwNumber[j] && i == j) {
						nStrike++;
					} else if(answerNumber[i] == throwNumber[j] && i != j){
						nBall++;
				}
			}
		}

		nOut = ballCount - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		
	}
	
	public void InputNumber() {

		scan = new Scanner(System.in);
		System.out.printf("숫자 %d개를 입력하세요.\n", ballCount);
		for (int i = 0; i < ballCount; i++) {
			throwNumber[i] = scan.nextInt();
		}
		scan.close();
		
		CheckingNumber();
	}
	
	public boolean ContinueToThrow() {
		if (nStrike == ballCount) {
			System.out.printf("도전횟수 : %d \n정답 : ",nTry);
			for (int i = 0; i < ballCount; i++) {
				System.out.print(answerNumber[i] + " ");
			}
			return false;
		}
		
		return true;
	}
	
}
