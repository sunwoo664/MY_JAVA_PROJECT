package iches.science.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idol = new Idol[4];
		idol[0] = new Idol("¼Ò³à½Ã´ë", "ÅÂ¿¬");
		idol[1] = new Idol("¾¾½ºÅ¸", "º¸¶ó");
		idol[2] = new Idol("ºò¹ð", "Áöµå·¡°ï");
		idol[3] = new Idol("ºñ½ºÆ®", "¾ç¿ä¼·");
		
		
		for(int i = 1; i < idol.length; i++) {
			System.out.println(idol[i].getGroup() + " : " + idol[i].getName());
		}
		System.out.println(idol[0].getGroup() + " : " + idol[0].getName());
		System.out.println(idol[1].getGroup() + " : " + idol[1].getName());
		System.out.println(idol[2].getGroup() + " : " + idol[2].getName());
		System.out.println(idol[3].getGroup() + " : " + idol[3].getName());
		
	}

}
