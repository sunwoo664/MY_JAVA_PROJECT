package icehs.science.chapter10;

public class Teacher extends Person {
	
	String subject;
	
	@Override
	void eat() {
		
		System.out.println("���� �Ļ縦 �մϴ�.");
	}
		
	void teach() {
		System.out.println("����Ĩ�ϴ�.");
	}
}
