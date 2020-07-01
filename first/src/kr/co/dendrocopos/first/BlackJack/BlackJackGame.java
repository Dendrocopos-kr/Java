package kr.co.dendrocopos.first.BlackJack;

public class BlackJackGame {
	public static void main(String[] args) {
		Card card = new Card();
		card.initialization();
		card.viewCard();
		
		Participants player = new Participants();

		player.getCard(card.drawCard());
		player.viewCard();
		card.viewCard();
		player.getCard(card.drawCard());
		player.viewCard();
		card.viewCard();
		player.getCard(card.drawCard());
		player.viewCard();
		card.viewCard();
		player.getCard(card.drawCard());
		player.viewCard();
		card.viewCard();
		player.getCard(card.drawCard());
		player.viewCard();
		card.viewCard();
	}
}
