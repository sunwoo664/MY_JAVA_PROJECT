package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.name = "È«±æµ¿";
		acc.accNumber = "123-123456";
		acc.balance = 10000;
		
		acc.printAccountINfo();
		
		acc.deposit(20000);
		System.out.println("ÀÜ¾× : " + acc.balance + "¿ø");
		acc.deposit(-20000);
		acc.withdraw(-20000);
		acc.withdraw(45000);
		System.out.println("ÀÜ¾× : " + acc.balance + "¿ø");
		/*
		 * ¼±»ý´Ô githubÀÌ¸ÞÀÏ 
		 * github.com/bkuk1969
		 */
	}

}
