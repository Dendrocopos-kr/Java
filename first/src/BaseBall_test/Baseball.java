package BaseBall_test;

import java.util.Arrays;

public class Baseball {
	private int[] rArr;
	private int range; 
	
	Baseball(){
		
	}
	Baseball(int balls, int range) {
		init(balls,range);
	}
	
	private void init(int balls, int range) {
		rArr = new int[balls];
		this.range =  range;
		setRandom();
	}
	
	private void setRandom() {
		for (int i = 0; i < rArr.length; i++) {
			rArr[i] = (int) (Math.random() * range) + 1;
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
