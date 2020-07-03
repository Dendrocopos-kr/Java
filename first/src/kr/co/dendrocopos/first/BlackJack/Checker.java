package kr.co.dendrocopos.first.BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Checker {
	static Scanner scan = new Scanner(System.in);

	/*
	public static boolean checkStop(Player player) {
		if (player instanceof Dealer) {
			return checkDealerMoreDraw(player);
		} else {
			return checkPlayerMoreDraw(player);
		}

	}
	 */
	public static boolean checkDealerMoreDraw(Player player) {
		if (player instanceof Dealer) {
			int checker = Checker.myCardSum(player);
			if (checker <= 16) {
				return false;
			} else {
				return true;
			}
		}
		/*
		else {
			System.out.println("Dealer가 아닙니다.");
		}
		*/
		return true;
	}

	public static boolean checkPlayerMoreDraw(Player player) {
		int checker = Checker.myCardSum(player);
		String tmp = String.format("%46s", "받으시겠습니까? (Y/N) :");
		System.out.print(tmp);
		String str = scan.next();
		if ((("Y").equals(str) || ("y").equals(str)) && checker < 21) {
			return false;
		} else {
			return true;
		}
	}

	public static int myCardSum(Player player) {
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

	private static String aceCard(String deck, Player player) {
		int checker = Checker.myCardSum(player);
		if ("A".equals(deck)) {
			if (player instanceof Dealer) {
				if (checker <= 10) {
					return "A";
				} else {
					return "1";
				}
			} else {
				if (checker <= 10) {
					String tmp = String.format("%46s", "A를 11로 쓰실려면 Y, A를 1로 쓰실려면 N 입력해주세요.");
					System.out.print(tmp);
					String intput = scan.next();
					if (("Y").equals(intput) || ("y").equals(intput)) {
						return "A";
					}
				}
				return "1";
			}
		}
		return deck;
	}
	
	public static void setCard(Deck deck, Player player) {
		System.out.println(player.getName() +" : 카드를 뽑습니다.");
		String[] drawedCard = deck.drawCard();
		switch (drawedCard[0]) {
		case "0":
			drawedCard[0] = "♥ ";
			break;
		case "1":
			drawedCard[0] = "♠ ";
			break;
		case "2":
			drawedCard[0] = "◆ ";
			break;
		case "3":
			drawedCard[0] = "♣ ";
			break;
		}
		drawedCard[1] = Checker.aceCard(drawedCard[1], player);
		player.getPlayerCard().add(drawedCard[0] + drawedCard[1]);
	}

	public static void playerAllCard(Player player) {
		String str = String.format(
				"+----------------------------------------------+\n" + "|%13s%3s%30s|\n" + "|%46s|\n"
						+ "|%6s%30d%10s|\n" + "+----------------------------------------------+\n",
				player.getName(), " : ", " ", player.getPlayerCard(), "합계: ", Checker.myCardSum(player),
				Checker.isBusted(player) ? "(Bust!)" : " ");
		System.out.println(str);
	}

	public static String Winner(Player gamer, Player dealer) {
		int gamerSum = Checker.myCardSum(gamer);
		int dealerSum = Checker.myCardSum(dealer);
		boolean gamerBusted = Checker.isBusted(gamer);
		boolean dealerBusted = Checker.isBusted(dealer);

		if (gamerBusted) {
			return "졌습니다";
		} else if (dealerBusted) {
			return "이겼습니다";
		} else {
			if ((gamerSum == dealerSum)) {
				return "비겼습니다";
			} else {
				if (Math.abs((gamerSum - 21)) < Math.abs(dealerSum - 21)) {
					return "이겼습니다";
				} else {
					return "졌습니다";
				}
			}
		}
	}

	public static boolean isBusted(Player player) {
		int sumCard = Checker.myCardSum(player);
		if (sumCard <= 21) {
			return false;
		} else {
			return true;
		}
	}

}
