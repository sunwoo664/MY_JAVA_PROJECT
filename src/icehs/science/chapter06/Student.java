package icehs.science.chapter06;

public class Student {
	String name;
	String studentNumber;
	int koreaPoint;
	int englishPoint;
	int mathPoint;
	
	 int calcAverage() {
		int result = (koreaPoint + englishPoint + mathPoint) / 3;
		return result;
	}
	 void printStudentInfo() {
		 System.out.println("�л� ���� : " + name);
		 System.out.println("�й� : " + studentNumber);
		 System.out.println("���� ���� : " + koreaPoint);
		 System.out.println("���� ���� : " + englishPoint);
		 System.out.println("���� ���� : " + mathPoint);
	 }
	 void changeStudnetNumber(String newStudentNumber) {
		 studentNumber = newStudentNumber;
	 }
}
