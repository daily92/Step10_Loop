package test.main;

import test.mypac.Pen;

public class MainClass06 {
	public static void main(String[] args) {
		// Pen ��ü�� �����ؼ� write() �޼ҵ带 ȣ���� ������.
		Pen a= new Pen("pink");
		a.write().write().write();
	
		Pen p2= new Pen("blue");
		p2.write().draw().write();
		
			//�̷��� �޼ҵ��� return ���� this(�ڱ� �ڽ�) �� ���, 
			//MainClass06 ����ó�� ���θ޼ҵ忡�� ���� �ۿ� ����
			//���� Ŭ������ �ٸ� �޼ҵ�(draw) �� ȣ�� ����
	}
}
