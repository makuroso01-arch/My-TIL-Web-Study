package test12_13_14메서드;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        word("안녕하세요");
//        num(10);
//        word1("너는 누구냐?");
//        num1(5, 6);
//        num2(2, 3, 4);
//        num3(20, 4);
//        word2("우리는", " 하나다.");
//        System.out.print("정수 입력: ");
//        int d = sc.nextInt();
//        num4(d);
//        System.out.print("첫번째 정수: ");
//        int e = sc.nextInt();
//        System.out.print("두번째 정수: ");
//        int e1 = sc.nextInt();
//        num5(e, e1);
//        num6(6);
//        num7(7, 100);
//        num8(7);
//        num9(1, 6);
//        num10(1,16);
        wordNum("안녕", 5);

    }
    //1 ‘안녕하세요’ 라는 문자열를 출력하는 기능을 가진 메소드를 선언하고, 호출해 보세요.
    public static void word(String a){
        System.out.println(a);
    }

    //2 정수 하나를 매개변수로 받아, 그 값을 출력하는 메소드를 선언하고 호출하여 보세요.
    public static void num(int a){
        System.out.println(a);
    }

    //3 문자열 하나를 매개변수로 받아, 그 문자열을 출력하는 메소드를 선언하고 호출해보세요.
    public static void word1(String a1){
        System.out.println(a1);
    }

    //4 정수 두 개를 매개변수로 받아, 두 수의 합을 출력하는 메소드를 선언하고 호출해 보세요.
    public static void num1(int a2, int a3){
        System.out.println(a2 + a3);
    }

    //5 정수 세 개를 매개변수로 받아, 세 수의 곱을 출력하는 메소드를 선언하고 호출해 보세요.
    public static void num2(int b, int b1, int b2){
        System.out.println(b*b1*b2);
    }

    //6 두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고 호출해 보세요.
    public static void num3(int c, int c1){
        System.out.println(c/c1);
        System.out.println(c%c1);
    }

    //7 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 출력하는 메소드를 선언하고 호출해보세요.
    public static void word2(String b, String b1){
        System.out.println(b+b1);
    }

    //8 키보드로 입력받은 정수를 매수변수로 받아, 해당 정수를 출력하는 메소드를 선언, 호출해보세요.
    public static void num4(int d){
        System.out.println("입력 받은 정수: " + d);
    }

    //9 scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
    public static void num5(int e, int e1){
        System.out.println("입력 받은 두 수의 합: " + (e + e1));
    }

    //10 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’, 홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요.
    public static void num6(int f){
        if (f%2==0){
            System.out.println("짝수입니다.");
        }
        else {
            System.out.println("홀수입니다.");
        }

    }

    //11 두 정수를 매개변수로 받아, 두 정수가 모두 짝수이면 ‘두 수는 짝수입니다.’를 출력하고, 한 정수만 짝수일 경우 ‘한 수만 짝수입니다.’를,
    //두 수 모두 홀수일 때는 ‘두 수는 홀수입니다.’를 출력하는 메소드를 선언하고 호출해보세요.
    public static void num7(int g, int g1){
        if (g%2==0 && g1%2==0){
            System.out.println("두 수는 짝수입니다.");
        }
        else if (g%2==1 && g1%2==1){
            System.out.println("두 수는 홀수입니다.");
        }
        else {
            System.out.println("한 수만 짝수입니다.");
        }
    }

    //12 한 정수를 매개변수로 받아, 0부터 입력받은 숫자까지 출력하는 메소드를 선언 및 호출해보세요.
    public static void num8(int h){
        for (int i=0;i<=h;i++){
            System.out.println(i);
        }

        //제미나이 응용문제.
//        int sum=0;
//        for (int i=0;i<=h;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
    }

    //13 정수를 매개변수로 받아, 두 정수 사이의 숫자를 출력하는 메소드를 선언 및 호출해보세요.
    public static void num9(int j, int j1){
        System.out.println("시작점: " + j);
        System.out.println("마지막점: " + j1);

        //i는 시작값(j)부터 시작해서, 끝값(j1)까지 1씩 커집니다.
        for (int i=j; i<=j1;i++){
            System.out.println(i);//변하는 j값을 그대로 출력!
        }
        //핵심포인트
        //1. j = i: 반복을 시작하는 j에게 "너는 이제부터 i라는 숫자야"라고 임무를 줍니다.
        //2. j <= i1: "너는 i1이 될 때까지만 달려!"라고 한계를 정해줍니다. (이때 i1은 변하지 않고 굳건히 자리를 지켜야 합니다.)
        //3. j++: 한 바퀴 돌 때마다 j를 1씩 키워서 다음 숫자를 준비합니다.
    }

    //14 두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고 호출해보세요.
    public static void num10(int k, int k1){
        System.out.println("첫번째 정수: " + k);
        System.out.println("두번째 정수: " + k1);

        int cnt=0;
        for (int i=k; i<=k1;i++){
            if (i%5==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    //15 한 문자열과 정수를 매개변수로 받아, 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복 출력하는 메소드를 선언하고 호출해보세요.
    public static void wordNum(String a, int m){
        System.out.println("문자: " + a);
        System.out.println("정수: " + m);

        // i는 0부터 시작해서 m보다 작을 때까지 (즉, m번) 반복합니다.
        for (int i=0;i<m;i++){
            System.out.print(a + " ");
        }
    }

}
