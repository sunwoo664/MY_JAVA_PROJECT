package iches.science.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook it01 = new ItBook("SQL Plus", 50000, 5.5);
		it01.printItBookInfo();
		ItBook it02 = new ItBook("Java2.0", 28000, 3.2);
		it02.printItBookInfo();
		ItBook it03 = new ItBook("JSP Servlet", 37000, 6.9);
		it03.printItBookInfo();
		
		System.out.println();
		System.out.println("SQL Puls 정가와 할인율을 변경합니다.");
		it01.setPrice(55000);
		it01.setDisountRate(9.5);
		it01.printItBookInfo();
		
		System.out.println();
		System.out.println("Java2.0 정가를 변경합니다.");
		it02.setPrice(33000);
		it02.printItBookInfo();
		
		System.out.println();
		System.out.println("JSP Servlet 제목과 할인율을 변경합니다.");
		it03.setTitle("Servlet & JSP");
		it03.setDisountRate(12.6);
		it03.printItBookInfo();
		

	}

}
