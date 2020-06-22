package kr.co.dendrocopos.first.level3;

public class MonitorTest {
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		Monitor.brand = "삼성";
		m1.inch = 30;
		m1.printfInfo();
		
		Monitor.brand = "LG";
		m2.inch = 35;
		m2.printfInfo();
		m1.printfInfo();
		
	}
}
