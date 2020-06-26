package BaseBall_test;

public class Message {
	static void getMessage(int messageNumber) {
		switch (messageNumber) {
		case 0:
			System.out.println("숫자 야구게임을 시작합니다. \n\n맞출 숫자의 갯수와 범위를 정해주세요 ( 맞출숫자 < 맞출범위 )");
			break;
		case 1:
			System.out.println("\n설정 오류로 기본셋팅으로 시작합니다.");
			break;
		case 2:
			System.out.printf("맞출 숫자 %d개, 범위 1~%d 입니다.\n", mainThread.balls, mainThread.range);
			break;
		case 3:
			System.out.printf("범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", mainThread.range);
			break;
		case 4:
			System.out.printf("중복입니다.\n다시 입력해주세요. : ");
			break;
		case 5:
			System.out.println("숫자만 입력하세요.");
			break;
		case 6:
			System.out.print("맞출 갯수를 정해주세요 (1 ~ 입력값, 기본값 3):");
			break;
		case 7:
			System.out.print("맞출 범위를 지정해주세요 (1 ~ 입력값, 기본값 9) :");
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			System.out.println("정답입니다.");
			break;
		}

	}
}
