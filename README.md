# 2025.12.28
# My-TIL-Web-Study
## Starte ~ My Study!! 
### oh~ My god!
한글로 써도 되는건가??? **코딩** 어렵다... *html*부터 조금씩 알아보자!

Git 간단한 사용법
* 순서 없는 목록
  * 한 칸 들여쓰면 하위 항목이 된단다!
1. 순서 있는 목록
2. 자동으로 번호가 매겨지네~

- [ ] 체크박스 (미완료)
- [x] 체크박스 (완료)


```javascript
function hello() {
  console.log("Hello World");
}
```

[표시될 이름](URL 주소)  // 링크
![이미지 설명](이미지 주소) // 이미지

> 중요한 참고 사항이나 명언을 적을 때 사용합니다.

| 요일 | 학습 내용 | 상태 |
| :--- | :--- | :---: |
| 월요일 | HTML 기초 | 완료 |
| 화요일 | CSS 레이아웃 | 진행중 |


# 2025.12.29 
# 소수 판별 알고리즘 (효율적 방식) - (feat.제미나이)
## 핵심 요약

1. 검증의 무게: 테스트 시 5보다 7이 반복문의 흐름을 확인하기에 더 적당함.

2. 메서드 분리: `isPrime`이라는 전문가(메서드)를 만들어 메인 로직을 깔끔하게 유지.

3. 효율성 (`i * i <= n`): 약수의 대칭성을 이용하여 제곱근까지만 확인 (속도 향상).

4. Static: 객체 생성 없이 바로 호출할 수 있는 '깐부' 시스템.


## 자바 코드

