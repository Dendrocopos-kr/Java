package kr.co.dendrocopos.first.baseball;

public class Game {
	public static void main(String[] args) {
		final int BALLCOUNT = 3;
		int ARRLENGTH = 9;
		Baseball bb = new Baseball(BALLCOUNT,ARRLENGTH);
		
		bb.GameStart();
		
		bb.InputNumber();
		while(bb.ContinueToThrow()) {
			bb.ContinueToThrow();
			
		}
		
		
		
	}
}
