package BaseBall_test;

import java.util.Scanner;

public class Checker {
	private static Scanner scan = new Scanner(System.in);
	
	public static boolean check( Baseball b, Myball mb) {
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		// Try++;
		for (int i = 0; i < mainThread.balls; i++) {
			for (int j = 0; j < mainThread.balls; j++) {
				if (b.get(i) == mb.get(j)) {
					if (i == j) {
						nStrike++;
					} else {
						nBall++;
					}
				}
			}
		}
		nOut = mainThread.balls - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return nStrike != mainThread.balls;
	}
	
	public static int checkRangeAddNumber() {
		while(true) {
			int val = checkAddNumber();
			if (val < 1 || val > mainThread.range) {
				Message.getMessage(3);
			} else {
				return val;
			}
		}
	}

	
	public static int checkAddNumber() {
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
	
	public static boolean checkIsNumber(String str) {
		if( str.length() != 0){
			try {
				int result = Integer.parseInt(str);				
				return false;
			}catch(Exception e) {
				Message.getMessage(5);
			}
		}
		return true;
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
