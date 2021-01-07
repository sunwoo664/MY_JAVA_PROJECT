package iches.science.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		int oddSum = 0; //홀수index 수의 합
		int evenSum = 0; //짝수index 수의 합
		int[] number = {12, 53, 24, 10, 22, 38, 64, 39};
		
		for(int i = 0; i < number.length; i++) {
			if(i / 2 == 0 ) {
				evenSum += number[i];
			} else {
				oddSum += number[i];
			}
		}
		System.out.println("홀수 Index 정수들의 합 : " + oddSum);
		System.out.println("짝수 Index 정수들의 합 : " + evenSum);
	}

}
