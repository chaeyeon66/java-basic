package day3;

public class Exam2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.speed = 220;
        c1.run();
        // 출력 : 자동차가 최대속력 220km로 달립니다.

        Car c2 = new Car();
        c2.speed = 250;
        c2.run();

        // 출력 : 자동차가 최대속력 250km로 달립니다.
    }
}
