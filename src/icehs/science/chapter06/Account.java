package icehs.science.chapter06;

public class Account {
	String name;
	String accNumber;
	int balance;
	
	void deposit(int money) {
		System.out.println(money + "원을 임금합니다.");
		if(money < 0) {
			System.out.println("[에러] 금액을 입력할 수 없습니다.");
		} else {
		balance += money;	//balance = balance + money;
		}
	}
		
	int withdraw(int money) {
		System.out.println(money + "원을 출급합니다.");
		if (money < 0) {
			System.out.println("[에러] 금액은 음수를 입력할 수 없습니다.");	
			return 0;
		} else if (balance < money) {
			System.out.println("잔액이 부족합니다.");
			return 0;
		} else {
			balance -= money;	//balance = balance - money; 
			return money;
		}
	}
	void printAccountINfo() {
		System.out.println("계좌 : " + accNumber + "(예금주 : " + name + ")");
		System.out.println("잔액 : " + balance + "원");
	}
	
}
