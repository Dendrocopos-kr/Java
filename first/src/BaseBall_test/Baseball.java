package BaseBall_test;

import java.util.Arrays;

public class Baseball {
	private int[] rArr;
	
	Baseball(){
		init();
	}
	
	private void init() {
		rArr = new int[mainThread.balls];
		setRandom();
	}
	
	private void setRandom() {
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * mainThread.range) + 1;
			for (int j = 0; j < i; j++) {
				if (rArr[i] == rArr[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(rArr));
	}
	
	public int get(int index) {
		return rArr[index];
	}
}
