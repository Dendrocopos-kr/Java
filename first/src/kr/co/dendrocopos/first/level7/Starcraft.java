package kr.co.dendrocopos.first.level7;

public class Starcraft {
	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		FireBat f1 = new FireBat();
		Medic medic = new Medic();
		Medic medic2 = new Medic();
		
		System.out.println(m1);
		System.out.println(f1);
		f1.Attack(m1);
		f1.Attack(medic2);
		m1.Attack(f1);

		System.out.println(m1);
		System.out.println(f1);
		System.out.println(medic2);

		medic.heal(m1);
		medic.heal(f1);
		medic.heal(medic2);

		System.out.println(m1);
		System.out.println(f1);
		System.out.println(medic2);
		}
}