```
# 키포인트
1. "왜 제곱근까지만 검사하는가?"
2."static이 왜 깐부인가?"

//효율적 풀이(전통적인 for문 -> **인덱스(번호표)**를 들고 찾아가는 방식
        //main 메서드 -> 질문 던지는 곳
        for (int i = 2; i <= 30; i++) {//2~30을 출력
          if (isPrime(i)) {// 여기서 전문가(소수판변 메서드)를 불러서 "결과값"을 i(편지)로 true 값만 받아옴
            System.out.print(i + " "); //최종 소수판별 메서드의 리턴결과 출력. 결과가 true(참)일 때만 실행
          }
        }
      }
//isPrime -> 질문에 답하는 전문가 *n은 메인에서 받은 i의 정보
    public static boolean isPrime(int n) {
        // 이 메서드는 대답(boolean)을 돌려줄 거야! 받은 i값을 n이라 하고 참 거짓으로 응답함. *isPrime = 소수입니까?
      if (n < 2) return false; // 받은 값이 2보다 작으면 "아니, 소수 아니야(false)" 리턴 시킴.
        //i * i <= n 은 i <= Math.sqrt(n)과 같습니다. *Math.sqrt(n)는 제곱근 함수.
        //i * i <= n : 제곱근까지만 확인하기
        // 1. 약수는 항상 짝이 있음
        //  예) 숫자 16의 약수
        //      1 * 16 = 16
        //      2 * 8  = 16
        //      4 * 4  = 16
        //      8 * 2  = 16
        //      16 * 1 = 16
        // '4 * 4'를 기점으로 대칭됨. 앞을 기점으로 뒤는 굳이 나누어보지 않아도 알 수 잇음.
        // 2. 소수인지 확인할 때 조기 종료
        // 소수는 1과 자기 자싱 외에 약수가 하나라도 있으면 종료
        //  예} 100이 소수인지 확인
        //      100의 정중앙인 '10 * 10'까지만 나눠봄
        //      2로 나누어 떨어지는 순간 이미 2 * 50이라는 짝이 있다는게 확정되니 50까지 확인 할 필요 없이 종료
        // 컴퓨터는 단순한걸 좋아함!! 제곱근 연산 보다는 단순 곱셈 연산을 선호함.
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false; // 받은 값(n)이 나누어 떨어지는 값을 찾으면? "응, 소수 아니야(false)" 리턴 시킴.
      }
     //위의 모든 검사를 통과했다면?
      return true; // "응, 이건 진짜 소수야(true)!"


# 2025.12.29 
public class Test8반복문_6 {
    public static void main(String[] args) {
        //2부터 30까지의 숫자 중에서 소수만 출력하는 프로그램을 작성하세요.
        //소수 : 1과 자신으로만 나누어 떨어지는 수

//        for (int i = 2; i < 31; i++) {
//            int cnt = 0; //나누어 떨어지는 약수 갯수
//            //i가 소수면 출력 :
//            //1. 2부터 어떤 수까지 1씩 증가하면서 나누기를 반복
//            //2. 1번의 반복을 2부터 30까지 반복
//            for (int j = 1; j < i+1; j++) { // j < i + 1을 j <= i로 깔끔하게 표현 가능
//
//                if (i % j == 0) {
//                    cnt++; //나마지가 0인 횟수
//                    if (cnt > 2) { // 약수가 2개를 초과하면 더 볼 필요 없이 중단
//                        break;
//                    }
//                }
//            }
//            if (cnt == 2) {// 약수가 딱 2개(1과 자신)라면 소수
//                System.out.print(i + " ");
//            }
//        }
        //만약 성능을 조금 더 높이고 싶다면, j를 2부터 시작하는 방법도 있습니다.
        //
        //원리: 모든 수는 1로 나누어떨어지므로, 1은 제외하고 2부터 i-1까지 나누어떨어지는 게 하나도 없다면 소수입니다.
        //
        //이렇게 하면 cnt가 0인지만 확인하면 되므로 코드가 더 간결해질 수 있습니다.

        System.out.println();

//    //직관적 풀이
//        System.out.println("2부터 30까지의 소수:");
//
//        for (int i = 2; i <= 30; i++) { // 2부터 30까지 반복
//          boolean isPrime = true;
//
//          // 2부터 해당 숫자 이전(i-1)까지 나누어지는지 확인
//          for (int j = 2; j < i; j++) {
//            if (i % j == 0) {
//              isPrime = false; // 나누어떨어지면 소수가 아님
//              break;
//            }
//          }
//
//          // 소수인 경우에만 출력
//          if (isPrime) {
//            System.out.print(i + " ");
//          }
//        }

        //효율적 풀이(전통적인 for문 -> **인덱스(번호표)**를 들고 찾아가는 방식
        //main 메서드 -> 질문 던지는 곳
        for (int i = 2; i <= 30; i++) {//2~30을 출력
            if (isPrime(i)) {// 여기서 전문가(소수판변 메서드)를 불러서 "결과값"을 i(편지)로 true 값만 받아옴
                System.out.print(i + " "); //최종 소수판별 메서드의 리턴결과 출력. 결과가 true(참)일 때만 실행
            }
        }
    }

    // 소수 판별 메서드 분리
        //isPrime -> 질문에 답하는 전문가 *n은 메인에서 받은 i의 정보
    public static boolean isPrime(int n) {
        // 이 메서드는 대답(boolean)을 돌려줄 거야! 받은 i값을 n이라 하고 참 거짓으로 응답함. *isPrime = 소수입니까?
      if (n < 2) return false; // 받은 값이 2보다 작으면 "아니, 소수 아니야(false)" 리턴 시킴.
        //i * i <= n 은 i <= Math.sqrt(n)과 같습니다. *Math.sqrt(n)는 제곱근 함수.
        //i * i <= n : 제곱근까지만 확인하기
        // 1. 약수는 항상 짝이 있음
        //  예) 숫자 16의 약수
        //      1 * 16 = 16
        //      2 * 8  = 16
        //      4 * 4  = 16
        //      8 * 2  = 16
        //      16 * 1 = 16
        // '4 * 4'를 기점으로 대칭됨. 앞을 기점으로 뒤는 굳이 나누어보지 않아도 알 수 잇음.
        // 2. 소수인지 확인할 때 조기 종료
        // 소수는 1과 자기 자싱 외에 약수가 하나라도 있으면 종료
        //  예} 100이 소수인지 확인
        //      100의 정중앙인 '10 * 10'까지만 나눠봄
        //      2로 나누어 떨어지는 순간 이미 2 * 50이라는 짝이 있다는게 확정되니 50까지 확인 할 필요 없이 종료
        // 컴퓨터는 단순한걸 좋아함!! 제곱근 연산 보다는 단순 곱셈 연산을 선호함.
      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) return false; // 받은 값(n)이 나누어 떨어지는 값을 찾으면? "응, 소수 아니야(false)" 리턴 시킴.
      }
     //위의 모든 검사를 통과했다면?
      return true; // "응, 이건 진짜 소수야(true)!"
    }

    //향상된 for문(for-each)을 활용한 소수 출력 코드 -> 데이터가 직접 나에게 찾아오는 방식
    public class PrimeForEach {
        public static void main(String[] args) {
            // 1. 소수들을 담을 배열 (최대 30개라고 가정)
            int[] primes = new int[30];
            int count = 0;

            // 2. 소수를 찾아 배열에 저장
            for (int i = 2; i <= 30; i++) {
                if (isPrime(i)) {
                    primes[count] = i; // 소수를 배열에 차곡차곡 담기
                    count++;
                }
            }

            // 3. 향상된 for문(for-each)으로 출력
            System.out.println("찾은 소수 목록:");
            for (int num : primes) {
                //1. "primes 배열(바구니)에서 숫자를 하나씩 꺼내서 num에 담아라!" 라는 뜻입니다.
                //2. primes[i]라고 쓸 필요가 없어서 코드가 훨씬 직관적이죠?
                if (num == 0) break; // 배열 뒷부분의 빈 공간(0)은 무시
                //1. 우리가 배열 크기를 30으로 넉넉하게 잡았기 때문에, 소수가 아닌 뒷부분은 0으로 채워져 있어요.
                //2. 그래서 "0이 나오면 다 출력한 거니까 그만해!"라고 멈춰주는 장치를 넣었습니다.

                //1. 왜 if (num == 0)이 필요했을까?
                //자바에서 int[] primes = new int[30];이라고 배열을 만들면, 컴퓨터는 일단 방 30개를 만들고 전부 숫자 0으로 채워 넣습니다.
                //그런데 2부터 30 사이의 소수는 딱 10개뿐이에요.
                //앞쪽 10개 방: 2, 3, 5, 7, 11... (진짜 소수들)
                //뒤쪽 20개 방: 0, 0, 0, 0... (아직 비어있는 방들)
                //만약 if문 없이 그냥 출력하면 어떻게 될까요?
                //"찾은 소수: 2 3 5 7 11 13 17 19 23 29 0 0 0 0 0 0 0..."
                //이렇게 보기 싫은 0들이 줄줄이 나오게 됩니다. 그래서 **"야, 0이 나오면 그 뒤는 볼 필요 없으니까 멈춰!"**라고 말해줘야 했던 거예요.

                //코드를 다시 읽어보기 (대화체 버전)
                //for (int num : primes) {    // 1. primes 상자에서 숫자(num)를 하나씩 꺼내보자.
                //    if (num == 0) {         // 2. 어? 꺼낸 숫자가 0이네? (비어있는 방이 시작됐군)
                //        break;              // 3. 그럼 더 볼 것도 없지! 여기서 당장 멈춰! (탈출)
                //    }
                //    System.out.print(num);  // 4. 0이 아니라면, 진짜 소수니까 화면에 출력해!
                //}

                //3. 더 깔끔하게 생각하는 팁
                //사실 이 if와 break가 헷갈리는 이유는 배열의 크기를 너무 크게 잡아서 생기는 문제입니다. 만약 딱 소수 개수만큼만 배열을
                //만들었다면 이런 복잡한 조건문은 필요 없었을 거예요.
                //지금은 **"배열의 남은 빈 공간(0)을 건너뛰기 위한 안전장치"**였다고 생각하시면 마음이 훨씬 편해지실 겁니다.
                System.out.print(num + " ");
            }
        }

        // 우리가 만든 소수 감별사 깐부
        public static boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    //static의 활용
    //1. main: "나를 따르라!! (대장 출두)"
    //프로그램이 시작될 때, 컴퓨터는 메모리 어딘가에 static 계급들만 모여 있는 특별한 광장을 먼저 만듭니다. main은 그 광장의 대장이에요.
    //
    //"내가 제일 먼저 나갈 테니, 나를 따르라!" 하고 깃발을 꽂는 거죠.
    //
    //이때 객체(new) 같은 건 아직 태어나지도 않은 상태입니다.
    //
    //2. isPrime: "너도 합류해!! (참모 모집)"
    //대장인 main이 광장에서 작전을 짜고 있는데(코드를 실행하는데), 중간에 계산이 필요해요.
    //
    //그런데 isPrime이라는 참모가 static 광장에 합류해 있지 않으면(static이 아니면), 대장이 직접 데리러 가거나 새로 만들어야 해서 번거롭습니다.
    //
    //그래서 **"너도 이 광장에 미리 합류해 있어!"**라고 static 딱지를 붙여주는 거예요. 그러면 대장이 그냥 이름만 불러도 바로 대답할 수 있으니까요.
    //
    //3. 결론적으로 static끼리는 '깐부'입니다
    //대장(main)이 static 광장에 서서 주변을 둘러봤을 때, 같이 static 딱지를 붙이고 서 있는 isPrime은 **별도의 절차 없이 바로 대화가 가능한 '깐부'**가 되는 겁니다.
    //
    //"우리 다 같이 광장에 미리 나와서 대기하자!" → 이게 바로 static의 핵심입니다.

    //-static 광장: 게임이 시작되기 전부터 이미 세팅되어 있는 경기장 (여기에 대장 main과 참모 isPrime이 대기 중)
    //
    //-일반 객체 (Non-static): 게임 도중에 필요에 따라 new라는 이름표를 달고 들어오는 참가자들
    //
    //-main 대장의 외침: "야! isPrime 깐부! 너 거기 있지? 7이 소수인지 얼른 알려줘!"

    //<지식지도>
    //테스트 데이터 7: 반복문의 과정을 충분히 보여주는 '적당한 무게'.
    //
    //메서드 분리: 전문가(isPrime)에게 일을 맡기는 '분업화'.
    //
    //제곱근(i * i): 약수의 대칭성을 이용한 '효율적인 잔머리'.
    //
    //Static: 광장에 미리 모여 있는 '깐부 시스템'.
}




```
# 배열 시 주의사항
1.배열 초기화의 제약
int[] array; array = {1, 2, 3}; -> array = new int[]{1, 2, 3};
 -자바에서 배열 변수를 선언한 후, 나중에 값을 대입할 때는 {1, 2, 3} 처럼 리터럴만 사용할 수 없습니다. 이 경우에는 array = new int[]{1, 2, 3};과 같이 new 키워드를 명시해 주어야 합니다.

