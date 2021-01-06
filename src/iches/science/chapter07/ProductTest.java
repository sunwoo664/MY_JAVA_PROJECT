package iches.science.chapter07;

public class ProductTest {

	public static void main(String[] args) {
		Product product01 = new Product("Ä¿ÇÇ¹Í½º", 12000 , 20);
		product01.printProductInfo();
		
		Product product02 = new Product("Á¾ÀÌÄÅ", 3000);
		product02.printProductInfo();
	}
}
