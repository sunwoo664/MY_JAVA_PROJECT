package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student gilldong = new Student();
		
		gilldong.name = "홍길동";
		gilldong.studentNumber = "S001";
		gilldong.koreaPoint = 94;
		gilldong.englishPoint = 80;
		gilldong.mathPoint = 89;
		
		/*
		 * System.out.println("이름 : " + gilldong.name); System.out.println("학번 : " +
		 * gilldong.studentNumber); System.out.println("국어 성적 : " +
		 * gilldong.koreaPoint); System.out.println("영어 성적 : " + gilldong.englishPoint);
		 * System.out.println("수학 성적 : " + gilldong.mathPoint);
		 */
		gilldong.printStudentInfo();
		System.out.println("평균 : " + gilldong.calcAverage());
		
		System.out.println("* 학번을 변경합니다!!!");
		
		gilldong.changeStudnetNumber("STU0001");	
		
		gilldong.printStudentInfo();

	}

}
