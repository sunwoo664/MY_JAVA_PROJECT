package iches.science.chapter08;

public class StudentArrayTest {
	public static void main(String[] args) {
		Studnet[] st = new Studnet[3];
		st[0] = new Studnet("강감참", "STU001", "010-1234-5678");
		st[1] = new Studnet("이순신", "STU002", "010-2345-6789");
		st[2] = new Studnet("김유신", "STU003", "010-3456-7890");
		
		for(int i = 0; i < st.length; i++) {
			st[i].printStedentInfo();
		}

	}

}
