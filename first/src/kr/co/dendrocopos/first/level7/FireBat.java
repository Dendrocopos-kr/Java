package kr.co.dendrocopos.first.level7;

public class FireBat extends Unit implements AttackableUnit, movableUnit {

	private int damage;

	public FireBat() {
		super("파이어 뱃", 60);
		damage = 7;
	}

	@Override
	public void Attack(Unit u) {
		if (u == this) {
			System.out.println("자기자신을 공격할 수 없습니다.");
			return;
		} else {
			System.out.printf("%s이(가) %s을(를) 공격합니다. 퐈이어~~~\n",super.NAME,u.NAME);
			u.getDamage(damage);
		}

	}
}
