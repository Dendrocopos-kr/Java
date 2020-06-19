package kr.co.dendrocopos.first.mission;


class SuperClass{

	void paint() {
		draw();
	}

	void draw() {
		System.out.println("Super object");
	}
}

class SubClass extends SuperClass {
	void paint() {
		super.paint();
		super.draw();
	}
	
	void draw() { 
		System.out.println("Sub object");
	}
}

class SubClass2 extends SuperClass {
	void paint() {
		super.paint();
	}
	
	void draw() { 
		System.out.println("Sub2 object");
	}
}

class Test {
	
	public static void main(String[] args) {
		SuperClass sc = new SubClass();
		sc.paint();
		
		SuperClass sc2 = new SubClass2();
		sc2.paint();
	
	}
}