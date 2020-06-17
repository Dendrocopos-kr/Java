package kr.co.dendrocopos.first.mission;

public class GreatMission3 {
	public static void main(String[] args) {
		//변수 선언
		String[] strSubject = { "영어", "수학", "국어", "사회" };
		int[][] arrScore = { 
				{ 90, 100, 88 }, // 영어
				{ 34, 99, 45 }, // 수학
				{ 98, 65, 87 }, // 국어
				{ 49, 51, 63 } // 사회
		};

		int[] scoreSum = new int[strSubject.length];
		int tSum = 0;

		float[] scoreAvg = new float[strSubject.length];
		float tAvg = 0.0f;
		
		//계산 부분
		for (int i = 0; i < strSubject.length; i++) {
			for (int j = 0; j < arrScore[i].length; j++) {
				scoreSum[i] += arrScore[i][j];
			}
			scoreAvg[i] = (float)scoreSum[i] / arrScore[i].length;
			tSum += scoreSum[i];
			tAvg += scoreAvg[i];
		}
		
		//출력 부분
		for (int i = 0; i < strSubject.length; i++) {
			System.out.printf("%s점수: %d, 평균점수: %.1f\n",strSubject[i],scoreSum[i],scoreAvg[i]);
		}
		System.out.printf("전체점수: %d, 전체평균: %.1f", tSum, tAvg / strSubject.length);

	}
}
