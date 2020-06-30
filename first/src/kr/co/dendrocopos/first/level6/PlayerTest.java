package kr.co.dendrocopos.first.level6;

public class PlayerTest {
	public static void main(String[] args) {
		// Player player = new Player();
		// 객체화 불가능
		Player player = new CDPlayer();
		player.play();
		
		player = new DVDPlayer();
		player.play();
		
		
	}
}
