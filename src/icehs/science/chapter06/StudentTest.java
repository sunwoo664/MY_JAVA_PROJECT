package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student gilldong = new Student();
		
		gilldong.name = "ȫ�浿";
		gilldong.studentNumber = "S001";
		gilldong.koreaPoint = 94;
		gilldong.englishPoint = 80;
		gilldong.mathPoint = 89;
		
		/*
		 * System.out.println("�̸� : " + gilldong.name); System.out.println("�й� : " +
		 * gilldong.studentNumber); System.out.println("���� ���� : " +
		 * gilldong.koreaPoint); System.out.println("���� ���� : " + gilldong.englishPoint);
		 * System.out.println("���� ���� : " + gilldong.mathPoint);
		 */
		gilldong.printStudentInfo();
		System.out.println("��� : " + gilldong.calcAverage());
		
		System.out.println("* �й��� �����մϴ�!!!");
		
		gilldong.changeStudnetNumber("STU0001");	
		
		gilldong.printStudentInfo();

	}

}
