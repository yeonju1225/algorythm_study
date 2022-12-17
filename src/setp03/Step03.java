package setp03;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step03 {
    public static void main(String[] args) throws IOException {
        //2739 - 구구단
        /*Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }*/

        //10950 - A+B - 3
        /*Scanner sc = new Scanner(System.in);

        int line = sc.nextInt();

        int lineNumArr[] = new int[line];

        for (int i = 0; i < line; i++) {
            int lineNum1 = sc.nextInt();
            int lineNum2 = sc.nextInt();

            lineNumArr[i] = lineNum1 + lineNum2;
        }
        for (int arrLine : lineNumArr) {
            System.out.println(arrLine);
        }*/

        //8393 - 합
        /*Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= num; i++) {
            total += i;
        }
        System.out.println(total);*/

        //25304 - 영수증
        /*Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int totalCnt = sc.nextInt();
        int moneySum = 0;

        for (int i = 0; i < totalCnt; i++) {
            int money = sc.nextInt();
            int cnt = sc.nextInt();

            moneySum += money * cnt;
        }

        if(totalPrice == moneySum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/

        //15552 - 빠른 A+B
        //11021 - A+B - 7
        //11022 - A+B - 8
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int line = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= line; i++) {
            st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            //bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); //15552
            //bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n"); //11021
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n"); //11022
        }
        bw.close();*/

        //2438 - 별 찍기 - 1
        //2438 - 별 찍기 - 2
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int line = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= line; i++) {
            //2439 추가
            for (int j = line; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //10952 - A+B - 5
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if ( A == 0 && B == 0 ) {
                break;
            }
            sb.append((A+B) + "\n");
        }
        System.out.println(sb);*/

        //10951 - A+B - 4 ( 백준에서는 되는데 인텔리제이에서 실행하면 StringIndexOutOfBoundsException 오류 발생 왜그러는겨... )
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while((str = br.readLine()) != null) {
            int A = str.charAt(0) - 48;
            int B = str.charAt(2) - 48;

            sb.append(A+B).append("\n");
        }
        System.out.println(sb);*/

        //1110 - 더하기 사이클
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        String Number = br.readLine();

        while (true) {
            if(Number.length() == 1) {
                Number = "0" + Number;
            }
            int A = Number.charAt(0);
            int B = Number.charAt(1);
            int Sum = A + B;

            if(Integer.parseInt(Number) == (A + B)) {
                break;
            } else {
                n += 1;
            }
        }
    }
}
