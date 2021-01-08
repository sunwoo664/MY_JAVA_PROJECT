package icehs.science.chapter09;

public class ProduntTest {

	public static void main(String[] args) {
		Produnt tong = new Produnt("통돌이", 450000, 8);
		tong.printProduntInfo();
		System.out.println("----------------------");
		
		Television tv = new Television("시네마TV", 35000000, 10, "화면크기 151cm");
		tv.printProduntInfo();
		System.out.println("비고 : " +tv.getDescription());
		
		System.out.println("[공지] 할인율을 모두 15% 로 변경합니다.");
		tong.setDisountRate(15);
		tv.setDisountRate(0);

		System.out.println("통돌이 판매가 : " + tong.calcualateDiscountPrice);
		System.out.println("시네마 TV 판매가 : " + tv.calcualateDiscountPrice);
	}

}
