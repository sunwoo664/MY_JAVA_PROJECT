package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        int amerPrice = americano * 2000;
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput();
        int lattePrice = latte * 3000; 
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagel = getUserInput();
        int bagelPrice = bagel * 1500;
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamCheese = getUserInput();
        int creamCheesePrice = creamCheese * 500;
        System.out.println("=========�ݾ�=========");
        System.out.println("�Ƹ޸�ī�� : " + amerPrice + "��");
        System.out.println("�� : " + lattePrice + "��");
        System.out.println("���̱� : " + bagelPrice + "��");
        System.out.println("ũ��ġ�� : " + creamCheesePrice + "��");
        System.out.println("=====================");
        int money = amerPrice + lattePrice + bagelPrice + creamCheesePrice;
        System.out.println("�� ���� �ݾ� : " + money + "��");
        if(money >= 12000 && money < 30000) {
        	System.out.println("����Ʈ ���� : " + money / 1/100 + "��");
        }else if (money > 30000) {
        	System.out.println("����Ʈ ���� : " + money / 2/100 + "��");
        }
        
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
