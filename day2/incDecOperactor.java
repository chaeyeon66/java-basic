package day2;

public class incDecOperactor {
    public static void main(String[] args) {
        // 증감연산자
        int num = 10;
        System.out.println(num + 5);
        System.out.println(num);

        // 값은 대입연산자로 변수를 저장하지 않는 이상 변수의 값은 변하지 않는다.

        // 변수의 값을 증가시키고 싶다.
        // num = 15; // 증가가 아님

        // num = num + 5;
        num += 5; // 위와 동일하다.

        num -= 3;

        // 증감연산자
        num += 1; // 증가값이 1인 경우 한해서는 num++ 라고 쓸 수 있다.
        num++; // 위와 같은 표현

        num -= 1; // 감소값이 1인 경우 한해서는 num-- 라고 쓸 수 있다.
        num--; // 위와 같은 표현

        System.out.println(num);
    }
}
