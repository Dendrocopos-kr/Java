package kr.co.dendrocopos.second.cafe;

public class Barista{

	public Coffee makeCoffee(MenuItem choiceMenu) {
		return new Coffee(choiceMenu);
	}
}
