package kr.co.dendrocopos.first.mission;

import java.util.Scanner;

public class Mission02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요: ");
		int num1 = scan.nextInt();
		boolean TF = ( num1 % 2 == 0 );
		if ( TF ) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		scan.close();
	}
}
