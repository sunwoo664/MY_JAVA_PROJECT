package icehs.science.chapter10;

public class Moblie {
	private String production;
	private int price;
	
	public Moblie(String produnction) {
		this.production = produnction;
	}

	public void call(int time) {
		System.out.println(this.production + ": " + time + "�� ��ȭ�߽��ϴ�.");
	}
	
	public void charge(int time) {
		System.out.println(this.production + ": " + time + "�� �����߽��ϴ�.");
	}
}
