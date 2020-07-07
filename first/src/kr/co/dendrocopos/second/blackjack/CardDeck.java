package kr.co.dendrocopos.second.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CardDeck{
	private List<Card> deck = new LinkedList<Card>();
	//private List<Card> deck = new ArrayList<Card>();

	CardDeck() {
		init();
	}

	private void init() {
		addCard();
		shuffleDeck();
	}
	
	private void addCard() {
		for (int i = 0; i < Card.PATTRNS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				deck.add(new Card(Card.PATTRNS[i],getDenomination(j),getPoint(j)));
			}
		}
	}
	
	private String getDenomination(int num) {
		switch (num) {
		case 1:	return "A";
		case 11: return	"J";
		case 12: return	"Q";
		case 13: return	"K";
		default: return	String.valueOf(num);
		}
	}
	
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}

	private void shuffleDeck(){
		//Collections.shuffle(deck);
	}
	
	public Card getCard() {
		/*
		try {
			return deck.get(deck.size()-1);
		}catch(Exception e) {
		}finally{
			deck.remove(deck.size()-1);
		}
		*/
		/*
		Card result = deck.get(deck.size()-1);
		deck.remove(deck.size()-1);
		return result;
		*/
		/*
		int index = (int)(Math.random() * deck.size());
		Card result = deck.get(index);
		deck.remove(index);
		
		
		//int index = (int)(Math.random() * deck.size());
		
		try {
			return deck.get(index);
		}catch(Exception e) {
			return null;
		}finally{
			deck.remove(index);
		}
		*/
		
		//return result;
		
		return deck.remove((int)(Math.random() * deck.size()));
	}
	
	@Override
	public String toString() {
		/*
		return deck.toString();
		*/
		
		String str = "";
		//String temp1 = Card.PATTRNS[0];
		for(Card c: deck) {
			/*
			if(temp1 != c.getPattern()) {
				str+="";
				temp1 = c.getPattern();
			}
			*/
			str += (c + "\n");
		}
		return str;
	}
	
}
