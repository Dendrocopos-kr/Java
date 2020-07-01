package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Participants extends Card {
	private ArrayList<String> aCard = new ArrayList<String>();
	private static int drawCount = 0;
	public void getCard(String[] card) {
		String[] pCard = new String[52];
		switch(card[0]) {
		case "0":
			pCard[drawCount] = "Hearts ";
			break;
		case "1":
			pCard[drawCount] = "Spades ";
			break;
		case "2":
			pCard[drawCount] = "Diamonds ";
			break;
		case "3":
			pCard[drawCount] = "Clubs ";
			break;
		}
		pCard[drawCount] += card[1];
		aCard.add(pCard[drawCount]);
	}
	
	@Override
	public void viewCard() {
		System.out.print("PlayerCard : ");
		System.out.println(aCard);
	}
}
