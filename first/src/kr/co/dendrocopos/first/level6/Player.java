package kr.co.dendrocopos.first.level6;

// 객체화 불가능
// 자식의 주소값만 가르킴
// 부모역활만 한다.

public abstract class Player {
	
	protected abstract void play();
	
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}

class CDPlayer extends Player{
	
	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
}

class DVDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
}