package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Checker {
	static Scanner scan = new Scanner(System.in);

	public static boolean checkStop(Player player) {
		if (player.DEALER) {
			int checker = Checker.blackJeck(player);
			if (checker <= 16) {
				return false;
			} else {
				return true;
			}
		} else {
			String tmp = String.format("%50s", "받으시겠습니까? (Y/N) :");
			System.out.print(tmp);
			String str = scan.next();
			if (("Y").equals(str) || ("y").equals(str)) {
				return false;
			} else {
				return true;
			}

		}

	}

	public static int blackJeck(Player player) {
		int sum = 0;
		ArrayList<String> cardList = player.getPlayerCard();
		for (int i = 0; i < cardList.size(); i++) {
			String[] str = cardList.get(i).split(" ");
			switch (str[1]) {
			case "1":
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
			case "A":
				sum += 11;
				break;
			}
		}
		return sum;
	}

	public static String aceCard(String card, Player player) {
		if ("A".equals(card)) {
			if (player.DEALER) {
				int checker = Checker.blackJeck(player);
				if (checker <= 10) {
					return "A";
				} else {
					return "1";
				}
			} else {
				String tmp = String.format("%46s", "A를 11로 쓰실려면 Y, A를 1로 쓰실려면 N 입력해주세요.");
				System.out.print(tmp);
				String intput = scan.next();
				if (("Y").equals(intput) || ("y").equals(intput)) {
					return "A";
				} else {
					return "1";
				}
			}
		}
		return card;
	}
}
