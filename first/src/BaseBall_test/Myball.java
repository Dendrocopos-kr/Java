package BaseBall_test;

public class Myball {
	private int[] rArr;

	Myball() {
		init();
	}


	private void init() {
		//scan = new Scanner(System.in);
		rArr = new int[mainThread.balls];
	}

	void setNumbers() {
		Message.getMessage(5);
		for (int i = 0; i < rArr.length; i++) {
			System.out.printf("%d번째 숫자: ",i+1);
			
			rArr[i] = Checker.checkRange(mainThread.range);
			
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					Message.getMessage(4);
					break;
				}
			}

		}
	}

	public int get(int index) {
		return rArr[index];
	}
}