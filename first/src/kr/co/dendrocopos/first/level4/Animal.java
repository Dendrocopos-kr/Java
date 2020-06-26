package kr.co.dendrocopos.first.level4;

public class Animal {
	private String name;
	private String type; // 포유류, 조류, 어류, 기타등등
	
	protected Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	void crying() {
		System.out.println("울음소리");
	}
	
	void eat() {
		System.out.println("주식");
	}
	
	void whoAmI() {
		System.out.printf("나는 %s이고 %s입니다.\n",name,type);
	}
}
