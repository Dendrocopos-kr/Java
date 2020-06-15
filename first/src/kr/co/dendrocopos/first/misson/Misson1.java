package kr.co.dendrocopos.first.misson;

public class Misson1 {
	public static void main(String[] args)
	{
		int n1 = 10;
		int n2 = 3;
		
		float result = (float)n1 / (float)n2;
		
		//결과를 변수에 담아서, 변수를 콘솔에 찍으면 3.3333 어쩌고 나오게 하기
		
		System.out.println(result);
		System.out.printf("%.1f",result);
	}
}
