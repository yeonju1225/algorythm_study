package step02;

import java.util.Scanner;

public class Step02 {
    public static void main(String[] args) {
        //1330 - 두 수 비교하기
        /*Scanner sc = new Scanner(System.in);

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
        }*/

        //9498 - 시험 성적
        /*Scanner sc = new Scanner(System.in);

        int testScore = sc.nextInt();

        if( -1 < testScore && testScore < 101 ) {
            if(testScore >= 90) {
                System.out.println("A");
            } else if ( testScore >= 80) {
                System.out.println("B");
            } else if ( testScore >= 70 ) {
                System.out.println("C");
            } else if ( testScore >= 60 ) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else {
            System.out.println("점수 범위를 확인하세요.");
        }*/

        //2753 - 윤년
        /*Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if( 1 < year && year < 4000 ) {
            if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("범위를 확인하세요.");
        }*/

        //14681 - 사분면 고르기
        /*Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if ( 0 < x && 0 < y ) {
            System.out.println("1");
        } else if ( 0 > x && 0 < y ) {
            System.out.println("2");
        } else if ( 0 > x && 0 > y ) {
            System.out.println("3");
        } else if ( 0 < x && 0 > y) {
            System.out.println("4");
        }*/

        //2884 - 알람 시계
        /*Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        int MM = 60 - (45 - M);

        if ( M < 45 ) {
            H--;
            if(H == -1) {
                H = 23;
            }
            System.out.println(H + " " + MM);
        } else {
            System.out.println(H + " " + (M - 45));
        }*/

        //2525 - 오븐 시계
        /*Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int realTime = sc.nextInt();

        int min = 60 * H + M;
        min += realTime;

        int hour = (min / 60) % 24;
        int minute = min % 60;

        System.out.println(hour + " " + minute);*/

        //2480 - 주사위 세개
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c && a == c) {
            int money = 10000 + a * 1000;
            System.out.println(money);
        } else if ( a == b || a == c || b == c) {
            if (a == b) {
                int money = 1000 + a * 100;
                System.out.println(money);
            } else if (b == c) {
                int money = 1000 + b * 100;
                System.out.println(money);
            } else if (a == c) {
                int money = 1000 + c * 100;
                System.out.println(money);
            }
        } else if (a != b && a != c && b != c) {
            int max;
            if (a >= b && a >= c) {
                max = a;
            } else if (b >= a && b >= c) {
                max = b;
            } else {
                max = c;
            }
            int money = max * 100;
            System.out.println(money);
        }
    }
}
