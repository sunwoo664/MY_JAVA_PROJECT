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
		 System.out.println("학생 성명 : " + name);
		 System.out.println("학번 : " + studentNumber);
		 System.out.println("국어 성적 : " + koreaPoint);
		 System.out.println("영어 성적 : " + englishPoint);
		 System.out.println("수학 성적 : " + mathPoint);
	 }
	 void changeStudnetNumber(String newStudentNumber) {
		 studentNumber = newStudentNumber;
	 }
}
