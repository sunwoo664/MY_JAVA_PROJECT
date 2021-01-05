package icehs.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice(int count) {
		return count * price; 
	}
	
	int calculateTotalPrice(int count, int discount) {
		return count * price * (100 - discount) / 100;
	}
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	void changeChocolateInfo(String newName, int newPrice, String NewType) {
		name = newName;
		price = newPrice;
		type = NewType;
		printChocolateInfo();		
		
	}
	void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " + type + ", 가격 : " + price +"원");
	}
}
