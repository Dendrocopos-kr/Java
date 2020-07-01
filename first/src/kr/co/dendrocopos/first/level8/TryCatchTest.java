package kr.co.dendrocopos.first.level8;

public class TryCatchTest {
	public static void main(String[] args) {
		meth();
		
		try {
			meth2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			div(20,0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int div(int num1, int n2) throws Exception{
		return num1 / n2;
	}
	
	public static void meth2() throws ClassNotFoundException {
		Class.forName("fdsafds");
	}

	public static void meth() {
		int result = 2;

		try {
			// result = 10 / 0;

			if (result % 2 == 0) {
				return;
			}
			Class.forName("");
		//} catch (SQLException e) { // 순차적으로 catch함

		} catch (ClassNotFoundException e) {

		} catch (Exception e) { // 최상위 부모격이라 마지막에 써야함
			System.out.println("예외가 발생하였습니다.");
			// System.err.println(e);
			e.printStackTrace();
		} finally { // try문을 실행하면 무조건 실행함
			System.out.println("finally");
		}
		System.out.println("result: " + result);
		System.out.println("종료!");
	}
}
