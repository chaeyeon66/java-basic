package day3;

public class Parameter {
    // 함수 정의할 때 매개변수 -> 변수
    public static void plus(int num1, int num2){ // 매개변수
        System.out.println(num1 + num2);
    }

    public static void multiply(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public static void main(String[] args) {
        // 함수를 호출할 때 매개변수 -> 값(인자,argument)
        plus(10, 20); // 10 + 20 결과를 출력
        
        plus(30, 40); // 30 + 40 결과를 출력

        multiply(10, 20);
        multiply(5, 5);

        // 인수의 개수와 매개변수의 개수는 일치해야 합니다.
    }
}
