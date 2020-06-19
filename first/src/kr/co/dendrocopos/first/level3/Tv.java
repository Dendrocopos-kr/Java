package kr.co.dendrocopos.first.level3;

//사용자 정의 클래스
public class Tv {
	// 멤버 필드
	String name;
	boolean power;
	int channel;
	
	//생성자
	public Tv() {
	}
	
	public Tv(String name){
		this.name = name;
	}
	
	//멤버 메소드
	void changePower() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
