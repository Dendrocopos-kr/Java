package kr.co.dendrocops.second.blackjack;

public class Card {
	public final static String[] PATTRNS = {"♥","♣","◆","♠"};
	private final String PATTERN;
	private final String DENOMINATION;
	private final int point;
	
	Card(String pattern,String denomination,int point){
		this.DENOMINATION = denomination;
		this.PATTERN = pattern;
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}

	public String getPattern() {
		return PATTERN;
	}

	public String getDenomination() {
		return DENOMINATION;
	}
	
	@Override
	public String toString() {
		return String.format("<C:%3s / P:%2d >", PATTERN + DENOMINATION,point);
	}
}
