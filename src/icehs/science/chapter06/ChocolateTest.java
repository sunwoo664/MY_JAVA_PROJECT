package icehs.science.chapter06;

public class ChocolateTest {
public static void main(String[] args) {
	Chocolate cho = new Chocolate();
	
	cho.name = "�Ƹ�����";
	cho.type = "��ũ";
	cho.price = 2200;
	cho.printChocolateInfo();
	
	String chocolate = cho.getName();
	int totalPirce = cho.calculateTotalPrice(20);
	
	System.out.println(chocolate + " ���ݷ� 20�� : " + totalPirce);
	cho.changeChocolateInfo("ī�� Ŀ����" , 2500);
}
}
