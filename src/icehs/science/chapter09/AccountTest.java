package icehs.science.chapter09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount[] fundArr = new FundAccount[2];
			
		fundArr[0] = new FundAccount("111-222", "ȫ�浿", 5000000, 4.7);	
		fundArr[1] = new FundAccount("666-777", "ȫ���", 1000000, 2.9);
		
		for(int i = 0; i < fundArr.length; i++) {
			fundArr[i].openAccount();
		}
	}

}
