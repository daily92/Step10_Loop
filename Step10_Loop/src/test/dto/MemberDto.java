package test.dto;
/*
 *  Data Transfer Object 의 약자 : Dto
 */
public class MemberDto {
	// 멤버 필드 정의하기
		//접근지정자 private :
		//웹이나 다른 패키지에서 접근 불가. 클래스 내에서만 사용가능. 
	private int num;
	private String name;
	private String addr;
	// 디폴트 생성자
	public MemberDto() {}
	
	// 생성자의 인자로 필드에 저장할 값을 전달 받는 생성자
		//커서 아랫줄에 두고 마우스 우클릭 > source 
		//> generate Constructor using Fields
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	// 필드에 접근 메소드 만들기 (setter, getter 메소드)
			//접근 메소드 만드는 이유? field 를 private 로 했기 때문에 . 으로 접근 불가
			//=> set, get 으로 접근 해야 함
			//커서 아랫줄에 두고 마우스 우클릭 > source
			//>generate getters and setters, select all
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	/*
	*	// 생성자의 인자로 필드에 저장할 값을 전달 받는 생성자
	*	public MemberDto(int num, String name, String addr) {
	*		this.num= num;
	*		this.name= name;
	*		this.addr= addr;
	*	}
	*	// 필드에 접근 메소드 만들기 (setter, getter 메소드)
	*		//접근 메소드 만드는 이유? field 를 private 로 했기 때문에 . 으로 접근 불가
	*		//=> set, get 으로 접근 해야 함
	*		//set+필드명 첫 글자 + ctrl + space => 
	*		//name 의 경우, setn + ctrl + space
	*	public void setName(String name) {
	*		this.name = name;
	*	}
	*	public String getName() {
	*		return name;
	*	}
	*	public void setAddr(String addr) {
	*		this.addr = addr;
	*	}
	*	public String getAddr() {
	*		return addr;
	*	}
	*/	
}
