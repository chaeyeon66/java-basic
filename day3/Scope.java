package day3;

public class Scope {
    // 함수 5
    // 함수 6
    // 함수 7

    public static void main(String[] args) {
        // 원론적으로는 함수 하나에서 모든 걸 만들 수 있음
        // 코드를 함수로 쪼개서 관리

        // 함수는 같은 클래스 내에 있는 함수끼리만 호출 및 사용 가능

        // 소유자에게 요청을 해야 함.

        int result = Calculator.plus(1,2);
        System.out.println(result);

        // 스코프
        // 변수의 유효범위
        int a= 10; // a 변스의  유효범은 main 함수 내부

        {
            int d;
        }

        {
//            System.out.println(d);
        }

        // 지역변수
        // 인스턴스 변수
    }
}
