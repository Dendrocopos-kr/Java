package kr.co.dendrocopos.first;

public class Operator5 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 11;
		int n3 = 12;
		
		boolean result = ( n1 == n2 );
		System.out.println(result);
		System.out.println(!result); // 결과 반전
		
		result = ( n1 != n2 );
		System.out.println(result);
		
		result = n1 > n2;
		System.out.println(result);
		result = n1 < n2;
		System.out.println(result);
		
		result = ( n1 < n2 ) & ( n2 < n3 ) & ( n1 < n3 );
		System.out.println(result);
		String r1 = "ㅁㅁㅁㅁ";
		String r2 = "ㅇㅇㅇㅇ";
		
		System.out.println("문자열 비교:"+ r1.equals(r2));
	}
}
