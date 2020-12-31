package icehs.science.chapter05;

public class GradeIfElseEx {

	public static void main(String[] args) {
		int gilldong = 92;
		int gillsoon = 85;
		
		if(gilldong >= 90 && gilldong <=100 ){
			System.out.println("홍길동 : A학점입니다.");
		} else  {
			System.out.println("홍길동 : A학점을 받지 못하였습니다.");
				}
		if(gillsoon >= 90 && gillsoon <= 100) {
			System.out.println("홍길순 : A학점입니다.");
		} else  {
			System.out.println("홀길순 : A학점을 받지 못하였습니다.");
				}
	}

}
