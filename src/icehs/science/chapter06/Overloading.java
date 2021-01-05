package icehs.science.chapter06;

public class Overloading {
	
		public void addition(int num1, int num2) {
			int result = num1 + num2;
			System.out.println (result);
		}
	
	public void addition(double num1, double num2) {
		double result = num1 + num2;
		System.out.println(result);
	}
	public void addition(String str1, String str2) {
		String result = str1 + str2;
		System.out.println( result );
	}
}	


