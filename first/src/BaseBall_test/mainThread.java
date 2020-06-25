package BaseBall_test;

import java.util.Scanner;

public class mainThread {
	static int balls;
	private static int changeBalls;

	static int range;
	private static int changeRange;

	Scanner scan = new Scanner(System.in);
	private Baseball ball;
	private Myball myBall;

	mainThread() {
		init(3, 9);
	}

	private void init(int balls, int range) {
		
		mainThread.balls = balls;
		mainThread.range = range;

		Message.getMessage(0);

		Message.getMessage(6);
		changeBalls = Checker.checkNumber();
		Message.getMessage(7);
		changeRange = Checker.checkNumber();
		
		Checker.checkChangeNumer(changeBalls, changeRange);

		ball = new Baseball();
		myBall = new Myball();
	}

	public void loopGame() {
		do {
			myBall.setNumbers();
		} while (Checker.check(balls, ball, myBall));

		//toStringAnswer();
		Message.getMessage(10);
	}
	/*
	private void toStringAnswer() {
		String str = "";
		for(int i = 0 ; i < balls; i++ ) {
			str += (i > 0) ? ", "+ball.get(i) : ball.get(i);
		}
		str = String.format("[%s]", str);
		System.out.print(str + " = ");
	}
	 */
}
