package day1;

public class LogicalOperartor {
    public static void main(String[] args) {
        // 논리 연산자
        // && (And)
        // 둘 다 true 일 때만 true
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // || (Or)
        // 둘 다 false 일 때만 false
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println(true || false ||  true || false);
        System.out.println(true ||  true || false);
        System.out.println(true || false);
        System.out.println(true);

        System.out.println(10 > 20 && 1 != 1 && 3 > 2); // false


    }
}
