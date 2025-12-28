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
# 소수 판별 알고리즘 (효율적 방식)
## 핵심 요약

1. 검증의 무게: 테스트 시 5보다 7이 반복문의 흐름을 확인하기에 더 적당함.

2. 메서드 분리: `isPrime`이라는 전문가(메서드)를 만들어 메인 로직을 깔끔하게 유지.

3. 효율성 (`i * i <= n`): 약수의 대칭성을 이용하여 제곱근까지만 확인 (속도 향상).

4. Static: 객체 생성 없이 바로 호출할 수 있는 '깐부' 시스템.


## 자바 코드

```

public class PrimeNumbersEfficient {

    public static void main(String[] args) {

        for (int i = 2; i <= 30; i++) {

            if (isPrime(i)) {

                System.out.print(i + " ");

            }

        }

    }

    public static boolean isPrime(int n) {

        if (n < 2) return false;

        // 제곱근까지만 확인하여 효율성 극대화

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) return false;

        }

        return true;

    }
}


# 2025.12.29 
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
