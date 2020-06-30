package kr.co.dendrocopos.first.level7;

public class Starcraft {
	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println(m1);
		System.out.println(m2);
		m2.Attack(m1);
		
		System.out.println(m1);
		m1.Attack(m2);
		m1.Attack(m2);
		m1.Attack(m2);

		m2.Attack(m2);
		m2.Attack(m2);
		
		System.out.println(m2);
	}
}
