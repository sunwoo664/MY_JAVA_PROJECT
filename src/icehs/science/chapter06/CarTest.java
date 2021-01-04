package icehs.science.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car c = new Car();
		
		c.distance = 140;
		c.oilAmount = 5;
		
		c.printCarInfo();
		
		c.addoil(10);
		c.printCarInfo();

		c.driveCar("IT센터", "인천공항", 10.17);
		c.printCarInfo();
		
		c.driveCar("인천공항", "곤지암리조트", 60.21);
		c.printCarInfo();
		
		c.calcEnableDistance();
		
	}

}
