package kr.co.dendrocopos.first.BlackJack;


public class Gamer extends Player {

	private Gamer() {}
	public Gamer(String string) {
		setName(string);
	}
	
	@Override
	public void viewCard() {
		String str = "";
		str = "";
		str += String.format(
				"+----------------------------------------------+\n"
				+ "|%13s%3s%30s|\n"
				+ "|%46s|\n"
				+ "|%6s%30d%10s|\n"
				+ "+----------------------------------------------+\n",
				getName(), " : ", " ",
				getPlayerCard(),
				"합계: ", Checker.myCardPoint(this),Checker.isBusted(this)? "(Bust!)" : " ");
		System.out.println(str);

	}

}
