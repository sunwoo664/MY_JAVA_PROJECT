package icehs.science.chapter09;

public class AnimalTest extends Object {

	public static void main(String[] args) {
		Cat c = new Cat(3, "페르시안", "야옹이");
		c.name();
		System.out.println("나이 : " + c.getAge());
		System.out.println("종류 : " + c.getKind());
		c.run();
		c.hunt();
		c.paly();
		
		System.out.println();
		
		Dog d = new Dog(2, "시베리안하스키", "멍멍이");
		d.name();
		System.out.println("나이 : " + d.getAge());
		System.out.println("종류 : " + d.getKind());
		d.run();
		d.hunt();
		
	}

}
