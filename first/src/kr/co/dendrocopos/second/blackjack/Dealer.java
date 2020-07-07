package kr.co.dendrocopos.second.blackjack;

public class Dealer extends Gamer{
	private final int DEALER_DRAWCUT = 17;
	@Override
	public void moreCards(CardDeck cd) {
		
		/*
		while( true ) {
			if( getTotalPoint() > DEALER_LIMITS) {
				break;
			}else {
				receiveCard(cd.getCard());
			}
		}
		*/
		
		while( getTotalPoint() < DEALER_DRAWCUT ) {
			receiveCard(cd.getCard());			
		}
	}
}
