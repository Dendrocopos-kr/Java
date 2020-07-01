package kr.co.dendrocopos.first.level7;

public class Marine extends Unit implements AttackableUnit, Treatable {
	private int damage;

	public Marine() {
		super("마린", 50);
		this.damage = 5;

	}

	@Override
	public void Attack(Unit u) {
		if (u == this) {
			System.out.println("자기자신을 공격할 수 없습니다.");
			return;
		} else {
			System.out.printf("%s이(가) %s을(를) 공격합니다. 따다다다다~\n",super.NAME,u.NAME);
			u.getDamage(damage);
		}
	}

}
