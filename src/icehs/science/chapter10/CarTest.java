package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car[] c = {new Text(), new Truck()};
		c[0].setOilSize(10);
		c[0].go(20);
		
		c[1].setOilSize(10);
		c[1].go(30);

	}

}
