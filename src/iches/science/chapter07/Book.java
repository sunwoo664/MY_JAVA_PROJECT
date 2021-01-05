package iches.science.chapter07;

public class Book {
	
	private String title;
	private int price;
	private String auothor;
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPirce(int price) {
		this.price = price;
	}
	
	public String getAuothor() {
		return this.auothor; 
	}
	
	public void setAuothor(String auothor) {
		this.auothor = auothor;
	}
	
	public Book() {
		
	}
	
	public Book(String title) {
		this.title  = title;
	}
	
	public Book(String title, int price) {
		this(title);
		this.price = price;
	}
	
	public Book(String title, String auothor, int price) {
		this(title, price);
		this.auothor = auothor;
		this.price = price;
	}
	
	void printBookInfo() {
		System.out.println("========" + this.title + "========");
		System.out.println(this.price + "¿ø");
		System.out.println(this.auothor);
		
		
	}
}
