package test.mypac;

public class Pen {
	// ��� �ʵ�
	public String color;
	// ������
	public Pen(String color) {
		this.color= color;
		// this -> heap �������� �ڱ� �ڽ��� �������� ����Ű�� �����
		// ������ �������� color �� �����Ƿ� this. ���� ����
	}
	// ��� �޼ҵ�
		//�̷��� �޼ҵ��� return ���� this(�ڱ� �ڽ�) �� ���, 
		//MainClass06 ����ó�� ���θ޼ҵ忡�� ���� �ۿ� ����
		//���� Ŭ������ �ٸ� �޼ҵ�(draw) �� ȣ�� ����
	public Pen write() {
		System.out.println(this.color + " �� Pen ���� �ʱ⸦ �ؿ�");
		Pen a= this;
		return a;
	}
	public Pen draw() {
		System.out.println(color + " �� Pen ���� �׸��� �׷���");
		return this;
	}
}
