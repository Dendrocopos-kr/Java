package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Dealer implements Player {

	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
	private int sumCard;
	private String str;
	private boolean gameTurn;

	public Dealer(String string) {
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
		String temp = "";
		str = String.format("%s\n", "+---------------------------------------------------+");
		str += String.format("|%13s%3s%35s|\n", name, " : ", " ");
		str += "|";
		for (int i = 0; i < Card.size(); i++) {
			temp += (i > 0) ? ", Blind" : "[Blind";
		}
		str += String.format("%50s]|\n", temp);
		str += String.format("|%4s%46s|\n+---------------------------------------------------+\n", "합계: ", "?");
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
