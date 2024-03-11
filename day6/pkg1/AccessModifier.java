package day6.pkg1;
// 다른 폴더(패키지) 의 클래스를 볼러온다
public class AccessModifier {
    public static void main(String[] args) {
        // 접근제어자 => 인스턴스 변수와 메서드, 클래스에 사용
        // public, protected, default, private
        // protected 같은 패키지 내 클래스와 다른 패키지의 상속관계에 있는 클래스에서 접근 가능
        // default 같은 패키지 내
        // private 같은 클래스 내

        Test t1 = new Test();
//        t2.a = 3152;



        // 지역변수
//        int num = 10;

    }
}

class Test {
    private int a;
}
