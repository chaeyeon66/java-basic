package day3;

public class Return {
    public static void plus(int num1, int num2){
        System.out.println(num1 + num2);
    }

    // 반지름 * 반지름 * 3.14;
    public static double circleArea(int radius){
        return radius * radius * 3.14; // 원의 넓이를 반환
    }
    public static void main(String[] args) {
        plus(10,20);
        double area1 = circleArea(5); // 반지름이 5인 원의 넓이
        double area2 = circleArea(10); // 반지름이 10인 원의 넓이

        System.out.println("반지름을 5인 원의 넓이 : " +area1);
        System.out.println("반지름을 10인 원의 넓이 : " +area2);

        // 반지름이 5인 원의 넓이를 3으로 나눈 값
        System.out.println(area1 / 3);
        // 반지름이 5인 원의 넓이의 2배
        System.out.println(area1 * 2);

        // 함수끼리는 서로 호출하고 호출 당하는 관계
        // 함수가 자신을 호출한 쪽으로 값을 전달하는 것이 출력 (리턴값)

    }
}
