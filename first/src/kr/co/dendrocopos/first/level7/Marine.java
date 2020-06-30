package kr.co.dendrocopos.first.level7;

public class Marine extends Unit implements AttackableUnit , movableUnit{
	private int damage;
	private static String name = "마린";
	
	public Marine() {
		super(name,50);
		this.damage = 5;
		
	}
	
	@Override
	public void Attack(Unit u) {
		if( u == this ) {
			System.out.println("자기자신을 공격할 수 없습니다.");
		}else {
			System.out.println(name+"이(가)"+ u.NAME + "을(를) 공격합니다. 따다다다다~");
			u.getDamage(damage);
		}
	}
	
}