2.배열 선언 시 크기 지정 불가
int[10] arr;  -> int[] arr;
 - 자바에서는 배열을 선언할 때 대괄호[] 안에 숫자를 넣어 크기를 지정할 수 없습니다.
 - 자바에서 배열 선언 시에는 "이 변수는 정수형 배열이다"라는 타입만 정의해야 합니다. 크기(10)는 실제 배열을 생성할 때(new 키워드를 쓸 때) 결정됩니다.

3. 배열 시 주의해야할 공식
// 1. 선언과 동시에 (생략형 - 가장 많이 씀)
int[] a = {1, 2, 3};

// 2. 선언과 동시에 (정석형 - 질문하신 문법, 아주 정확함)
int[] b = new int[]{1, 2, 3};

// 3. 선언 후 나중에 대입 (생략 불가 - 무조건 이 방법만 가능)
int[] c;
c = new int[]{1, 2, 3};

# 🚀 자바 기초 및 알고리즘 학습 기록

## 1. 소수 판별 알고리즘 (Prime Number)
단순한 반복문에서 벗어나 효율적인 로직을 구현하는 연습을 했습니다.

### 핵심 배운 점
* **효율성**: `i * i <= n` 조건을 사용해 제곱근까지만 검사하여 연산 횟수를 대폭 줄임.
* **메서드 분리**: `isPrime(int n)` 메서드를 만들어 `boolean` 값을 리턴하는 구조 학습.
* **Static**: 메인 메서드와 대화하기 위한 `static` '깐부' 시스템 이해.

