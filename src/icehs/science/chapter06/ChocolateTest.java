package icehs.science.chapter06;

public class ChocolateTest {
public static void main(String[] args) {
	Chocolate cho = new Chocolate();
	
	cho.name = "아마도라";
	cho.type = "다크";
	cho.price = 2200;
	cho.printChocolateInfo();
	
	String chocolate = cho.getName();
	int totalPrice = cho.calculateTotalPrice(20);
	
	System.out.println(chocolate + " 초콜렛 20개 : " + totalPrice + "원");
	cho.changeChocolateInfo("카페 커리쉬" , 2500);
	totalPrice = cho.calculateTotalPrice(15 , 10);
	System.out.println(chocolate + " 초콜렛 15개 (10%할인) : " + totalPrice + "원");
	cho.changeChocolateInfo("트리플 블랑", 2300 , "화이트");
	}
}
