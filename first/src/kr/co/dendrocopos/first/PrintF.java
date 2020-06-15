package kr.co.dendrocopos.first;

public class PrintF {
	public static void main(String[] args) {
		int age = 30;
		String name = "석상원";
		float vision = 0.1f;
		char bloodType = 'A';
		
		System.out.println("나의이름은 " + name + "입니다. 나의 나이는 " + age + "입니다. 나의 시력은 " + vision + "입니다. 나의 혈액형은 " + bloodType + "입니다");
		System.out.printf("나의이름은 %s입니다. 나의 나이는 %d입니다. 나의 시력은 %.1f입니다. 나의 혈액형은 %c입니다.\n", name, age, vision, bloodType);
		
		char v1 = 'A';
		System.out.printf("%c : %d\n", v1, (int)v1);
		
		int v2 = 66;
		System.out.printf("%d : %c\n", v2, (char)v2);
		
	}
}
