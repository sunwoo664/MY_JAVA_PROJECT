package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySal = 10000000;
		int yearlySal = monthlySal * 12;
		int bonus = monthlySal * 2 / 10;
		int yearBonus = bonus * 4;
		int yearlSalAfterTax = yearlySal - yearlySal / 10;
		int yearlyBonusAfterTax = yearBonus - yearBonus * 55 / 1000;
		int yearIncome = yearlSalAfterTax + yearlyBonusAfterTax;
		
		System.out.println("���� : " + yearlySal + ", ���� ���� : " + yearlSalAfterTax);
		System.out.println("���ʽ� : " + yearBonus + ", ���� ���ʽ� : " + yearlyBonusAfterTax);
		System.out.println("���޾� : " + yearIncome);
	
	}
	

}
