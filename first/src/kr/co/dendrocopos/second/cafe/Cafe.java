package kr.co.dendrocopos.second.cafe;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		/*
		 * MenuItem mi1 = new MenuItem("아멜이어카노",1500); MenuItem mi2 = new
		 * MenuItem("라뗀말이야",2500);
		 */
		/*
		 * MenuItem mi = MenuItem.getInstance(); // 싱글톤 구현 mi.setName("아멜이어카노");
		 * mi.setPrice(1500); System.out.println(mi);
		 */
		/*
		 * System.out.println(mi1); System.out.println(mi2);
		 */
		Menu menu = new Menu();
		menu.showMenus();
		MenuItem mi = menu.choose(Cafe.orderMenu(menu));
		System.out.println(mi);
	}

	public static int orderMenu(Menu menu) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하시는 메뉴번호를 입력하세요. 종료(0)");
		String sOrderNumber = sc.nextLine();
		if (sOrderNumber.equals("0")) {
			return -1;
		} else {
			try {
				int orderNumber = Integer.parseInt(sOrderNumber);
				if (menu.size() < orderNumber || orderNumber < 0) {
					System.out.println("없는 메뉴입니다.");
					return orderMenu(menu);
				}
				return orderNumber - 1;
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				return orderMenu(menu);
			} finally {
				sc.close();
			}
		}
	}
}
