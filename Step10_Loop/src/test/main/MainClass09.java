package test.main;

import test.dto.MemberDto;
import test.mypac.Pen;

public class MainClass09 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");

		/*
		 *  MemberDto 객체를 담을 수 있는 방 3 개 짜리 배열 객체를 생성해서
		 *  3 명의 회원 정보를 각각 저장해 보세요.
		 *  (과정)
		 *  1, 짱구, 잠실	
		 *  	//각각의 데이터 타입부터 생각! int String String
		 *  	=> 이 전체를 MemberDto 객체에 담을 거야
		 *  	=> 총 3 명의 정보 담으려면 3 개의 MemberDto 만들고(new),
		 *  	=> int, String, String type 담을 수 있는 필드 만들어놔야 (이미 만들어 놨음)
		 *  2, 흰둥이, 서울숲
		 *  3, 짱아, 삼성
		 *  
		 *  (결과)
		 *  MemberDto type 객체 3 개 만들어지고 (new MemberDto 총 3 번)
		 *  각 객체의 참조값을 순서대로 담을 MemberDto[] 필요
		 *  방은 3 개 => MemberDto[3]
		 */
		
		// 회원정보를 누적할 배열 객체 생성
		MemberDto[] members= new MemberDto[3];
		
		// MemberDto 객체에 각각의 회원정보 저장하기
		members[0]= new MemberDto();
		members[0].setNum(1);
		members[0].setName("짱구");
		members[0].setAddr("잠실");
		
		members[1]= new MemberDto(2, "흰둥이", "서울숲");
		
		MemberDto dto3= new MemberDto();
		dto3.setNum(3);
		dto3.setName("짱아");
		dto3.setAddr("삼성");
		
		//또는
		//MemberDto dto1= new MemberDto(1,"짱구","잠실");
		//members[0]= dto1;
		
		/*
		for(int i=0; i<pens.length; i++) {
			Pen tmp=pens[i];
			tmp.write();
			tmp.draw();
		}
		System.out.println("---확장 for 문---");
		for(Pen tmp:pens) {
			tmp.write().draw();
		}
		*/
		System.out.println("-----1답안-----");
		for(int i=0; i<members.length; i++) {
			//System.out.println("----"+ (i+1) +"번째 멤버----");
			showInfo(members[i]);
		}
		
		System.out.println("-----2답안-----");
		for(int i=0; i<members.length; i++) {
			//System.out.println("----"+ (i+1) +"번째 멤버----");
			MemberDto tmp= members[i];
			showInfo(tmp);
		}
		
		System.out.println("-----3답안-----");
		for (MemberDto tmp:members) {
			//System.out.println("----"+ tmp.getNum() +"번째 멤버----");
			showInfo(tmp);	
		}
	}
	
	// static 멤버 메소드
	public static void showInfo(MemberDto members) {
		//private 로 되어 있어서 
		//System.out.println("번호 : " + dto.num()); 불가!
		System.out.println("번호 : " + members.getNum());
		System.out.println("이름 : " + members.getName());
		System.out.println("주소 : " + members.getAddr());
		System.out.println("--------------------");
	}
}
