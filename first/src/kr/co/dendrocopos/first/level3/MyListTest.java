package kr.co.dendrocopos.first.level3;

public class MyListTest {
	public static void main(String[] args) {
		//MyList list2 = new MyList();
		
		//MyList list = MyList.getInstance(); // 싱글톤 생성
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.remove(2);
		
		int val = list.get(2);
		System.out.println(val);
		
		list.printToString();
	}
}

class MyList {
	private int[] list = new int[0];
	
	/*
	// 싱글톤 구현방식
	private static MyList temp; // 자기자신을 static으로 지정함
	private MyList() {} // 추가 생성자를 막음	
	static MyList getInstance() { // static 메소드로 한번만 생성.
		if(temp == null) {
			temp = new MyList();
		}
		return temp;
	}
	// 싱글톤 구현 끝
	*/
	
	void add(int num) {
		int[] arrTemp = new int[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			arrTemp[i] = list[i];
		}
		arrTemp[list.length] = num;
		list = arrTemp;
	}
	
	void printToString() {
		System.out.print("[");
		for( int i = 0 ; i < list.length; i++) {
			System.out.printf( i > 0 ? ",%d" : "%d",list[i]);
		}
		System.out.println("]");
	}
	
	void remove(int index) {
		int[] arrTemp = new int[list.length-1];
		for( int i = 0; i < arrTemp.length; i++) {
			arrTemp[i] = (i >= index) ? list[i+1] : list[i];
		}
		list = arrTemp;
	}
	
	int size() {
		return list.length;
	}
	
	int get(int index) {
		return list[index];
	}
}