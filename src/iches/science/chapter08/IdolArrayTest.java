package iches.science.chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idol = new Idol[4];
		idol[0] = new Idol("�ҳ�ô�", "�¿�");
		idol[1] = new Idol("����Ÿ", "����");
		idol[2] = new Idol("���", "���巡��");
		idol[3] = new Idol("��Ʈ", "��伷");
		
		
		for(int i = 1; i < idol.length; i++) {
			System.out.println(idol[i].getGroup() + " : " + idol[i].getName());
		}
		System.out.println(idol[0].getGroup() + " : " + idol[0].getName());
		System.out.println(idol[1].getGroup() + " : " + idol[1].getName());
		System.out.println(idol[2].getGroup() + " : " + idol[2].getName());
		System.out.println(idol[3].getGroup() + " : " + idol[3].getName());
		
	}

}
