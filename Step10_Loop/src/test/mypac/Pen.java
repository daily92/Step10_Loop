package test.mypac;

public class Pen {
	// 멤버 필드
	public String color;
	// 생성자
	public Pen(String color) {
		this.color= color;
		// this -> heap 영역에서 자기 자신의 참조값을 가리키는 예약어
		// 동일한 지역변수 color 가 있으므로 this. 생략 못함
	}
	// 멤버 메소드
		//이렇게 메소드의 return 값이 this(자기 자신) 일 경우, 
		//MainClass06 에서처럼 메인메소드에서 연쇄 작용 가능
		//같은 클래스의 다른 메소드(draw) 도 호출 가능
	public Pen write() {
		System.out.println(this.color + " 색 Pen 으로 필기를 해요");
		Pen a= this;
		return a;
	}
	public Pen draw() {
		System.out.println(color + " 색 Pen 으로 그림을 그려요");
		return this;
	}
}
