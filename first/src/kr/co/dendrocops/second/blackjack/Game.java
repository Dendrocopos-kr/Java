package kr.co.dendrocops.second.blackjack;

public class Game {
	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		gamer.openCards();
	}
}
