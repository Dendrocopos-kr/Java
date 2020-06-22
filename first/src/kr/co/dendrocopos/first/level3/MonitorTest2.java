package kr.co.dendrocopos.first.level3;

public class MonitorTest2 {
	public static void main(String[] args) {
		Monitor.brand = "삼성";
		Monitor.printBrand();
		
		Monitor m1 = new Monitor();
		m1.printfInfo();
	}
}
