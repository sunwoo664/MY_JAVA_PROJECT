package icehs.science.chapter09;

public class ProduntTest {

	public static void main(String[] args) {
		Produnt tong = new Produnt("�뵹��", 450000, 8);
		tong.printProduntInfo();
		System.out.println("----------------------");
		
		Television tv = new Television("�ó׸�TV", 35000000, 10, "ȭ��ũ�� 151cm");
		tv.printProduntInfo();
		System.out.println("��� : " +tv.getDescription());
		
		System.out.println("[����] �������� ��� 15% �� �����մϴ�.");
		tong.setDisountRate(15);
		tv.setDisountRate(0);

		System.out.println("�뵹�� �ǸŰ� : " + tong.calcualateDiscountPrice);
		System.out.println("�ó׸� TV �ǸŰ� : " + tv.calcualateDiscountPrice);
	}

}
