package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

import kr.co.dendrocopos.first.Scan;

public class Checker {
	static Scanner scan = new Scanner(System.in);
	public static boolean checkStop() {
		System.out.print("받으시겠습니까? (Y/N) :");
		String str = scan.next();
		if(("Y").equals(str) || ("y").equals(str)) {
			return true;
		}else {
			return false;
		}
	}
	public static int blackJeck(Player player) {
		int sum = 0;
		ArrayList<String> cardList = player.getPlayerCard();
		for(int i = 0 ; i < cardList.size(); i++) {
			String[] str = cardList.get(i).split(" ");
			switch(str[1]) {
			case "A":
				sum += 1;
				break;
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
			case "10":
				sum += Integer.valueOf(str[1]);
				break;
			case "J":
			case "Q":
			case "K":
				sum += 10;
				break;
			}
		}
		return sum;
	}
}
