package kr.co.dendrocopos.first.level3;

public class MyListTest {
	public static void main(String[] args) {
		// MyList list2 = new MyList();

		// MyList list = MyList.getInstance(); // 싱글톤 생성
		MyList list = new MyList();
		list.add(10);
		list.add(15);
		list.add(20);

		int[] a = { 40,50,80 };

		list.add(1, 1200);
		// list.remove(3);
		// list.remove();
		// list.clear();

		// list.remove();

		list.addAll(3, a);

		MyArrays.print(list);

		String str = MyArrays.toString(list);
		System.out.println(str);

	}
}

class MyArrays {
	static void print(MyList list) {
		/*
		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			System.out.printf(i > 0 ? ", %d" : "%d", list.get(i));
		}
		System.out.println("]");
		*/
		
		System.out.println(toString(list));
	}

	static String toString(MyList list) {
		
		/*
		String str;
		str = "[";
		for(int i = 0 ; i < list.size(); i++) {
			str += ( i > 0 ? ", "+list.get(i) : list.get(i)); 
		}
		str += "]";
		return str;
		*/
		
		String str = "";
		for(int i = 0 ; i < list.size(); i++ ) {
			str += (i > 0) ? ", "+list.get(i) : list.get(i);
		}
		return String.format("[%s]", str);
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
		add(list.length, num);
	}

	void add(int index, int num) {
		int[] arrTemp = new int[list.length + 1];

		for (int i = 0; i < list.length; i++) {
			arrTemp[(i < index) ? i : i + 1] = list[i];
		}

		arrTemp[index] = num;
		list = arrTemp;
	}

	void addAll(int index, int[] num) {
		int[] arrTemp = new int[list.length + num.length];
		int index2 = num.length + index;
		for (int i = 0; i < arrTemp.length; i++) {
			if (i < index) {
				arrTemp[i] = list[i];
			} else if (i >= index && i < index2) {
				arrTemp[i] = num[i - index];
			} else {
				arrTemp[i] = list[i - num.length];
			}
		}

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
			arrTemp[i] = list[i < index ? i : i + 1];
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