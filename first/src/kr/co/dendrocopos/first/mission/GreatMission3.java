package kr.co.dendrocopos.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {

		String[] strSubject = { "영어","수학","국어","사회"};

		int[] Sum = new int[strSubject.length];
		float[] Avg = new float[strSubject.length];
		int tSum = 0;
		float tAvg = 0.0f;
		
		int[][] arrSubject = {
				{ 90, 100, 88 }, //영어
				{ 34, 99, 45},	//수학
				{ 98, 65, 87},	//국어
				{ 49, 51, 63} //사회
		};
		
		for(int i = 0 ; i < strSubject.length ; i++){
			for(int j = 0 ; j < arrSubject[i].length; j++) {
				Sum[i] += arrSubject[i][j];
			}
		}
		
		for(int i = 0 ; i < strSubject.length ; i++){
			Avg[i] = Sum[i] / arrSubject[i].length;
		}		
		
		for( int i = 0 ; i < strSubject.length; i++) {
			tSum += Sum[i];
			tAvg += Avg[i];
		}
		
		for( int i = 0 ; i < strSubject.length; i++) {
			System.out.println(strSubject[i] + "점수: " + Sum[i] + ", " + "평균점수: " + Avg[i]);
		}
		System.out.printf("전체점수: %d, 전체평균: %.1f",tSum, tAvg/strSubject.length);
		
	}
}
