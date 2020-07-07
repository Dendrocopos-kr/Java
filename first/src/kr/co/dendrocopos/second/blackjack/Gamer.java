package kr.co.dendrocopos.second.blackjack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Gamer {
	private List<Card> deck = new LinkedList<Card>();
	private Scanner sc = new Scanner(System.in);

	public void receiveCard(Card c) {
		deck.add(c);
		//deck.add(AtoOne(c));
	}
	/*
	private Card AtoOne(Card c) {
		if(c.getDenomination() == "A" && !(this instanceof Dealer)) {
			if (getTotalPoint() <= 10) {
				System.out.println("A를 11로 쓰시겠습니까?(y/n)");
				String str = sc.next();
				if ("N".equals(str) || "n".equals(str)) {
					return c;
				} else if ("Y".equals(str) || "y".equals(str)) {
					return new Card(c.getPattern(), "A", 11);
				}
			}
		}
		return c;		
	}
	*/

	protected int getTotalPoint() {
		int sum = 0;
		for (Card c : deck) {
			sum += c.getPoint();
		}
		return sum;
	}

	private String getTotalCards() {
		String str = "";
		for (Card c : deck) {
			str += c + "\n";
		}
		return str;
	}

	public void openCards() {
		String str = getTotalCards() + " 점수: " + getTotalPoint();
		System.out.println(str);
	}

	@Override
	public String toString() {
		openCards();
		return "";
	}

	public void moreCards(CardDeck cd) {
		// 현재 카드 출력
		openCards();

		// 더받을지 출력
		while (getTotalPoint() < 21) {
			
			System.out.println("더 받으시겠습니까?(Y/N)");
			String str = sc.next();
			if ("N".equals(str) || "n".equals(str)) {
				break;
			} else if ("Y".equals(str) || "y".equals(str)) {
				receiveCard(cd.getCard());
				// 받고 나서 카드 확인용 출력
				openCards();
			}
		}
		sc.close();
	}
}
