package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Player{
	
	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
	
	public Player(String string) {
		name = string;
	}
	public void setCard(Card c) {
		String[] card = c.drawCard();
		switch(card[0]) {
		case "0":
			card[0] = "Hearts ";
			break;
		case "1":
			card[0] = "Spades ";
			break;
		case "2":
			card[0] = "Diamonds ";
			break;
		case "3":
			card[0] = "Clubs ";
			break;
		}
		Card.add(card[0]+card[1]);
	}
	
	public void viewCard() {
		System.out.println(name + " :");
		System.out.println(Card);
	}
}
