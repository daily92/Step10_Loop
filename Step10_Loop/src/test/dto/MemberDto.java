package test.dto;
/*
 *  Data Transfer Object �� ���� : Dto
 */
public class MemberDto {
	// ��� �ʵ� �����ϱ�
		//���������� private :
		//���̳� �ٸ� ��Ű������ ���� �Ұ�. Ŭ���� �������� ��밡��. 
	private int num;
	private String name;
	private String addr;
	// ����Ʈ ������
	public MemberDto() {}
	
	// �������� ���ڷ� �ʵ忡 ������ ���� ���� �޴� ������
		//Ŀ�� �Ʒ��ٿ� �ΰ� ���콺 ��Ŭ�� > source 
		//> generate Constructor using Fields
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	// �ʵ忡 ���� �޼ҵ� ����� (setter, getter �޼ҵ�)
			//���� �޼ҵ� ����� ����? field �� private �� �߱� ������ . ���� ���� �Ұ�
			//=> set, get ���� ���� �ؾ� ��
			//Ŀ�� �Ʒ��ٿ� �ΰ� ���콺 ��Ŭ�� > source
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
	*	// �������� ���ڷ� �ʵ忡 ������ ���� ���� �޴� ������
	*	public MemberDto(int num, String name, String addr) {
	*		this.num= num;
	*		this.name= name;
	*		this.addr= addr;
	*	}
	*	// �ʵ忡 ���� �޼ҵ� ����� (setter, getter �޼ҵ�)
	*		//���� �޼ҵ� ����� ����? field �� private �� �߱� ������ . ���� ���� �Ұ�
	*		//=> set, get ���� ���� �ؾ� ��
	*		//set+�ʵ�� ù ���� + ctrl + space => 
	*		//name �� ���, setn + ctrl + space
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
