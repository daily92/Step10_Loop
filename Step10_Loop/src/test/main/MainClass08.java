package test.main;

import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		MemberDto dto1= new MemberDto();
		
		// �޼ҵ带 �̿��ؼ� ȸ������ �����ϱ�
		dto1.setNum(1);
		dto1.setName("¯��");
		dto1.setAddr("���");
		
		MemberDto dto2= new MemberDto(2, "�����", "���｣");
		
		// static ��� �޼ҵ� ȣ���ϸ鼭 MemberDto ��ü�� ������ �����ϱ�
		MainClass08.showInfo(dto1);
		// ���� Ŭ���� �� �̹Ƿ� Ŭ������. ���� ����!
		showInfo(dto2);
	}
	
	// static ��� �޼ҵ�
	public static void showInfo(MemberDto dto) {
		//private �� �Ǿ� �־ 
		//System.out.println("��ȣ : " + dto.num()); �Ұ�!
		System.out.println("��ȣ : " + dto.getNum());
		System.out.println("�̸� : " + dto.getName());
		System.out.println("�ּ� : " + dto.getAddr());
		System.out.println("--------------------");
	}
}