## 2. 자바 배열 (Array)
* **배열 초기화**: `new int[]{1, 2, 3}` 처럼 정석적인 생성 문법 숙지.
* **향상된 for문 (for-each)**: 인덱스 없이 `for (int num : arr)` 형태로 데이터를 꺼내는 편리함 경험.

# 로또생성기(중복값 허용)
간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고, 배열의 모든 요소에 1에서 45까지의 랜덤한 정수를 넣어보자. 
그리고 배열의 모든 요소를 출력해보자.
(1과 45를 포함하고, 중복값은 허용한다.)

public class Test10_5 {
    public static void main(String[] args) {
        //간단한 로또번호 생성기를 만들어보자. 길이가 6인 정수형 배열을 생성하고, 배열의 모든 요소에 1에서 45까지의 랜덤한 정수를 넣어보자.
        //그리고 배열의 모든 요소를 출력해보자.(1과 45를 포함하고, 중복값은 허용한다.)

        //1 길이가 6인 정수형 배열 생성
        int[] lotto = new int[6];

        //2 1~45 사이의 랜덤 숫자를 배열에 채우기
        for (int i=0;i<lotto.length;i++){
            lotto[i] = (int)(Math.random() * 44) + 1;
            //Math.random()의 기본 범위는 0.0 <= d < 1.0
            //공식 (int)(Math.random() * 개수) + 시작값; *개수=끝값-시작값
        }

        //3 향상된 for문으로 출력
        System.out.print("이번주 로또번호: ");
        for (int num : lotto){//배열의 각 요소를 하나씩 꺼내어 변수 num에 담는 올바른 형식.
            System.out.print(num + " ");
        }
        //향상된 for문 사용 (for-each)
        // "배열 lotto 안의 요소들을 하나씩 순서대로 꺼내서 num에 대입해라"
        //for (int num : lotto) {
        //    // 이제 num을 마음껏 사용하면 됨!
        //}
    }
}

