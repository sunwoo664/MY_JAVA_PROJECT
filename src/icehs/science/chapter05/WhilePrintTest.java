package icehs.science.chapter05;

public class WhilePrintTest {

	public static void main(String[] args) {
		int index = 1;
		
		while(index <=10) {
			System.out.println(index++ + ". while실습입니다.");
			//index++; //index += 1;
		}
		for(int i = 1; i <=10; i++) {
			System.out.println(i + ". for실습입니다.");
		}

	}

}
