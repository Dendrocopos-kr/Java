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
		Customer cus = new Customer();
		
		MenuItem mi = null;
		System.out.println(mi);
	}
}
