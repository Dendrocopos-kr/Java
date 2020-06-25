package BaseBall_test;

import java.util.Scanner;

public class mainThread {
	static int balls;
	private static int changeBalls;
	//void setballs(int balls) {	mainThread.balls = balls;	}
	//int getballs() {	return mainThread.balls;	}

	static int range;
	private static int changeRange;
	//void setRange(int range) {	mainThread.range = range;	}
	//int getRange() {	return mainThread.range;	}

	Scanner scan = new Scanner(System.in);
	private Baseball ball;
	private Myball myBall;
	
	mainThread() {
		init(3,9);
		checkingSet();	
	}
	
	private void init(int balls, int range) {
		mainThread.balls = balls;
		mainThread.range = range;
		
		Message.getMessage(0);
		Message.getMessage(6);
		changeBalls = Checker.checkingNumber();
		Message.getMessage(7);
		changeRange = Checker.checkingNumber();
		
		ball = new Baseball(balls, range);
		myBall = new Myball(balls, range);
	}
	
	private void checkingSet() { // 범위와 공 개수 확인 ( 공 0개이하 or 공개수 >= 범위면 초기값 공3,범위1~9 )

		if (changeBalls < 1 || changeRange <= changeBalls) {
			Message.getMessage(1);
		} else {
			balls = changeBalls;
			range = changeRange;
		}
		Message.getMessage(2);		
	}
	
	public void loopGame() {
		
		do {
			myBall.setNumbers();
		} while (Checker.check(mainThread.balls, ball, myBall));
		
		Message.getMessage(10);
	}
	
}
