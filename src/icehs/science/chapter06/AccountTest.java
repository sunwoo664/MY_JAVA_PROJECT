package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.name = "ȫ�浿";
		acc.accNumber = "123-123456";
		acc.balance = 10000;
		
		acc.printAccountINfo();
		
		acc.deposit(20000);
		System.out.println("�ܾ� : " + acc.balance + "��");
		acc.deposit(-20000);
		acc.withdraw(-20000);
		acc.withdraw(45000);
		System.out.println("�ܾ� : " + acc.balance + "��");
		/*
		 * ������ github�̸��� 
		 * github.com/bkuk1969
		 */
	}

}
