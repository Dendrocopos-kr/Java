package kr.co.dendrocopos.first.level3;

import java.util.ArrayList;

public class List2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(10);
		
		list.add(55,11);
		
		list.remove(list.size()-1);
		list.remove(list.size()-1);
		
		int val = list.get(2);
		
		System.out.println(val);
		/*
		for(int i = 0 ; i < list.size(); i++) {
			int val = (int)list.get(i);
			System.out.printf("%d ",val);
		}
		*/
		
		System.out.println(list.toString());
		
	}
}
