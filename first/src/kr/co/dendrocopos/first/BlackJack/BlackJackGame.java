package kr.co.dendrocopos.first.BlackJack;

public class BlackJackGame {
	public static void main(String[] args) {
		System.out.printf("%46s","블랙잭을 시작합니다.\n");
		Card card = new Card();
		card.initialization();
		
		System.out.printf("%46s","카드 셋팅중...\n");

		Player gamer = new Gamer("gamer");
		Player dealer = new Dealer("dealer");
		Checker.setCard(card,gamer);
		Checker.setCard(card,dealer);
		Checker.setCard(card,gamer);
		Checker.setCard(card,dealer);
		System.out.printf("%46s","카드 배분완료\n");
		gamer.viewCard();
		dealer.viewCard();
		//card.viewCard();

		boolean palyerturn = Checker.checkStop(gamer);
		boolean dealerturn = Checker.checkStop(dealer);

		while (true) {
			if (palyerturn) {
				gamer.setGameTurn(palyerturn);
			} else {
				System.out.printf("%46s\n","나의 턴");
				Checker.setCard(card,gamer);
				gamer.viewCard();
				//card.viewCard();
				if (gamer.isBusted()) {
					break;
				} else {
					palyerturn = Checker.checkStop(gamer);
				}
			}

			if (dealerturn) {
				dealer.setGameTurn(dealerturn);
			} else {
				System.out.printf("%46s\n","딜러 턴");
				Checker.setCard(card,dealer);
				dealer.viewCard();
				//card.viewCard();
				if (dealer.isBusted()) {
					break;
				} else {
					dealerturn = Checker.checkStop(dealer);
				}
			}
			if (palyerturn && dealerturn) {
				break;
			}
		}
		System.out.println();
		System.out.println("---------------------결과창-----------------------");
		Checker.playerAllCard(gamer);
		Checker.playerAllCard(dealer);
		
		System.out.println(Checker.Winner(gamer, dealer));
		
		Checker.scan.close();
	}
}
