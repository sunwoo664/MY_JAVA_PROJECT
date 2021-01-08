package icehs.science.chapter09;

public class Dog extends Animal{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public 	Dog(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
				
	}
	public void name() {
		System.out.println("�̸� : " + this.name);
	}
	
	@Override
	public void hunt() { 
		System.out.println("������ ��������!!!");
	}
	
	@Override
	public void run() {
		System.out.println("�ü� 40Km�� �پ�!!!!!");
	}
	
	public void paly() {
		System.out.println("��� ���̰� ���ƿ�.");
	}
}
