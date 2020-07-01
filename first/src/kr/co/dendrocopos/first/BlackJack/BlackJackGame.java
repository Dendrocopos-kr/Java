package kr.co.dendrocopos.first.BlackJack;

//딜러는 17점 이상이면 더 못 뽑는다.

public class BlackJackGame {
	public static void main(String[] args) {
		Card card = new Card();
		card.initialization();
		// card.viewCard();

		Player player = new Player("player", false);
		Player dealer = new Player("dealer", true);
		player.setCard(card);
		player.setCard(card);
		dealer.setCard(card);
		dealer.setCard(card);
		dealer.viewCard();
		player.viewCard();

		boolean palyerturn = Checker.checkStop(player);
		boolean dealerturn = Checker.checkStop(dealer);

		while (true) {
			if (palyerturn) {
				player.setGameTurn(palyerturn);
			} else {
				player.setCard(card);
				if (player.isBusted()) {
					palyerturn = true;
				} else {
					player.viewCard();
					palyerturn = Checker.checkStop(player);
				}
			}

			if (dealerturn) {
				dealer.setGameTurn(dealerturn);
			} else {
				dealer.setCard(card);
				if (dealer.isBusted()) {
					dealerturn = true;
				} else {
					dealer.viewCard();
					dealerturn = Checker.checkStop(dealer);
				}
			}

			if (palyerturn && dealerturn) {
				break;
			}

		}
		dealer.viewAllCard();
		player.viewAllCard();
		Checker.scan.close();
	}
}
