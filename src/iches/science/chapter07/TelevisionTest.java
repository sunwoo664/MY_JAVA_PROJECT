package iches.science.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television infinia = new Television("INFINIA", 1500000);
		infinia.printTelvisionInfo();
		
		Television xcanvas = new Television("XCANVAS", 2000000, "LCDTV");
		xcanvas.printTelvisionInfo();
		
		Television cinema = new Television("CINEMA", 200000, "3D TV");
		cinema.printTelvisionInfo();

	}

}
