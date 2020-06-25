package BaseBall_test;

public class Myball {
	private int[] rArr;
	private int range;

	Myball() {

	}

	Myball(int balls, int range) {
		init(balls, range);
	}

	private void init(int balls, int range) {
		//scan = new Scanner(System.in);
		rArr = new int[balls];
		this.range = range;
	}

	void setNumbers() {
		Message.getMessage(5);
		for (int i = 0; i < rArr.length; i++) {
			System.out.printf("%d번째 숫자: ",i+1);
			
			rArr[i] = Checker.checkRange(range);
			
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