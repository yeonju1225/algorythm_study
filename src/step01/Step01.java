package step01;

public class Step01 {
    public static void main(String[] args) {
        //3003 - 킹, 퀸, 룩, 비숍, 나이트, 폰
        /*Scanner sc = new Scanner(System.in);

        int ches[] = {1,1,2,2,2,8};
        int searchChes[] = new int[6];
        int resultChes[] = new int[6];

        for (int i = 0; i < ches.length; i++) {
            searchChes[i] = sc.nextInt();
            if(ches[i] - searchChes[i] != 0) {
                resultChes[i] = ches[i] - searchChes[i];
            } else {
                resultChes[i] = 0;
            }
        }
        sc.close();

        for (int i = 0; i < resultChes.length; i++) {
            if(i == resultChes.length - 1) {
                System.out.print(resultChes[i]);
            } else {
                System.out.print(resultChes[i] + " ");
            }
        }*/

        //10430 - 나머지
        /*Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((1 < A && A < 10001) && (1 < B && B < 10001) && (1 < C && C < 10001)) {
            System.out.println(( A + B ) % C);
            System.out.println((( A % C ) + ( B % C )) % C);
            System.out.println(( A * B ) % C);
            System.out.println((( A % C ) * ( B % C )) % C);
        }*/

        //2588 - 곱셈
        /*Scanner sc = new Scanner(System.in);

        int inputNum1 = sc.nextInt();
        String inputNum2 = sc.next();

        int result = 0;
        String oneIndex = inputNum2.charAt(2) + "";
        String twoIndex = inputNum2.charAt(1) + "0";
        String threeIndex = inputNum2.charAt(0) + "00";

        int multiplyNum1 = Integer.parseInt(oneIndex) * inputNum1;
        int multiplyNum2 = Integer.parseInt(twoIndex) * inputNum1;
        int multiplyNum3 = Integer.parseInt(threeIndex) * inputNum1;

        String stNum1 = String.valueOf(multiplyNum2);
        String stNum2 = String.valueOf(multiplyNum3);

        result = multiplyNum1 + multiplyNum2 + multiplyNum3;

        System.out.println(multiplyNum1);
        System.out.println(stNum1.substring(0,stNum1.length()-1));
        System.out.println(stNum2.substring(0,stNum2.length()-2));
        System.out.println(result);*/

        //10171 - 고양이
        /*System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");*/

        //10172 - 개
        /*System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");*/

        //25083 - 새싹
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}