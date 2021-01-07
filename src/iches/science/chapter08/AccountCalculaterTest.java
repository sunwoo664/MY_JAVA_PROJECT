package iches.science.chapter08;

public class AccountCalculaterTest {

	public static void main(String[] args) {
		Account[] acc = new Account[5];
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account("111-2222-5551" + (i + 1), (i + 1) * 10000, 4.5);
		}
		for(int i = 0; i < acc.length; i++) {
			acc[i].printAccountInfo();
		}
		System.out.println();
		System.out.println("이율을 번경합니다.");
		System.out.println();
		
		for(int i = 0; i < acc.length; i++) {
			acc[i].setInterstRate(3.7);
			acc[i].printAccountInfo();
			
		}
	}
		

}
