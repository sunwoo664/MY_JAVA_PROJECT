package iches.science.chapter08;

public class StudentArrayTest {
	public static void main(String[] args) {
		Studnet[] st = new Studnet[3];
		st[0] = new Studnet("������", "STU001", "010-1234-5678");
		st[1] = new Studnet("�̼���", "STU002", "010-2345-6789");
		st[2] = new Studnet("������", "STU003", "010-3456-7890");
		
		for(int i = 0; i < st.length; i++) {
			st[i].printStedentInfo();
		}

	}

}
