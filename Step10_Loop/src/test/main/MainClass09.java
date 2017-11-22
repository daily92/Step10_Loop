package test.main;

import test.dto.MemberDto;
import test.mypac.Pen;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");

		/*
		 *  MemberDto ��ü�� ���� �� �ִ� �� 3 �� ¥�� �迭 ��ü�� �����ؼ�
		 *  3 ���� ȸ�� ������ ���� ������ ������.
		 *  (����)
		 *  1, ¯��, ���	
		 *  	//������ ������ Ÿ�Ժ��� ����! int String String
		 *  	=> �� ��ü�� MemberDto ��ü�� ���� �ž�
		 *  	=> �� 3 ���� ���� �������� 3 ���� MemberDto �����(new),
		 *  	=> int, String, String type ���� �� �ִ� �ʵ� �������� (�̹� ����� ����)
		 *  2, �����, ���｣
		 *  3, ¯��, �Ｚ
		 *  
		 *  (���)
		 *  MemberDto type ��ü 3 �� ��������� (new MemberDto �� 3 ��)
		 *  �� ��ü�� �������� ������� ���� MemberDto[] �ʿ�
		 *  ���� 3 �� => MemberDto[3]
		 */
		
		// ȸ�������� ������ �迭 ��ü ����
		MemberDto[] members= new MemberDto[3];
		
		// MemberDto ��ü�� ������ ȸ������ �����ϱ�
		members[0]= new MemberDto();
		members[0].setNum(1);
		members[0].setName("¯��");
		members[0].setAddr("���");
		
		members[1]= new MemberDto(2, "�����", "���｣");
		
		MemberDto dto3= new MemberDto();
		dto3.setNum(3);
		dto3.setName("¯��");
		dto3.setAddr("�Ｚ");
		
		//�Ǵ�
		//MemberDto dto1= new MemberDto(1,"¯��","���");
		//members[0]= dto1;
		
		/*
		for(int i=0; i<pens.length; i++) {
			Pen tmp=pens[i];
			tmp.write();
			tmp.draw();
		}
		System.out.println("---Ȯ�� for ��---");
		for(Pen tmp:pens) {
			tmp.write().draw();
		}
		*/
		System.out.println("-----1���-----");
		for(int i=0; i<members.length; i++) {
			//System.out.println("----"+ (i+1) +"��° ���----");
			showInfo(members[i]);
		}
		
		System.out.println("-----2���-----");
		for(int i=0; i<members.length; i++) {
			//System.out.println("----"+ (i+1) +"��° ���----");
			MemberDto tmp= members[i];
			showInfo(tmp);
		}
		
		System.out.println("-----3���-----");
		for (MemberDto tmp:members) {
			//System.out.println("----"+ tmp.getNum() +"��° ���----");
			showInfo(tmp);	
		}
	}
	
	// static ��� �޼ҵ�
	public static void showInfo(MemberDto members) {
		//private �� �Ǿ� �־ 
		//System.out.println("��ȣ : " + dto.num()); �Ұ�!
		System.out.println("��ȣ : " + members.getNum());
		System.out.println("�̸� : " + members.getName());
		System.out.println("�ּ� : " + members.getAddr());
		System.out.println("--------------------");
	}
}
