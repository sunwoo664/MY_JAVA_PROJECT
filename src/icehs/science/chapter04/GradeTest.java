package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		 int score = 75;
		 
		 boolean result1 = (score >= 90 && score <= 100);
		 boolean result2 = (score >= 80 && score < 90);
		 boolean result3 = (score >= 70 && score < 80);
		 boolean result4 = (score >= 60 && score < 70);
		 
		 System.out.println("A���� : " + result1);
		 System.out.println("B���� :" + result2);
		 System.out.println("C���� : " + result3);
		 System.out.println("D���� : "  +result4);
	}

}
