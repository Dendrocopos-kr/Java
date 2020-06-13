package kr.co.dendrocopos.first;

public class Variable2 {
	public static void main(String[] args)
	{
		int num = 10;
		int num2, num3 = 20;
		int num4 = 10, num5 = 20;
		
		/*
		 변수명 주의사항!
		
		1. 소문자 시작!! (가능한 카멜 케이스 기법 사용) int myMaxHeight;
		2. 특수기호는_, $만 사용가능
		3. 숫자로 시작하면 안된다.
		4. 예약어 사용금지!
		5. 변수명 띄워쓰기 금지!
		6. 대소문자 가린다.  
		7. 상수명은 무조건 대문자, 구분은 언더바로 한다.
		 */
		
		final int MY_MAX_HEIGHT = 1_000_000;
		System.out.println(MY_MAX_HEIGHT);	
	}
	
}