package kr.co.dendrocopos.second.Gugudan;

public class Utils {
	public static int parsStringToInt(String str, int resetData) {
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return resetData;
		}
	}

	public static int parsStringToInt(String str) {
		int resetData = 0;
		return parsStringToInt(str, resetData);
	}

	public static void printArr(int[] arr) {
		String str;
		if( arr == null) {
			str = "arr is null";
		}else {
			str = "[";
			for (int i = 0; i < arr.length; i++) {
				str += String.format(i > 0 ? ", %d" : "%d", arr[i]);
			}
			str += "]";
		}
		System.out.println(str);
	}

	public static void sortASC(int[] arr) {
		sort(arr, true);
	}

	public static void sortDESC(int[] arr) {
		sort(arr, false);
	}

	private static void sort(int[] arr, boolean asc) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((arr[i] < arr[j]) == asc) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static int[] createRandomArr(int start, int end, int count) {
		int[] temp = new int[count];
		for (int i = 0; i < count; i++) {
			temp[i] = (int) (Math.random() * (end - start +1 ) + start);
		}
		return temp;
	}

	public static int[] createRandomArrNoDuplication(int start, int end, int count) {
		
		if( (end-start+1) < count ) {
			return null;
		}
		int[] temp = new int[count];
		for (int i = 0; i < count; i++) {
			temp[i] = (int) (Math.random() * (end - start +1) + start);
			for (int j = 0; j < i; j++) {
				if (temp[i] == temp[j]) {
					i--;
					break;
				}
			}
		}
		return temp;		
	}
}
