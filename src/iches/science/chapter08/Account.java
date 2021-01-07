package iches.science.chapter08;

public class Account {
	private String number;
	private int balance;
	private double interstRate;
	
	public Account(String number, int balance, double interstRate) {
		super();
		this.number = number;
		this.balance = balance;
		this.interstRate = interstRate;
	}
	
	
	
	public void setNumber(String number) {
		this.number = number;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public void setInterstRate(double interstRate) {
		this.interstRate = interstRate;
	}



	public String getNumber() {
		return number;
	}

	public int getBalance() {
		return balance;
	}

	public double getInterstRate() {
		return interstRate;
	}
	
	public int claculateInterest() {
		int result = (int)(this.balance * this.interstRate) / 100;
		balance += result;
		return result;
	}
	
	public void printAccountInfo() {
		System.out.println("°èÁÂ¹øÈ£ : " + this.number + " / ÀÜ¾× : " + this.balance + " / ÀÌÀ²" + this.interstRate );
	}
	
}
