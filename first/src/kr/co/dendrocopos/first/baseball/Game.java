package kr.co.dendrocopos.first.baseball;

public class Game {
	public static void main(String[] args) {
		
		Baseball bb = new Baseball();
		
		bb.Initialization();
		
		bb.StartGame();
		
		while(true) {
			bb.ThrowNumber();
			if(bb.CheckingSBO()){
				break;
			}
		}	
		bb.EndGame();
		
		
	}
}
