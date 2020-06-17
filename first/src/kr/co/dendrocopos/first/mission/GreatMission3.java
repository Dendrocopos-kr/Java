package kr.co.dendrocopos.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		int[][] arr = {
				{ 90, 100, 88 }, //영어
				{ 34, 99, 45},	//수학
				{ 98, 65, 87}	//국어
		};
		
		String[] subject = { "영어","수학","국어"};
		
		int[] Sum = new int[subject.length];
		float[] Avg = new float[subject.length];
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length; j++) {
				Sum[i] += arr[j][i];
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			Avg[i] = Sum[i] / arr[i].length;
		}
		
		
		for( int i = 0 ; i < subject.length; i++) {
			
		}
		System.out.printf(
				  "영어: %d, 평균: %3.2f\n"
				+ "수학: %d, 평균: %3.2f\n"
				+ "국어: %d, 평균: %3.2f\n"
				+ "전체: %d, 평균: %3.2f",
				eSum,eAvg,
				mSum,mAvg,
				lSum,lAvg,
				eSum+mSum+lSum,(eAvg+mAvg+lAvg/arr.length)
				);
	}
}
