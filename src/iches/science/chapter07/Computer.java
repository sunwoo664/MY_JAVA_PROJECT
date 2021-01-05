package iches.science.chapter07;

public class Computer {
	String model;
	String osVer;
	int production;
	int slaes;
	public Computer(String model, String osVer, int production) {
		super();
		this.model = model;
		this.osVer = osVer;
		this.production = production;
	}
	public Computer(String model, String osVer, int production, int slaes) {
		super();
		this.model = model;
		this.osVer = osVer;
		this.production = production;
		this.slaes = slaes;
	}
	
	void printComputerInfo() { 
		System.out.println("===" + this.model + "(" + this.osVer + ")" + "===");
		System.out.println("생산 : " + this.production + " / 판매 " + this.slaes);
	}
}
