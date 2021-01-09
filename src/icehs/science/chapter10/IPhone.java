package icehs.science.chapter10;

public class IPhone extends Moblie {
	private String color;
	
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public IPhone() {
		super("IPhone");
	}
	
	@Override
	public void charge(int time) {
		System.out.println("IPhone : " + this.color);
		System.out.println("IPhone : " + time + "분 충전 했더니 Full!!");
	}
	
	
}
