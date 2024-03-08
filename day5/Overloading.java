package day5;

public class Overloading {
    public static void main(String[] args) {
        Calculator aCal = new Calculator();
        int rst = aCal.plus(1,2);
        int rst2 = aCal.plus(1,2,3);
        System.out.println(rst);
        System.out.println(rst2);
    }
}

class Calculator{
    int plus(int num1, int num2){
        return num1 + num2;
    }
    int plus(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    // 같은 메서드를 여러 개 만들 수 있다. 단 매개변수의 갯수나 매개변수의 타입이 다르면 다른 함수로 인식한다.
    // -> 오버로딩.
    // 리턴 타입은 상관없다.
}
