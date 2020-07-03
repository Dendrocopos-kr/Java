package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private ArrayList<ArrayList<String>> deck = new ArrayList<ArrayList<String>>();
	
	private List<Card> deck2 = new ArrayList<Card>();
	
	public Deck() {
		initialization();
	}

	public void initialization() {
		newCard();
		//addCard();
	}
	/*
	private void addCard() {
		for (int i = 0; i < Card.PATTRNS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				deck2.add(new Card(Card.PATTRNS[i],getDenomination(j)));
			}
		}
	}
*/
	private void newCard() {
		// 패턴 4개 = 하트,다이아,스페이드,클로버
		// A,2~10,J,Q,K = 13개 만들기
		ArrayList<String> hearts = new ArrayList<String>();
		ArrayList<String> spades = new ArrayList<String>();
		ArrayList<String> diamonds = new ArrayList<String>();
		ArrayList<String> clubs = new ArrayList<String>();
		
		for (int j = 1; j <= 13; j++) {
			hearts.add(getDenomination(j));
			spades.add(getDenomination(j));
			diamonds.add(getDenomination(j));
			clubs.add(getDenomination(j));
		}
		
		Collections.shuffle(hearts);
		Collections.shuffle(spades);
		Collections.shuffle(diamonds);
		Collections.shuffle(clubs);

		deck.add(hearts);
		deck.add(spades);
		deck.add(diamonds);
		deck.add(clubs);
	}
	
	private String getDenomination(int num) {
		switch (num) {
		case 1:	return "A";
		case 11: return	"J";
		case 12: return	"Q";
		case 13: return	"K";
		default: return	String.valueOf(num);
		}
	}
	
	public String[] drawCard() {
		// 카드 리스트에서 빼기
		String result[] = new String[2]; // 무늬와 값을 담을 배열 생성
		int random = (int) (Math.random() * 4); // 무늬 패턴 랜덤 선정
		result[0] = String.valueOf(random); // 무늬 숫자화 
		ArrayList<String> randomParttenList = deck.get(random); // 숫자화된 무늬의 리스트 가져오기
		result[1] = randomParttenList.get(randomParttenList.size() - 1); // 맨 뒤값 가져오기

		randomParttenList.remove(randomParttenList.size() - 1); // 맨 뒤값 삭제
		return result;
	}

	public void viewCard() {
		String str = "";
		for (int i = 0; i < 4; i++) {
			ArrayList<String> arrayList = deck.get(i);
			switch (i) {
			case 0:	str = "♥";	break;
			case 1:	str = "♠ ";	break;
			case 2:	str = "◆ ";	break;
			case 3:	str = "♣ ";	break;
			}
			System.out.printf("%s \t :", str);
			System.out.println(arrayList);
		}
	}
	/*
	public void viewCard2() {
		for(int index = 0 ; index < deck2.size(); index++) {
			Card card = deck2.get(index);
			System.out.println(card.toString());
		}
	}
	*/
}
