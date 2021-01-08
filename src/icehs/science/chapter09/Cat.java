package icehs.science.chapter09;

public class Cat extends Animal  {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
				
	}
	public void name() {
		System.out.println("¿Ã∏ß : " + this.name);
	}
	@Override
	public void hunt() { 
		System.out.println("¡„∏¶ ¿‚¿ª≤®æﬂ!!!");
	}
	
	public void paly() {
		System.out.println("∏∫Ù ≥Ó¿Ã∞° ¡¡æ∆ø‰.");
	}
}
