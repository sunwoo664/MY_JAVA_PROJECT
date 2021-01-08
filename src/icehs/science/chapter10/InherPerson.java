package icehs.science.chapter10;

public class InherPerson {

	public static void main(String[] args) {
		Person[] person = {new Person(), new Student(), new Teacher()};
		
		for(int i = 0; i < person.length; i++) {
			person[i].eat();
			person[i].sleep();
			System.out.println();
		}	
	}
}

