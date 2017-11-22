package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//main 메소드 안에서 선언 되었으므로, main 메소드 안에서만 사용 가능
		int[] nums= {10,20,30,40,50};
		
		for (int i=0; i<nums.length; i++) {
			//블럭 안에서 선언한 변수는 블럭 안에서만 사용 가능
			int tmp= nums[i];	//tmp 는 임시변수 (i 바뀔 때 생겼다가 println 하고나면 사라짐)
			//nums 배열이 int 배열이므로 tmp 의 데이터 type 은 int
			System.out.println(tmp);
		}
		
		System.out.println("----same----");
		
		// <=>
		// 위의 for 문을 간략하게 쓸 수 있는 "확장 for 문"
		for(int tmp:nums) {	//nums 배열의 size(length) 만큼 반복문 돌아)
				//배열의 데이터 type 에 따라 tmp 의 데이터 type 결정돼
			System.out.println(tmp);
		}
	}
}
