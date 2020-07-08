package kr.co.dendrocopos.second.cafe;

public class MenuItem {
	
	//private static MenuItem temp; // 싱글톤 구현
	
	private String name;
	private int price;
	
	//private MenuItem() {} // 싱글톤 기본생성자 막기
	
	// 싱글톤 객체 생성
	/*
	static MenuItem getInstance() {
		if(temp == null) {
			temp = new MenuItem();
		}
		return temp;
	}
	*/
	
	MenuItem(String name, int price ){
		this.name = name;
		this.price = price;
	}
	
	//public void setPrice(int price) {this.price = price;}
	public int getPrice() { return price; }
	//public void setName(String name) {this.name = name;}
	public String getName() { return name; }
	@Override
	public String toString() {return String.format("%-8s\t%,6d원", name,price);}
}

