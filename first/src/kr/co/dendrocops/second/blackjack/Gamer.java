package kr.co.dendrocops.second.blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	private List<Card> deck = new ArrayList<Card>();
	
	public void receiveCard(Card c) {
		deck.add(c);
	}
	
	private int getTotalPoint() {
		int sum = 0;
		for(Card c: deck) {
			sum += c.getPoint();
		}
		return sum;
	}
	
	private String getTotalCards() {
		String str = "";
		for(Card c: deck) {
			str += c+"\n";
		}
		return str;
	}
	
	public void openCards() {
		String str = getTotalCards() + " 점수: " +getTotalPoint() ;
		System.out.println(str);
	}
	
	@Override
	public String toString() {
		openCards();
		return "";
	}
}
