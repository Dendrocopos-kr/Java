package BaseBall_test;

import java.util.Scanner;

public class Checker {
	private static Scanner scan = new Scanner(System.in);
	
	public static boolean check(int balls, Baseball b, Myball mb) {
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		// Try++;
		for (int i = 0; i < balls; i++) {
			for (int j = 0; j < balls; j++) {
				if (b.get(i) == mb.get(j)) {
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

		return (nStrike == balls) ? false : true;
	}
	
	public static int checkRange(int range) {
		while(true) {
			int val = checkNumber();
			if (val < 1 || val > range) {
				Message.getMessage(3);
			} else {
				return val;
			}
		}
	}

	
	public static int checkNumber() {
		int result = 0;
		while(true) {
			String val = scan.nextLine();
			try {
				result = Integer.parseInt(val);				
			}catch(Exception e) {
				Message.getMessage(5);
				result = 0;
				continue;
			}
			break;
		}
		return result;
	}
	
	public static void checkChangeNumer(int newBalls, int newRange)
	{
		if (newBalls < 1 || newRange <= newBalls) {
			Message.getMessage(1);
		} else {
			mainThread.balls = newBalls;
			mainThread.range = newRange;
		}
		Message.getMessage(2);
	}
}
