package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//main �޼ҵ� �ȿ��� ���� �Ǿ����Ƿ�, main �޼ҵ� �ȿ����� ��� ����
		int[] nums= {10,20,30,40,50};
		
		for (int i=0; i<nums.length; i++) {
			//�� �ȿ��� ������ ������ �� �ȿ����� ��� ����
			int tmp= nums[i];	//tmp �� �ӽú��� (i �ٲ� �� ����ٰ� println �ϰ��� �����)
			//nums �迭�� int �迭�̹Ƿ� tmp �� ������ type �� int
			System.out.println(tmp);
		}
		
		System.out.println("----same----");
		
		// <=>
		// ���� for ���� �����ϰ� �� �� �ִ� "Ȯ�� for ��"
		for(int tmp:nums) {	//nums �迭�� size(length) ��ŭ �ݺ��� ����)
				//�迭�� ������ type �� ���� tmp �� ������ type ������
			System.out.println(tmp);
		}
	}
}
