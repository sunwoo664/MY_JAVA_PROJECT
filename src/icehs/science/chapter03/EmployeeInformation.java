package icehs.science.chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = "정선우";
		int year = 2002;
		int stryear = 2020;
		
		int term = stryear - year;
		
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + year);
		System.out.println("근무년도 : " + (stryear - year));
		System.out.println("근무년도 : " + term);
	}

}
