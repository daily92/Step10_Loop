package test.main;

import test.mypac.Pen;

public class MainClass06 {
	public static void main(String[] args) {
		// Pen 객체를 생성해서 write() 메소드를 호출해 보세요.
		Pen a= new Pen("pink");
		a.write().write().write();
	
		Pen p2= new Pen("blue");
		p2.write().draw().write();
		
			//이렇게 메소드의 return 값이 this(자기 자신) 일 경우, 
			//MainClass06 에서처럼 메인메소드에서 연쇄 작용 가능
			//같은 클래스의 다른 메소드(draw) 도 호출 가능
	}
}
