package icehs.science.chapter06;

public class Account {
	String name;
	String accNumber;
	int balance;
	
	void deposit(int money) {
		System.out.println(money + "���� �ӱ��մϴ�.");
		if(money < 0) {
			System.out.println("[����] �ݾ��� �Է��� �� �����ϴ�.");
		} else {
		balance += money;	//balance = balance + money;
		}
	}
		
	int withdraw(int money) {
		System.out.println(money + "���� ����մϴ�.");
		if (money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");	
			return 0;
		} else if (balance < money) {
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		} else {
			balance -= money;	//balance = balance - money; 
			return money;
		}
	}
	void printAccountINfo() {
		System.out.println("���� : " + accNumber + "(������ : " + name + ")");
		System.out.println("�ܾ� : " + balance + "��");
	}
	
}
