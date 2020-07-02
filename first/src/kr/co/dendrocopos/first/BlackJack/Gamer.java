package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Gamer implements Player {

	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
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
		str = "";
		str += String.format(
				"+----------------------------------------------+\n"
				+ "|%13s%3s%30s|\n"
				+ "|%46s|\n"
				+ "|%6s%30d%10s|\n"
				+ "+----------------------------------------------+\n",
				name, " : ", " ",
				Card,
				"합계: ", Checker.blackJeck(this),Checker.isBusted(this)? "(Bust!)" : " ");
		System.out.println(str);

	}

}
