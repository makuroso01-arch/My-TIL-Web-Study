package 제미나이문제;

public class 배열1 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 75, 100, 95};

        int sum = 0;
        // 향상된 for문으로 군더더기 없이 합계 구하기
        for (int num : scores) {
            sum += num;
        }

        // print를 써서 한 줄에 깔끔하게 보여주기
        System.out.print("총점은 " + sum + "점이고, ");

        double avg = (double) sum / scores.length;
        System.out.print("평균은 " + avg + "점입니다.");

        int max = scores[0]; // 일단 첫 번째 점수를 1등이라고 '가정'

        for (int num : scores) {
            if ( num > max){// 만약 지금 꺼낸 점수(num)가 내가 알고 있는 1등(max)보다 더 크다면?
                max = num;// max 자리를 새로운 점수로 교체!
            }
        }
        System.out.println("최고 점수는: " + max);
    }
}
