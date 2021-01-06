package iches.science.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double disountRate;
	public ItBook(String title, int price, double disountRate) {
		super();
		this.title = title;
		this.price = price;
		this.disountRate = disountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDisountRate() {
		return disountRate;
	}
	public void setDisountRate(double disountRate) {
		this.disountRate = disountRate;
	}
	
	void printItBookInfo() {
		System.out.println("제목 : " + this.title + ", 정가 : " + this.price + "원" + "할인율 : " + this.disountRate + "%, " + "할인가 : " + (int)(this.price * (100-this.disountRate) / 100) + "원");
	}
	
}
