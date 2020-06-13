package kr.co.dendrocopos.first.misson;

import java.util.Scanner;

public class Misson3 {
	public static void main(String[] args) {		
		/*
		// 초안.
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요: (남/여) ");
		String gender = scan.next();
		System.out.println("키를 입력해주세요: ");
		int urHeight = scan.nextInt();
		int manAvg = 160;
		int womanAvg = 150;
		
		if( "남".equals(gender) )
		{
			if( urHeight > manAvg )
			{
				System.out.println("평균초과입니다.");
			}else if( urHeight < manAvg ){
				System.out.println("평균미만입니다.");
			}else {
				System.out.println("평균입니다.");
			}
		}else if ( "여".equals(gender) )
		{
			if( urHeight > womanAvg )
			{
				System.out.println("평균초과입니다.");
			}else if ( urHeight < womanAvg ) {
				System.out.println("평균미만입니다.");
			}else {
				System.out.println("평균입니다.");
			}
		}
		*/
		
		/* 1번 수정
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요: (남/여) ");
		String gender = scan.next();
		System.out.println("키를 입력해주세요: ");
		int urHeight = scan.nextInt();
		int manAvg = 160;
		int womanAvg = 150;
		
		
		if( "남".equals(gender) && urHeight > manAvg ){
			System.out.println("평균초과입니다.");
		}else if ( "남".equals(gender) && urHeight < manAvg ){
			System.out.println("평균미만입니다.");
		}else if ( "남".equals(gender) && urHeight == manAvg ){
			System.out.println("평균입니다.");
		}else if ("여".equals(gender) && urHeight > womanAvg ){
			System.out.println("평균초과입니다.");
		}else if ("여".equals(gender) && urHeight < womanAvg ){
			System.out.println("평균미만입니다.");			
		}else if ("여".equals(gender) && urHeight == womanAvg){
			System.out.println("평균입니다.");
		}
		*/
		
		/* 2번 수정
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요: (남/여) ");
		String gender = scan.next();
		int manAvg = 160;
		int womanAvg = 150;
		
		while ( !"남".equals(gender) && !"여".equals(gender))
		{
			System.out.println("오류 성별을 확인할 수 없습니다!");
			System.out.println("성별을 입력해주세요: (남/여) ");
			gender = scan.next();
		}
		System.out.println("키를 입력해주세요: ");
		int urHeight = scan.nextInt();
		
		if( "남".equals(gender) )
		{
			if( urHeight > manAvg )
			{
				System.out.println("평균초과입니다.");
			}else if( urHeight < manAvg ){
				System.out.println("평균미만입니다.");
			}else {
				System.out.println("평균입니다.");
			}
		}else if ( "여".equals(gender) )
		{
			if( urHeight > womanAvg )
			{
				System.out.println("평균초과입니다.");
			}else if ( urHeight < womanAvg ) {
				System.out.println("평균미만입니다.");
			}else {
				System.out.println("평균입니다.");
			}
		}
		
		*/
		
		/* 3번 수정
		Scanner scan = new Scanner(System.in);
		String strRetry;
		
		do {

			System.out.println("성별을 입력해주세요: (남/여) ");

			String gender = scan.next();
			while ( !"남".equals(gender) && !"여".equals(gender))
			{
				System.out.println("오류 성별을 확인할 수 없습니다!");
				System.out.println("성별을 입력해주세요: (남/여) ");
				gender = scan.next();
			}
			
			System.out.println("키를 입력해주세요: ");	
			int urHeight = scan.nextInt();
			
			int manAvg = 160;
			int womanAvg = 150;
			boolean bManGender = "남".equals(gender);
			boolean bWomanGender = "여".equals(gender);
						
			if(		   bManGender && urHeight > manAvg ){
				System.out.println("평균초과입니다.");
			}else if ( bManGender && urHeight < manAvg ){
				System.out.println("평균미만입니다.");
			}else if ( bManGender && urHeight == manAvg ){
				System.out.println("평균입니다.");
			}
			
			if ( 	   bWomanGender && urHeight > womanAvg ){
				System.out.println("평균초과입니다.");
			}else if ( bWomanGender && urHeight < womanAvg ){
				System.out.println("평균미만입니다.");			
			}else if ( bWomanGender && urHeight == womanAvg){
				System.out.println("평균입니다.");
			}			
			
			System.out.println("\n재입력은 'R'을 입력해주세요. 그 외는 종료.");
			strRetry = scan.next();
		}
		while ( "R".equals(strRetry) || "r".equals(strRetry));
		
		*/
		// 4번째
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요: (남/여) ");
		String gender = scan.next();
		System.out.println("키를 입력해주세요: ");
		int urHeight = scan.nextInt();
		int manAvg = 160;
		int womanAvg = 150;
		
		if ( 	   ("남".equals(gender) && (urHeight == manAvg))	|| ( "여".equals(gender) && urHeight == womanAvg) ){
			System.out.println("평균입니다.");
		}else if(  ("남".equals(gender) && urHeight > manAvg) 	|| ( "여".equals(gender) && urHeight > womanAvg ) ){
			System.out.println("평균초과입니다.");
		}else if ( ("남".equals(gender) && urHeight < manAvg)	|| ( "여".equals(gender) && urHeight < womanAvg ) ){
			System.out.println("평균미만입니다.");
		}
		
		
		// 5번째
		/*
		Scanner scan = new Scanner(System.in);
		String strRetry;
		
		do {

			System.out.println("성별을 입력해주세요: (남/여) ");

			String gender = scan.next();
			while ( !"남".equals(gender) && !"여".equals(gender))
			{
				System.out.println("오류 성별을 확인할 수 없습니다!");
				System.out.println("성별을 입력해주세요: (남/여) ");
				gender = scan.next();
			}
			
			System.out.println("키를 입력해주세요: ");	
			int urHeight = scan.nextInt();
			
			int manAvg = 160;
			int womanAvg = 150;
			
			boolean bManGender = "남".equals(gender);
			boolean bWomanGender = "여".equals(gender);
			
			boolean bOverHeightMan = urHeight > manAvg;
			boolean bEqaulHeightMan = (urHeight == manAvg);
			boolean bUnderHeightMan = urHeight < manAvg;
			
			boolean bOverHeightWoman = urHeight > womanAvg;
			boolean bEqaulHeightWoman = (urHeight == womanAvg);
			boolean bUnderHeightWoman = urHeight < womanAvg;
			
			if( (bManGender && bOverHeightMan) || ( bWomanGender && bOverHeightWoman) ){
				System.out.println("평균초과입니다.");
			}else if ( (bManGender && bUnderHeightMan) || ( bWomanGender && bUnderHeightWoman) ){
				System.out.println("평균미만입니다.");
			}else if ( (bManGender && bEqaulHeightMan) || ( bWomanGender && bEqaulHeightWoman) ){
				System.out.println("평균입니다.");
			}
			
			System.out.println("\n재입력은 'R'을 입력해주세요. 그 외는 종료.");
			strRetry = scan.next();
		}
		while ( "R".equals(strRetry) || "r".equals(strRetry));
		*/
		
		scan.close();
		
	}
}
