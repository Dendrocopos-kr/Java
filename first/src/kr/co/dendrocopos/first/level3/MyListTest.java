package kr.co.dendrocopos.first.level3;

public class MyListTest {
	public static void main(String[] args) {
		// MyList list2 = new MyList();

		// MyList list = MyList.getInstance(); // 싱글톤 생성
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);

		list.add(2, 100);
		// list.remove(3);
		// list.remove();
		// list.clear();

		int delVal = list.remove(1);
		System.out.println("삭제된 값: " + delVal);

		list.printToString();

	}
}

class MyList {
	private int[] list;

	/*
	 * // 싱글톤 구현방식 private static MyList temp; // 자기자신을 static으로 지정함
	 * 
	 * private MyList() { } // 추가 생성자를 막음
	 * 
	 * static MyList getInstance() { // static 메소드로 한번만생성. if (temp == null) { temp
	 * = new MyList(); } return temp; } // 싱글톤 구현 끝
	 */

	MyList() {
		init();
	}

	private void init() {
		list = new int[0];
	}

	void add(int num) {
		/*
		 * int[] arrTemp = new int[list.length + 1]; for (int i = 0; i < list.length;
		 * i++) { arrTemp[i] = list[i]; }
		 * 
		 * arrTemp[list.length] = num; list = arrTemp;
		 */
		add(list.length, num);
	}

	void add(int index, int num) {
		int[] arrTemp = new int[list.length + 1];
		/*
		for (int i = 0; i < list.length; i++) {
			if (i < index) {
				arrTemp[i] = list[i];
			} else {
				arrTemp[i + 1] = list[i];
			}
		}*/
		
		
		if (list.length != 0) {
			for (int i = 0; i < arrTemp.length; i++) {
				arrTemp[i] = i < index ? list[i] : list[i - 1];
			}
		}
	
		
		arrTemp[index] = num;
		list = arrTemp;
	}

	void printToString() {
		System.out.print("[");
		for (int i = 0; i < list.length; i++) {
			System.out.printf(i > 0 ? ",%d" : "%d", list[i]);
		}
		System.out.println("]");
	}

	int remove(int index) {
		int[] arrTemp = new int[list.length - 1];
		for (int i = 0; i < arrTemp.length; i++) {
			arrTemp[i] = (i >= index) ? list[i + 1] : list[i];
		}
		int delVal = list[index];
		list = arrTemp;
		return delVal;
	}

	int remove() {
		return remove(list.length - 1);
	}

	int size() {
		return list.length;
	}

	int get(int index) {
		return list[index];
	}

	void clear() {
		init();
	}
}