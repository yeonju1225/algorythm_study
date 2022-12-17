package step02;

import java.util.Scanner;

public class Step02 {
    public static void main(String[] args) {
        //1330 - 두 수 비교하기
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(-10001 < num1 && num2 < 10001) {
            if( num1 > num2 ) {
                System.out.println(">");
            } else if ( num1 < num2 ) {
                System.out.println("<");
            } else if ( num1 == num2 ) {
                System.out.println("==");
            }
        } else {
            System.out.println("제한 조건에 맞지 않습니다.");
        }
    }
}
