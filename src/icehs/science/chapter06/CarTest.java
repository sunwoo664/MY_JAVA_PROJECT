package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.distance = 140;
		c.oilAmount = 5;
		
		c.printCarInfo();
		
		c.addoil(10);
		c.printCarInfo();

		c.driveCar("IT����", "��õ����", 10.17);
		c.printCarInfo();
		
		c.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		c.printCarInfo();
		
		c.calcEnableDistance();
		
	}

}
