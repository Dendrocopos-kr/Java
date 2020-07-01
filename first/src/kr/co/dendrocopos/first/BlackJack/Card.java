package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class Card {
	private ArrayList<ArrayList<String>> card = new ArrayList<ArrayList<String>>();

	public void initialization() {
		newCard();
	}

	private void newCard() {
		// 패턴 4개 = 하트,다이아,스페이드,클로버
		// A,2~10,J,Q,K = 13개 만들기
		ArrayList<String> hearts = new ArrayList<String>();
		ArrayList<String> spades = new ArrayList<String>();
		ArrayList<String> diamonds = new ArrayList<String>();
		ArrayList<String> clubs = new ArrayList<String>();
		for (int j = 1; j <= 13; j++) {
			String str = "";
			switch (j) {
			case 1:
				str = "A";
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				str = String.format("%d", j);
				break;
			case 11:
				str = "J";
				break;
			case 12:
				str = "Q";
				break;
			case 13:
				str = "K";
				break;
			}

			hearts.add(str);
			spades.add(str);
			diamonds.add(str);
			clubs.add(str);
		}
		Collections.shuffle(hearts);
		Collections.shuffle(spades);
		Collections.shuffle(diamonds);
		Collections.shuffle(clubs);
		
		card.add(hearts);
		card.add(spades);
		card.add(diamonds);
		card.add(clubs);
	}

	public String[] drawCard() {
		// 카드 리스트에서 빼기
		String result[] = new String[2];
		int random = (int)(Math.random()*4);
		result[0] = String.format("%d", random);
		ArrayList<String> randomParttenList = card.get(random);
		result[1] = randomParttenList.get(randomParttenList.size()-1);
		randomParttenList.remove(randomParttenList.size()-1);
		return result;
	}

	public void viewCard() {
		String str = "";
		for (int i = 0; i < 4; i++) {
			ArrayList<String> arrayList = card.get(i);
			switch(i) {
			case 0:
				str = "Hearts ";
				break;
			case 1:
				str = "Spades ";
				break;
			case 2:
				str = "Diamonds ";
				break;
			case 3:
				str = "Clubs ";
				break;
			}
			System.out.printf("%10s : ",str );
			System.out.println(arrayList);
		}
	}
}
