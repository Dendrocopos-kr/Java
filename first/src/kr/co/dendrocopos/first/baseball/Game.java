package kr.co.dendrocopos.first.baseball;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		final int BALLCOUNT = 3;
		int ARRLENGTH = 9;
		Baseball bb = new Baseball(BALLCOUNT,ARRLENGTH);
		
		bb.GameStart();
		
		bb.InputNumber();
		
		bb.ContinueToThrow();
		
		
		
	}
}
