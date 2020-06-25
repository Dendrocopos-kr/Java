package kr.co.dendrocopos.first.baseball;

public class Game {
	public static void main(String[] args) {
		
		// 초기화
		Baseball BaseBallGame = new Baseball();
				
		BaseBallGame.initialization();
		
		//업데이트

		do {
			BaseBallGame.throwNumber();
		}while(BaseBallGame.checkingSBO());
		
		//종료
		BaseBallGame.release();		
	}
}
