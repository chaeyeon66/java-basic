package day4;

public class Composition {
    public static void main(String[] args) {
        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();

        홍길순 a홍길순 = new 홍길순();
        a홍길순.파이썬();

        a홍길동.파이썬();

        이순신주식회사.파이썬();
        이순신주식회사.자바();
    }
}

class 이순신주식회사{
    static 홍길동 a = new 홍길동();
    static 홍길순 b = new 홍길순();
    public static void 파이썬(){
        b.파이썬();
    }

    public static void 자바(){
        a.자바();
    }
}

class 홍길동{

    홍길순 a홍길순 = new 홍길순();

    public void 자바(){
        System.out.println("자바 17버전 프로그래밍");
    }

    public void 파이썬(){
        a홍길순.파이썬();
    }
}

class 홍길순{
    public void 파이썬(){
        System.out.println("파이썬 3.10 프로그래밍");
    }
}
