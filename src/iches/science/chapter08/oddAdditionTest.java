package iches.science.chapter08;

public class oddAdditionTest {

	public static void main(String[] args) {
		int[] number = {10, 21, 33, 42, 51, 79, 80};
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			if(number[i]  % 2 ==1) {
				sum += number[i];
				System.out.println(number[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Ȧ������ �հ��" + sum + "�Դϴ�.");
	}

}
