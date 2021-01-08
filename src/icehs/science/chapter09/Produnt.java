package icehs.science.chapter09;

public class Produnt {
		private String name;
		private int price;
		private int disountRate;
		public int calcualateDiscountPrice;
		
		public Produnt(String name, int price, int disountRate) {
			super();
			this.name = name;
			this.price = price;
			this.disountRate = disountRate;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getDisountRate() {
			return disountRate;
		}

		public void setDisountRate(int disountRate) {
			this.disountRate = disountRate;
		}
		
		public int calcualateDiscountPrice() {
			int result = this.price * (100 - this.disountRate) / 100;
			return result;
		}
		public void printProduntInfo() {
			System.out.println("=======제품 정보=======");
			System.out.println("제품명 : " + this.name);
			System.out.println("정가 : " + this.price + "(할인율" + this.disountRate + "%)");
			System.out.println("판매가 : " + calcualateDiscountPrice + "원");			
		}		
}
