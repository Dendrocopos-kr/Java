package kr.co.dendrocopos.first.level7;

public class Medic extends Unit implements Treatable {
	private int Treatment;

	public Medic() {
		super("메딕", 70);
		Treatment = 1;
	}

	public void heal(Unit u) {
		if (u == this || !(u instanceof Treatable)) {
			System.out.printf("%s을(를) 치료할 수 없습니다.\n", u.NAME);
			return;
		} else {
			while (u.getCurrent_hp() < u.MAX_HP) {
				u.setCurrent_hp(Treatment);
				System.out.printf("%s이(가) +%d 회복했습니다. \n", 
						u.NAME, Treatment);
			}
		}
	}
}
