package iches.science.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int oddSum = 0; //Ȧ��index ���� ��
		int evenSum = 0; //¦��index ���� ��
		int[] number = {12, 53, 24, 10, 22, 38, 64, 39};
		
		for(int i = 0; i < number.length; i++) {
			if(i / 2 == 0 ) {
				evenSum += number[i];
			} else {
				oddSum += number[i];
			}
		}
		System.out.println("Ȧ�� Index �������� �� : " + oddSum);
		System.out.println("¦�� Index �������� �� : " + evenSum);
	}

}
