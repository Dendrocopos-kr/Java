package BaseBall_test;

import java.util.Scanner;

public class mainThread {
	private int balls;
	private int changeBalls;
	void setballs(int balls) {	this.balls = balls;	}
	int getballs() {	return this.balls;	}

	private int range;
	private int changeRange;
	void setRange(int range) {	this.range = range;	}
	int getRange() {	return this.range;	}

	Scanner scan = new Scanner(System.in);

	mainThread() {
		init(3,9);
		checkingSet();	
	}
	
	void init(int balls, int range) {
		this.balls = balls;
		this.range = range;
		System.out.println("숫자 야구게임을 시작합니다. \n\n맞출 숫자의 갯수와 범위를 정해주세요");
		System.out.print("맞출숫자 < 맞출범위 :");
		changeBalls = scan.nextInt();
		changeRange = scan.nextInt();
	}
	
	private void checkingSet() { // 범위와 공 개수 확인 ( 공 0개이하 or 공개수 >= 범위면 초기값 공3,범위1~9 )

		if (changeBalls < 1 || changeRange <= changeBalls) {
			System.out.println("설정 오류로 기본셋팅으로 시작합니다.");
		} else {
			balls = changeBalls;
			range = changeRange;
		}
		System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", balls, range);
	}
}
