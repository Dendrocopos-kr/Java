package BaseBall_test;

public class Game {
	public static void main(String[] args) {
		mainThread main = new mainThread();

		int setBall = main.getballs();
		int setRange = main.getRange();
		Baseball ball = new Baseball(setBall, setRange);
		Myball myBall = new Myball(setBall, setRange);
		
		do {
			myBall.setNumbers();
		} while (Checker.check(setBall, ball, myBall));

	}
}
