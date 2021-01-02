package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문제 4.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int americano = getUserInput();
        int amerPrice = americano * 2000;
        System.out.print( " 카페라떼 주문 수량 : " );
        int latte = getUserInput();
        int lattePrice = latte * 3000; 
        System.out.print( " 베이글 주문 수량 : " );
        int bagel = getUserInput();
        int bagelPrice = bagel * 1500;
        System.out.print( " 크림치즈 주문 수량 : " );
        int creamCheese = getUserInput();
        int creamCheesePrice = creamCheese * 500;
        System.out.println("=========금액=========");
        System.out.println("아메리카노 : " + amerPrice + "원");
        System.out.println("라떼 : " + lattePrice + "원");
        System.out.println("베이글 : " + bagelPrice + "원");
        System.out.println("크림치즈 : " + creamCheesePrice + "원");
        System.out.println("=====================");
        int money = amerPrice + lattePrice + bagelPrice + creamCheesePrice;
        System.out.println("총 구매 금액 : " + money + "원");
        if(money >= 12000 && money < 30000) {
        	System.out.println("포인트 적립 : " + money / 1/100 + "원");
        }else if (money > 30000) {
        	System.out.println("포인트 적립 : " + money / 2/100 + "원");
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
