package kr.co.dendrocopos.first.BlackJack;

//딜러는 17점 이상이면 더 못 뽑는다.

public class BlackJackGame {
	public static void main(String[] args) {
		Card card = new Card();
		card.initialization();
		//card.viewCard();

		Player player = new Player("player");
		Player dealer = new Player("dealer");

		player.setCard(card);
		dealer.setCard(card);
		player.viewCard();
		dealer.viewCard();
		
		System.out.println("---------------------------------------------------");
		//card.viewCard();

		player.setCard(card);
		dealer.setCard(card);
		player.viewCard();
		dealer.viewCard();

		System.out.println("---------------------------------------------------");
		//card.viewCard();

		player.setCard(card);
		dealer.setCard(card);
		player.viewCard();
		dealer.viewCard();

		System.out.println("---------------------------------------------------");
		//card.viewCard();

		player.setCard(card);
		dealer.setCard(card);
		player.viewCard();
		dealer.viewCard();

		System.out.println("---------------------------------------------------");
		//card.viewCard();
	}
}
