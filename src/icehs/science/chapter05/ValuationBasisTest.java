package icehs.science.chapter05;

public class ValuationBasisTest {

	public static void main(String[] args) {
		int  first = 10;
		int second = 20;
		int three = 40;
		int four = 60;
		int fift = 80;
		
		double result = 0;
		result = first * second / 2 * 0.6;
		result = result + (three + four) / 2 * 0.13;
		result = result + fift * 0.27;
		
		
		System.out.println("평가 점수 : " + result);
		
		if(result >= 95) {
			System.out.println("Special Class");
		} else if(result >= 85 && result < 95) {
			System.out.println("Gold Class");
		} else if(result >= 75 && result < 85) {
			System.out.println("Silver Class");
		} else if(result > 65 && result < 75) {
			System.out.println("Bronze Class");
	} else if(result >=0 && result <65) {
		System.out.println("Member");
	} else {
		System.out.println("NO");
	}
	} 
}
