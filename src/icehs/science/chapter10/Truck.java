package icehs.science.chapter10;

public class Truck extends Car {
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	@Override
	public void go(int distance) {
		System.out.println("Ʈ���� Ÿ�� " + distance + "km �̵��մϴ�.");
		System.out.println("���� : " + super.getOilSize());
		System.out.println("Ʈ�� �ִ� ���緮 : " + this.maxWeight + "kg");
	}
}
