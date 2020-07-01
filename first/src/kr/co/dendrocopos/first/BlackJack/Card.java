package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;

public class Card {
	private ArrayList<Integer> card = new ArrayList<Integer>();

	public void Initialization() {
		NewCard();
	}

	private void NewCard() {
		// 패턴 4개  = 하트,다이아,스페이드,클로버
		// A,2~10,J,Q,K = 13개 만들기
	}
	
	public int DrawCard() {
		// 카드 리스트에서 빼기,
		int selector = (int)(Math.random() * 13) + 1;
		int pattern = (int)(Math.random() * 4 ) + 1;
		return 0;
	}
}
