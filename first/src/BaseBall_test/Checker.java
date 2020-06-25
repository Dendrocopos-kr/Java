package BaseBall_test;

public class Checker {
	public static boolean check(int balls, Baseball b, Myball mb) {
		int nBall = 0;
		int nStrike = 0;
		int nOut;
		// Try++;
		for (int i = 0; i < balls; i++) {
			for (int j = 0; j < balls; j++) {
				if (b.get(i) == mb.get(j)) {
					if (i == j) {
						nStrike++;
					} else {
						nBall++;
					}
				}
			}
		}
		nOut = balls - nStrike - nBall;
		System.out.println("S: " + nStrike + "/ B:" + nBall + "/ O: " + nOut + "\n");

		return (nStrike == balls) ? false : true;
	}

	public static boolean checkRange(int range, int val) {
		if (val < 1 || val > range) {
			System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", val, range);
			return true;
		} else {
			return false;
		}
	}
}
