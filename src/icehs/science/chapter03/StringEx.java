package icehs.science.chapter03;

public class StringEx {

	public static void main(String[] args) {
		String name = "������";
		String school = "����õ����б�";
		String fullName = name + school;
		String strYear = "2020";
		String ndYear = 1 + strYear;
		int nextYear = Integer.parseInt(strYear) + 1;
		//Integer.parseInt�� ����ؼ� ������"2020"���ڷ� ����
		
		System.out.println("���� : " + name);
		System.out.println("�Ҽ��б��� : " + school);
		System.out.println("��ü�̸� : " + fullName);
		System.out.println("���� : " + strYear);
		System.out.println("���� : " + nextYear);
		System.out.println("�̻��� ���� : " + ndYear);
		
		

		
	}

}
