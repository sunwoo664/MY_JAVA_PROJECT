package iches.science.chapter08;



public class ChocolateArrayTest {
	public static void main(String[] args) {
		Chocolate[] cho = new Chocolate[3];
		cho[0] = new Chocolate("�Ƹ�����", "��ũ", 1200);
		cho[1] = new Chocolate("ī�� Ŀ����", "��ũ", 2500);
		cho[2] = new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
		cho[0].printChocolateInfo();
		cho[1].printChocolateInfo();
		cho[2].printChocolateInfo();
		for(int i = 0; i < cho.length; i++) {
			cho[i].printChocolateInfo();
		}
	}
}


