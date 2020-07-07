package kr.co.dendrocopos.second.blackjack;

public class Game {
	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		for(int i = 0 ; i < 2 ; i++) {
			dealer.receiveCard(cd.getCard());
			gamer.receiveCard(cd.getCard());
		}
		
		System.out.println("나의 카드:");
		gamer.moreCards(cd);
		
		dealer.moreCards(cd);
		System.out.println("딜러카드:");
		dealer.openCards();
		Rules.whoIsWin(gamer, dealer);
		
	}
}
