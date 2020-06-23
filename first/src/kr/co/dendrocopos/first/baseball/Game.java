package kr.co.dendrocopos.first.baseball;

public class Game {
	public static void main(String[] args) {
		
		// 초기화
		Baseball BaseBallGame = new Baseball();
				
		BaseBallGame.initialization();
		//업데이트
		while(true) {
			BaseBallGame.throwNumber();
			if(BaseBallGame.checkingSBO()){
				break;
			}
		}
		
		//종료
		BaseBallGame.release();		
	}
}
