package kr.co.dendrocopos.first.BlackJack;

//딜러는 17점 이상이면 더 못 뽑는다.

public class BlackJackGame {
	public static void main(String[] args) {
		Card card = new Card();
		card.initialization();
		// card.viewCard();

		Player player = new Player("player", false);
		Player dealer = new Player("dealer", true);

		do {
			if (dealer.opened()) {
				dealer.setCard(card);
				dealer.viewCard();
			}
			if (Checker.checkStop() && player.opened()) {
				player.setCard(card);
				player.viewCard();
			}else {
				break;
			}
		} while (true);
		dealer.viewAllCard();
		player.viewAllCard();
		Checker.scan.close();
	}
}
