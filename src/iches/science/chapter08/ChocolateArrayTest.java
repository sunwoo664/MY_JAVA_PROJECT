package iches.science.chapter08;



public class ChocolateArrayTest {
	public static void main(String[] args) {
		Chocolate[] cho = new Chocolate[3];
		cho[0] = new Chocolate("아마도라", "다크", 1200);
		cho[1] = new Chocolate("카페 커리쉬", "다크", 2500);
		cho[2] = new Chocolate("트리플 블랑", "화이트", 2300);
		
		cho[0].printChocolateInfo();
		cho[1].printChocolateInfo();
		cho[2].printChocolateInfo();
		for(int i = 0; i < cho.length; i++) {
			cho[i].printChocolateInfo();
		}
	}
}


