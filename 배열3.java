package test9_10_11배열;

public class Test9_11 {
    public static void main(String[] args) {
    //1, 2, 3, 4, 5, 6 ,7 ,8 로 초기화된 배열을 만들고, 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.

        int[] arr = {1,2,3,4,5,6,7,8};
        int cnt=0;

        //풀이1
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
        //풀이2
        for (int num : arr){
            if (num%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
