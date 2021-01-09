package icehs.science.chapter10;

public class CarTest {

	public static void main(String[] args) {
		Car[] c = {new Text(), new Truck()};
		c[0].setOilSize(10);		
		((Text)c[0]).setMaxNum(4);
		c[0].go(20);
		
		System.out.println();
		
		c[1].setOilSize(10);
		((Truck)c[1]).setMaxWeight(100);
		c[1].go(30);
		

	}

}
