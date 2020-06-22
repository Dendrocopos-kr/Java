package kr.co.dendrocopos.first.level3;

public class Monitor {
	//static - 프로그램 실행시 메모리 바로 올라감
	//객체생성시 변화가 없는 공통사항의 내용을 저장하기위해 사용.
	
	static String brand; // 클래스변수
	int inch; //인스턴스 변수
	
	void printfInfo() {
		System.out.printf("brand:%s, inch: %d\n", this.brand, this.inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
}
