package kr.co.dendrocopos.first.level3;

public class BoardVO {
	/*
	private - 같은 클래스 안에서
	default - private + 같은 패키지
	protected - default + 상속관계
	public - 어디든
	*/
	private String title;
	private String content;
	private int writeId;
	
	public BoardVO() {
		super();
	}
	
	public BoardVO(String title, String content, int writeId) {
		super();
		this.title = title;
		this.content = content;
		this.writeId = writeId;
	}

	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }

	public void setcontent(String content) { this.content = content; }
	public String getcontent() { return content; }

	public void setwriteId(int writeId) { this.writeId = writeId; }
	public int getwriteId() { return writeId; }
	
}
