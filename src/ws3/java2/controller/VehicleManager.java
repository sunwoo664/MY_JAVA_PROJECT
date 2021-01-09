package ws3.java2.controller;

import ws3.java2.entity.*;

public class VehicleManager {
	Vehicle[] vehicle = new Vehicle[7];
	
	public VehicleManager() {
		vehicle[0] = new Airplane("보잉747", 1300, 300, 4);
		
		vehicle[1] = new Airplane("F-15", 1600, 1, 1);
		
		vehicle[2] = new Car("그랜저", 180, 5, 10);
		
		vehicle[3] = new Car("스파크", 130, 4, 15);
		
		vehicle[4] = new Car("스타렉스", 150, 10, 11);
		
		vehicle[5] = new Ship("크루즈2", 30, 400, 35000);
		
		vehicle[6] = new Ship("노틸러스", 25, 150, 15000);
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for(int inx = 0; inx < vehicle.length; inx++) {
			vehicle[inx].displayInfo();
			vehicle[inx].setAvailable(true);		
		}
	}
}

