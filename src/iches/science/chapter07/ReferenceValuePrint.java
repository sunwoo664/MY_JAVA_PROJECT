package iches.science.chapter07;

public class ReferenceValuePrint {

	public static void main(String[] args) {
		Publication pub1 = new Publication("��ȭ �ﱹ��", 5000, 30);
		System.out.println(pub1.numberOfObjects);
		
		Publication pub2 = new Publication();
		System.out.println(pub2.numberOfObjects);
		System.out.println(pub1.numberOfObjects);
		System.out.println(Publication.numberOfObjects);
		
		int value = 10;
		System.out.println("Pub1 ��ü ���� �ּҰ�");
		System.out.println(pub1);
		
		System.out.println("Pub2 ��ü ���� �ּҰ�");
		System.out.println(pub2);
		
		System.out.println("int ���� ���尪 : " + value);

	}

}
