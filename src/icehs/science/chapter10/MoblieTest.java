package icehs.science.chapter10;

public class MoblieTest {

	public static void main(String[] args) {
		Moblie[] m = {new Galaxy(), new IPhone()};
		
		((Galaxy)m[0]).setOsVersion("�ȵ���̵� ������");
		m[0].call(5);
		m[0].charge(30);
		
		((IPhone)m[1]).setColor("���");
		m[1].call(10);
		m[1].charge(15);
		
		

	}

}
