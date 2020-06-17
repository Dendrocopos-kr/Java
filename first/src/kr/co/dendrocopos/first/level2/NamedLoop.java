package kr.co.dendrocopos.first.level2;

public class NamedLoop {
	public static void main(String[] args) {
		
		Parent:
		for( ; ; )
		{
			for( ; ; ) {
				break Parent;
				
			}
		}
	}
}
