package kr.co.dendrocopos.first.level3;

public class Monitor2 {
	String brand;
	int inch;
	static int cnt;
	
	public Monitor2(String brand, int inch) {
		//super(); 생략됨
		cnt++;
		this.brand = brand;
		this.inch = inch;
	}
	
	void printInfo() {
		System.out.printf("brand: %s, inch: %d",this.brand,this.inch);
	}

}
