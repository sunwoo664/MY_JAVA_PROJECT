package icehs.science.chapter10;

public class MoblieTest {

	public static void main(String[] args) {
		Moblie[] m = {new Galaxy(), new IPhone()};
		
		((Galaxy)m[0]).setOsVersion("안드로이드 오레오");
		m[0].call(5);
		m[0].charge(30);
		
		((IPhone)m[1]).setColor("흰색");
		m[1].call(10);
		m[1].charge(15);
		
		

	}

}
