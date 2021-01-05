package iches.science.chapter07;

public class Product {
	String name;
	int price;
	int disconut;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Product(String name, int price, int disconut) {
		super();
		this.name = name;
		this.price = price;
		this.disconut = disconut;
	}
	
	void printProductInfo() {
		System.out.println("=====" + this.name + "=====" );
		System.out.println("���� : " + this.price + " ��");
		if (this.disconut == 0) {
			System.out.println("������ : �������� ����");
		} else {
			System.out.println("������ : " + this.disconut + "%");
			
		}
	}
	
	
}
