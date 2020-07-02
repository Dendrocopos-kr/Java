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
		str = String.format("+----------------------------------------------+\n|%13s%3s%30s|\n|", name, " : ", " ");
		for (int i = 0; i < Card.size(); i++) {
			temp += (i > 0) ? ", Blind" : "[Blind";
		}
		str += String.format("%45s]|\n"
				+ "|%4s%34s%7s|\n"
				+ "+----------------------------------------------+\n",
				temp,
				"합계: ", "?",isBusted()? "(Bust!)" : " ");
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
