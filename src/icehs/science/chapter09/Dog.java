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
		System.out.println("이름 : " + this.name);
	}
	
	@Override
	public void hunt() { 
		System.out.println("순록을 잡을꺼야!!!");
	}
	
	@Override
	public void run() {
		System.out.println("시속 40Km로 뛰어!!!!!");
	}
	
	public void paly() {
		System.out.println("모빌 놀이가 좋아요.");
	}
}
