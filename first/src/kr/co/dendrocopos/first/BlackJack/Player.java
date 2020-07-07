package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public abstract class Player {
	private String name;
	private ArrayList<String> Card = new ArrayList<String>();
	private boolean gameTurn;
	
	public boolean getGameTurn(){return gameTurn;}
	public void setGameTurn(boolean gameTurn){this.gameTurn = gameTurn;} 
	public ArrayList<String> getPlayerCard(){return Card;}
	public abstract void viewCard();
	public String getName(){return name;}
	protected void setName(String name) {this.name = name;}
	
}
