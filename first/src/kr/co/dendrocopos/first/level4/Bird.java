package kr.co.dendrocopos.first.level4;

public class Bird extends Animal{
	
	protected Bird(String name){
		super(name,"조류");
	}
	@Override
	void crying() {
		System.out.println("j-jcak");
	}
	void flying() {
		System.out.println("난다");
	}
}
