package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public interface Player {
	public boolean getGameTurn();
	public void setGameTurn(boolean gameTurn);
	public ArrayList<String> getPlayerCard();
	public void viewCard();
	public boolean isBusted();
	public String getName();
	
}
