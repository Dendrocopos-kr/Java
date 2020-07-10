package kr.co.dendrocopos.second.cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu menu) {
		Scanner sc = new Scanner(System.in);

		menu.showMenus();
		MenuItem mi = orderSelect(menu, sc);

		sc.close();
		return mi;
	}

	public MenuItem order2(Menu menu) {
		menu.showMenus();
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		while (mi == null) {
			try {
				System.out.println("메뉴 번호를 입력하세요.");
				String menuNo = scan.nextLine();
				int intMenuNo = Integer.parseInt(menuNo);
				mi = menu.choose(intMenuNo - 1);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
			} catch (Exception e) {
				System.out.println("매뉴를 잘못 선택하셨습니다.");

			}
		}
		scan.close();
		return mi;
	}

	private MenuItem orderSelect(Menu menu, Scanner sc) {
		// System.out.print("메뉴번호를 입력하세요. 종료(0)");
		System.out.print("메뉴번호를 입력하세요.");
		String strOrder = sc.nextLine();
//		if (strOrder.equals("0")) {
//			return new MenuItem("",0);
//		} else {
		try {
			int orderNumber = Integer.parseInt(strOrder);
			if (menu.size() < orderNumber || orderNumber < 0) {
				System.out.println("없는 메뉴입니다.");
				System.out.printf("1~%d에서 선택해주세요\n", menu.size());
				return orderSelect(menu, sc);
			}
			return menu.choose(orderNumber - 1);
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주세요.");
			System.out.printf("1~%d에서 선택해주세요\n", menu.size());
			return orderSelect(menu, sc);
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.printf("1~%d에서 선택해주세요\n", menu.size());
			return orderSelect(menu, sc);
		}
//		}
	}

	public void drinkCoffee(Coffee coffee) {
		System.out.println(coffee.getName() + "를(을) 마신다");
		System.out.printf("%,d원 지불했다!", coffee.getPrice());

	}
}
