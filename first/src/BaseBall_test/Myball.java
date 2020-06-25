package BaseBall_test;

import java.util.Scanner;

public class Myball {
	private int[] rArr;
	private int range;
	private Scanner scan;

	Myball() {

	}

	Myball(int balls, int range) {
		init(balls, range);
	}

	private void init(int balls, int range) {
		scan = new Scanner(System.in);
		rArr = new int[balls];
		this.range = range;
	}

	void setNumbers() {
		int temp = 0;
		System.out.printf("숫자 %d개를 입력하세요.\n", rArr.length);
		
		for (int i = 0; i < rArr.length; i++) {
			System.out.printf("%d번째 숫자: ",i+1);
			
			while(true) {
				String val = scan.nextLine();
				try {
					temp = Integer.parseInt(val);				
				}catch(Exception e) {
					System.out.print("숫자만 입력하세요. :");
					continue;
				}
				
				if ( Checker.checkRange(range, temp) ) {
					//System.out.printf("입력값 : %d, 범위를 벗어났습니다. 범위( 1~%d )\n다시 입력해주세요. : ", temp, range);
					continue;
				}				
				rArr[i] = temp;
				break;
			}			
			
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					System.out.printf("중복입니다.\n다시 입력해주세요. : ", temp);
					break;
				}
			}

		}
	}

	public int get(int index) {
		return rArr[index];
	}
}