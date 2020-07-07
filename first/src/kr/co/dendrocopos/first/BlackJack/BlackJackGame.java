package kr.co.dendrocopos.first.BlackJack;

public class BlackJackGame {
	public static void main(String[] args) {
		//시작준비
		Deck deck = new Deck();
		Player gamer = new Gamer("gamer");
		Player dealer = new Dealer("dealer");
		
		System.out.printf("%46s","블랙잭을 시작합니다.\n");
				
		// 기본셋팅
		initialization(deck, gamer, dealer);

		boolean palyerturn = Checker.checkPlayerMoreDraw(gamer);
		boolean dealerturn = Checker.checkDealerMoreDraw(dealer);

		// 게임 루프문
		while (true) {
			 if(!gamer.getGameTurn()) {
				System.out.println("플레이어가 더 받습니다. (히트) ");
				Checker.setCard(deck,gamer);
				gamer.viewCard();
				//card.viewCard();
				if (Checker.isBusted(gamer)) {
					break;
				} else {
					if (palyerturn=Checker.checkPlayerMoreDraw(gamer)) {
						System.out.println("플레이어가 더 받지 않도록 합니다. (스테이) ");
						gamer.setGameTurn(palyerturn);
					}
				}
			}

			if (!dealer.getGameTurn()) {
				System.out.println("딜러가 더 받습니다. (히트) ");
				Checker.setCard(deck,dealer);
				dealer.viewCard();
				//card.viewCard();
				if (Checker.isBusted(dealer)) {
					break;
				} else {
					if (dealerturn=Checker.checkDealerMoreDraw(dealer)) {
						System.out.println("딜러가 더 받지 않도록 합니다. (스테이) ");	
						dealer.setGameTurn(dealerturn);					
					}
				}
			}
			
			if (palyerturn && dealerturn) {
				System.out.println("모두 받지 않으므로 카드를 공개합니다. (오픈) ");
				break;
			}
		}

		System.out.println("\n--♥-◆-♣-♠-♥-◆-♣-♠-♥---결과창---♠-♥-◆-♣-♠-♥-◆-♣-♠--");
		Checker.playerAllCard(gamer);
		Checker.playerAllCard(dealer);
		
		System.out.println(Checker.Winner(gamer, dealer));
		
		Checker.scan.close();
	}

	public static void initialization(Deck deck, Player player, Player dealer) {
		System.out.printf("%46s", "카드 셋팅중...\n");
		// card.viewCard();
		for (int i = 0; i < 2; i++) {
			Checker.setCard(deck, player);
			//player.viewCard();
			Checker.setCard(deck, dealer);
			//dealer.viewCard();
			// card.viewCard();
		}
		System.out.printf("%46s", "카드 배분완료\n");
		player.viewCard();
		dealer.viewCard();
	}
}
