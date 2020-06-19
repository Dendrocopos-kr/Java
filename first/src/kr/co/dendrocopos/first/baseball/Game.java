package kr.co.dendrocopos.first.baseball;

public class Game {
	public static void main(String[] args) {
		
		// 초기화
		Baseball BaseBallGame = new Baseball();
		BaseBallGame.Initialization();
		
		//업데이트
		while(true) {
			BaseBallGame.ThrowNumber();
			if(BaseBallGame.CheckingSBO()){
				break;
			}
		}
		
		//종료
		BaseBallGame.Release();		
	}
}
