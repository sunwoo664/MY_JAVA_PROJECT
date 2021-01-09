package ws3.java2.controller;

import ws3.java2.entity.*;

public class VehicleManager {
	Vehicle[] vehicle = new Vehicle[7];
	
	public VehicleManager() {
		vehicle[0] = new Airplane("����747", 1300, 300, 4);
		
		vehicle[1] = new Airplane("F-15", 1600, 1, 1);
		
		vehicle[2] = new Car("�׷���", 180, 5, 10);
		
		vehicle[3] = new Car("����ũ", 130, 4, 15);
		
		vehicle[4] = new Car("��Ÿ����", 150, 10, 11);
		
		vehicle[5] = new Ship("ũ����2", 30, 400, 35000);
		
		vehicle[6] = new Ship("��ƿ����", 25, 150, 15000);
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for(int inx = 0; inx < vehicle.length; inx++) {
			vehicle[inx].displayInfo();
			vehicle[inx].setAvailable(true);		
		}
	}
}
