package kr.co.dendrocopos.second.blackjack;

public class Rules {
	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		int bustPoint = 21;
		int gp = gamer.getTotalPoint();
		int dp = dealer.getTotalPoint();

		if (gp > bustPoint) {
			System.out.println("플레이어 BUST! 딜러 승");
		} else if (dp > bustPoint) {
			System.out.println("딜러 BUST! 플레이어  승리");
		} else {
			gp = Math.abs(gp - bustPoint);
			dp = Math.abs(dp - bustPoint);
			if (gp == dp) {
				System.out.println("비겼습니다.");
			} else if (gp < dp) {
				System.out.println("게이머 승");
			} else {
				System.out.println("딜러 승");
			}
		}

	}
}
