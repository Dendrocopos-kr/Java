package kr.co.dendrocopos.first;

public class Variable {
	public static void main(String[] args)
	{
		//문자, 정수형
		char 		v1;
		v1 = 'A';
		System.out.println(v1);
		System.out.println('A');
		
		v1 = 'B';
		System.out.println(v1);
		
		System.out.println();
				
		byte 		v2;
		short 		v3;
		int 		v4;
		long 		v5;
		
		v2 = 10;
		v3 = 20;
		v4 = 30;
		v5 = 50;
		
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		
		System.out.println();
		
		//실수형
		float 		v6;
		v6 = 10.1f;
		System.out.println(v6);
		
		double 		v7;
		v7 = 10.1;
		System.out.println(v7);
		
		v6 = (float)v7;
		
		System.out.println();
		
		//True , False
		boolean 	v8;
		
		v8 = true;
		System.out.println(v8);
		v8 = false;
		System.out.println(v8);
		System.out.println();
		
		String r1;
		r1 = "안녕하세요";
		System.out.println(r1);
	}
}
