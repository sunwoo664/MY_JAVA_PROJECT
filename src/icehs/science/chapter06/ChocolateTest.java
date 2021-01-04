package icehs.science.chapter06;

public class ChocolateTest {
public static void main(String[] args) {
	Chocolate cho = new Chocolate();
	
	cho.name = "아마도라";
	cho.type = "다크";
	cho.price = 2200;
	cho.printChocolateInfo();
	
	String chocolate = cho.getName();
	int totalPirce = cho.calculateTotalPrice(20);
	
	System.out.println(chocolate + " 초콜렛 20개 : " + totalPirce);
	cho.changeChocolateInfo("카페 커리쉬" , 2500);
}
}
