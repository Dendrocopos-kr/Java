package kr.co.dendrocopos.first.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission8_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int random_max = 90;
		int random_min = 10;
		int selected_num = (int) (Math.random() * random_max - random_min + 1) + random_min;

		Random random = new Random();
		// int selected_num = random.nextInt(random_max - random_min + 1) + random_min;

		System.out.printf("랜덤값 %d ~ %d 맞추는 게임\n", random_min, random_max);
		System.out.println("--------------------");
		while (true) {
			
			while (true) {
				System.out.print("값 입력:");
				input = scan.nextInt();
				if (input > random_max || input < random_min) {
					System.out.println("범위를 초과했습니다. 다시 입력해주세요.");
				}else {
					break;
				}
			}
			
			if (input == selected_num) {
				System.out.println("Great!!");
				break;
			}
			System.out.println(input > selected_num ? "Down" : "UP");
		}

		scan.close();
	}
}
