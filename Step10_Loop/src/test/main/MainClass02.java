package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		int[] nums= {10,20,30,40,50};
		
		// nums 배열에 있는 모든 숫자를 순서대로 콘솔창에 출력 ~
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		String[] names= {"짱구", "흰둥이", "짱아"};
		// names 배열에 있는 모든 문자를 순서대로 콘솔창에 출력 ~
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
