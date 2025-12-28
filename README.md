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


소수 판별 알고리즘 (효율적 방식)
핵심 요약

1. 검증의 무게: 테스트 시 5보다 7이 반복문의 흐름을 확인하기에 더 적당함.

2. 메서드 분리: `isPrime`이라는 전문가(메서드)를 만들어 메인 로직을 깔끔하게 유지.

3. 효율성 (`i * i <= n`): 약수의 대칭성을 이용하여 제곱근까지만 확인 (속도 향상).

4. Static: 객체 생성 없이 바로 호출할 수 있는 '깐부' 시스템.

자바 코드

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

```
