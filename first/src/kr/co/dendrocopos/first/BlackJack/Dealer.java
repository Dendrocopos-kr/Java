package kr.co.dendrocopos.first.BlackJack;

public class Dealer extends Player {

	public Dealer(String string) {
		setName(string);
	}
	@Override
	public void viewCard() {
		String str = "";
		String temp = "";
		str = String.format("+----------------------------------------------+\n|%13s%3s%30s|\n|", getName(), " : ", " ");
		for (int i = 0; i < getPlayerCard().size(); i++) {
			temp += (i > 0) ? String.format(",%s", getPlayerCard().get(i)) : "[Blind";
		}
		str += String.format("%45s]|\n"
				+ "|%6s%30s%10s|\n"
				+ "+----------------------------------------------+\n",
				temp,
				"합계: ", "?",Checker.isBusted(this)? "(Bust!)" : " ");
		System.out.println(str);

	}

}
