package kr.co.dendrocopos.first.BlackJack;

public class Card {
	public final static String[] PATTRNS = {"♥","♣","◆","♠"};
	private final String PATTERN;
	private final String DENOMINATION;
	
	Card(String pattern,String denomination){
		this.DENOMINATION = denomination;
		this.PATTERN = pattern;
	}

	public String getPattern() {
		return PATTERN;
	}

	public String getDenomination() {
		return DENOMINATION;
	}
	
	@Override
	public String toString() {
		return String.format("p:%s d:%s", PATTERN,DENOMINATION);
	}
}
