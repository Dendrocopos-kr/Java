package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Player {

	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
	public final boolean DEALER;
	private int sumCard;

	public Player(String string, boolean dealer) {
		name = string;
		this.DEALER = dealer;
	}

	public void setCard(Card c) {
		String[] card = c.drawCard();
		switch (card[0]) {
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
		// Checker. card[1]가 A 일경우 1이냐 11이냐를 결정하는 구간.
		Card.add(card[0] + card[1]);
	}

	public ArrayList<String> getPlayerCard() {
		return Card;
	}

	public void viewCard() {
		System.out.println(name + " :");
		if (DEALER && opened()) {
			for (String string : Card) {
				System.out.print("[Blind] ");
			}

		} else {
			System.out.println(Card);
			System.out.println("합계 : " + Checker.blackJeck(this));
		}
		System.out.println();

	}

	public void viewAllCard() {
		System.out.println(name + " :");
		System.out.println(Card);
		System.out.println("합계 : " + Checker.blackJeck(this));
		System.out.println();
	}

	public boolean opened() {
		sumCard = Checker.blackJeck(this);

		if (DEALER) {
			// 딜러일경우
			if (sumCard < 16) {
				return true;
			} else if (sumCard > 21) {
				System.out.println("Busted!");
				return false;
			} else {
				return false;
			}
		} else {
			// 플레이어일경우
			if (sumCard < 21) {
				return true;
			} else {
				System.out.println("Busted!");
				return false;
			}

		}
	}
}
