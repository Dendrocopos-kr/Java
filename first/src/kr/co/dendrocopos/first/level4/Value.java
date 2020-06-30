package kr.co.dendrocopos.first.level4;

public class Value {
	private int val;

	public Value(int val) { this.val = val; }
	public int getVal() {return val;}
	
	@Override
	public boolean equals(Object obj) {
		Value t = (Value)obj;
		//return val == t.val; // 같은 Class로 비교하기에 private 라도 접근가능
		return val == t.getVal();
	}
	
	@Override
	public String toString() {
		//return String.valueOf(val);
		return String.format("%,d", val); // 추천
	}
}

/*
 object class는 모든 형태로 변환이 가능한가?
 간단한 메소드들도 object로 만들면 모두 호환이 가능한가?
*/