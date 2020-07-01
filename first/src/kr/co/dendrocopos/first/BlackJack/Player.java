package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Player {

	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
	public final boolean DEALER;
	private int sumCard;
	private String str;
	private boolean gameTurn;

	public Player(String string, boolean dealer) {
		name = string;
		this.DEALER = dealer;
	}

	public boolean getGameTurn() {
		return gameTurn;
	}

	public void setGameTurn(boolean gameTurn) {
		this.gameTurn = gameTurn;
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
		card[1] = Checker.aceCard(card[1], this);
		Card.add(card[0] + card[1]);
	}

	public ArrayList<String> getPlayerCard() {
		return Card;
	}

	public void viewCard() {
		String temp = "";
		str = String.format("%s\n", "+---------------------------------------------------+");
		if (DEALER) {
			str += String.format("|%13s%3s%35s|\n", name, " : ", " ");
			str += "|";
			for (int i = 0; i < Card.size(); i++) {
				temp += (i > 0) ? ", Blind" : "[Blind";
			}
			str += String.format("%50s]|\n", temp);
			str += String.format("|%4s%46s|\n+---------------------------------------------------+\n", "합계: ","?");
		} else {
			str += String.format(
					"|%13s%3s%35s|\n" + "|%51s|\n" + "|%4s%46d|\n"
							+ "+---------------------------------------------------+\n",
					name, " : ", " ", Card, "합계: ", Checker.blackJeck(this));
		}
		System.out.println(str);

	}

	public void viewAllCard() {
		str = String.format(
				"+---------------------------------------------------+\n" + "|%13s%3s%35s|\n" + "|%51s|\n"
						+ "|%4s%46d|\n" + "+---------------------------------------------------+\n",
				name, " : ", " ", Card, "합계: ", Checker.blackJeck(this));

		System.out.println(str);
	}

	public boolean isBusted() {
		sumCard = Checker.blackJeck(this);

		if (DEALER) {
			// 딜러일경우
			if (sumCard <= 16) {
				return false;
			} else if (sumCard >= 21) {
				// str = String.format("%13s%3s%35s\n", name, " : ", "Busted!");
				// System.out.printf(str);
				return true;
			}
		} else {
			// 플레이어일경우
			if (sumCard <= 21) {
				return false;
			} else {
				// str = String.format("%13s%3s%35s\n", name, " : ", "Busted!");
				// System.out.printf(str);
				return true;
			}

		}
		return true;
	}
}
