package kr.co.dendrocopos.first.level3;

public class Car {
	String name;
	String color;
	int cc;

	Car() {
		//super();
		//System.out.println("Car 기본생성자!");
		this("소나타","흰색",2500);
	}

	Car(String name, String color, int cc) {
		super();
		this.name = name;
		this.color = color;
		this.cc = cc;
	}

	public void introduceMyCar() {
		System.out.printf("%s의 컬러는 %s이고 %dcc이다\n", name, color, cc);
	}
}
