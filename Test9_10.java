package test9_10_11배열;

import java.util.Scanner;

public class Test9_10 {
    public static void main(String[] args) {
//정수를 5개 저장할 수 있는 배열을 만들고, scanner를 통해 입력받은 값을 하나씩 배열의 요소에 저장해보자.
//만약 키보드로 1 2 3 4 5를 입력했다면 배열의 요소에 각각 1 2 3 4 5 가 저장되어야 한다.
//출력을 통해 결과를 확인해 보아라.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
