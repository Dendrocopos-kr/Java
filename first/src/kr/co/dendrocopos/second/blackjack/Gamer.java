package kr.co.dendrocopos.second.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	private List<Card> deck = new LinkedList<Card>();
	
	public void receiveCard(Card c) {
		deck.add(c);
	}
	
	protected int getTotalPoint() {
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
	
	public void moreCards(CardDeck cd) {
		Scanner scan = new Scanner(System.in);
		openCards();

		while( getTotalPoint() < 21) {
			System.out.println("더 받으시겠습니까?(Y/N)");
			String str = scan.next();
			if(!("Y".equals(str) || "y".equals(str) )) {
				break;
			}		
			receiveCard(cd.getCard());
			openCards();
		}
		scan.close();
	}
}