# 2부터 30까지의 숫자 중에서 소수만 출력하는 프로그램을 작성하세요.(향상된 for문:for-each 활용)


        // 1. 소수들을 담을 배열 (최대 30개라고 가정)
        int[] primes = new int[30];
        int count = 0;

        // 2. 소수를 찾아 배열에 저장
        for (int i = 2; i <= 30; i++) {
            if (isPrime(i)) {
                primes[count] = i; // 소수를 배열에 차곡차곡 담기
                count++;
            }
        }

        // 3. 향상된 for문(for-each)으로 출력
        System.out.println("찾은 소수 목록:");
        for (int num : primes) {
            if (num == 0) break; // 배열 뒷부분의 빈 공간(0)은 무시
            System.out.print(num + " ");
        }
    }

    // 우리가 만든 소수 감별사 깐부
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


## "for-each문 안에 if와 break를 쓴 이유"
1. 배열을 크게 만들면 남는 공간에 0이 들어간다.
2. 출력할 때 이 0까지 다 나오면 지저분하니까, 0을 만나는 순간 break로 도망친 것이다!

## 성적표 & 최대값 정복!
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


## 배열 복합문제
[미션: 성적 관리 프로그램 업그레이드] 어느 반의 학생 6명의 점수가 다음과 같습니다. int[] scores = {85, 42, 95, 60, 28, 77};

1. 평균 점수보다 높은 점수를 받은 학생은 몇 명인지 개수를 구해보세요.

2. 만약 점수가 40점 미만인 학생이 있다면, "재시험 대상자 발견!"이라는 문구를 한 번만 출력해보세요.

int[] scores = {85, 42, 95, 60, 28, 77};
        int cnt = 0;
        int sum = 85+42+95+60+28+77;
        System.out.println(sum);//387
        double avg = sum/6.0;
        System.out.println(avg);//64.0
        int sum1 = 0;

        for (int num : scores){
            if (num>(int)avg ) cnt++;
            if (num<40){
                System.out.println("재시험 대상자 발견!");
                break;
            }
        }
        System.out.println(cnt);


## "배열을 다룰 때는 '전체 조회'와 '조건 탈출'을 구분하자!"

*전체 조회: 합계, 평균 구할 때 (끝까지 가야 함)

*조건 탈출: 특정 대상을 찾았을 때 (break로 효율성 극대화)

# 26.01.01
## Method 문제풀기

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
