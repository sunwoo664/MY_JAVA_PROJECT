package icehs.science.chapter09;

public class Account {
	private String number;
	private String name;
	private int balance;
	
	public String getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account(String number, String name, int balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public void openAccount() {
		
		System.out.println("계좌 번호 : " + this.number);
		System.out.println("예금주 : " + this.name);
		System.out.println("잔액 : " + this.balance + "원");
	}
	
}
