package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Gamer implements Player {

	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
	private int sumCard;
	private String str;
	private boolean gameTurn;

	public Gamer(String string) {
		name = string;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean getGameTurn() {
		return gameTurn;
	}

	@Override
	public void setGameTurn(boolean gameTurn) {
		this.gameTurn = gameTurn;
	}

	@Override
	public ArrayList<String> getPlayerCard() {
		return Card;
	}

	@Override
	public void viewCard() {
		str = String.format("%s\n", "+---------------------------------------------------+");
		str += String.format(
				"|%13s%3s%35s|\n|%51s|\n|%4s%46d|\n"
						+ "+---------------------------------------------------+\n",
				name, " : ", " ", Card, "합계: ", Checker.blackJeck(this));
		System.out.println(str);

	}

	@Override
	public boolean isBusted() {
		sumCard = Checker.blackJeck(this);
		if (sumCard <= 21) {
			return false;
		} else {
			return true;
		}
	}

}
