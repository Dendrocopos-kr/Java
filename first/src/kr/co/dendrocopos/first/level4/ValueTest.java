package kr.co.dendrocopos.first.level4;

public class ValueTest {
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str == str2));
		System.out.println("2: " + str.equals(str2));
		
		Object val1 = new Value(1);
		Object val2 = new Value(1);
		
		System.out.println("3 :" + (val1 == val2));
		System.out.println("4 :" + val1.equals(val2));
	}
}
