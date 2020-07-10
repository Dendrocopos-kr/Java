package kr.co.dendrocopos.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> menu;
	
	Menu(){
		init();
	}
	
	private void init() {
		menu = new ArrayList<MenuItem>();
		menuAdd("아메리카노",1500);
		menuAdd("카푸치노",2000);
		menuAdd("마키아또",2500);
		menuAdd("에스프레소",2500);		
	}
	
	public void menuAdd(String name, int price) {
		MenuItem e = new MenuItem(name,price);
		menu.add(e);
	}
	
	public void menuEdit(String name, int price) {
		
	}
	
	public MenuItem choose(int index) {
		try {
			return menu.get(index);
		}catch (Exception e) {
			return null;
		}
	}
	
	public void showMenus() {
		String str ="";
		str += String.format("    %-7s%10s\n","MENU","가격");
		//str+="MENU";
		for(int i = 0 ; i < menu.size(); i++) {
			str+= String.format("%d. ", i+1);
			str+= menu.get(i);
			str+= "\n";
		}
		System.out.println(str);
	}
	
	public int size() {
		return menu.size();
	}
}
