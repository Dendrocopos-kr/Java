package kr.co.dendrocopos.first;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1 == str2); // 절대 이렇게 사용하지말것.
		System.out.println(str1.equals(str2));
	}
}
