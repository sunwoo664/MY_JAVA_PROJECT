package icehs.science.chapter09;

public class AnimalTest extends Object {

	public static void main(String[] args) {
		Cat c = new Cat(3, "�丣�þ�", "�߿���");
		c.name();
		System.out.println("���� : " + c.getAge());
		System.out.println("���� : " + c.getKind());
		c.run();
		c.hunt();
		c.paly();
		
		System.out.println();
		
		Dog d = new Dog(2, "�ú������Ͻ�Ű", "�۸���");
		d.name();
		System.out.println("���� : " + d.getAge());
		System.out.println("���� : " + d.getKind());
		d.run();
		d.hunt();
		
	}

}
