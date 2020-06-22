package kr.co.dendrocopos.first.level3;

public class BoardTest {
	public static void main(String[] args) {
		BoardVO bv1 = new BoardVO();
		bv1.setTitle("제목2");
		bv1.setcontent("내용2");
		bv1.setwriteId(2);

		System.out.println( bv1.getTitle() );
		System.out.println( bv1.getcontent() );
		System.out.println( bv1.getwriteId() );
		
		BoardVO bv2 = new BoardVO("제목1","내용1",1);

		System.out.println( "bv2 제목 : " + bv2.getTitle() );
		System.out.println( "bv2 내용 : " + bv2.getcontent() );
		System.out.println( "bv2 번호 : " + bv2.getwriteId() );		
		
	}
}
