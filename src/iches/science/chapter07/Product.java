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
		System.out.println("정가 : " + this.price + " 원");
		if (this.disconut == 0) {
			System.out.println("할인율 : 할인하지 않음");
		} else {
			System.out.println("할인율 : " + this.disconut + "%");
			
		}
	}
	
	
}
