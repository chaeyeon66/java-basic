package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        // 변수 p1는 객체의 참조값이 저장된다.
        Person p2 = new Person();

        System.out.println(p1);
        System.out.println(p2);
        // 참조값을 이렇게 출력할 수 있다.
        // 참조는 실체가 아니라 실체를 가르킨다라는 뜻.

        // 사람 복사
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.home);

        // 사람 복사
        Person p3 = p1; // 홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍갈동은 2명이 된걸까?
        // 참조값만 복사가 된 것이고 객체 자체가 복사가 된 건 아니다.

        p3.name = "이순신";
        System.out.println(p1.name);

        // 손흥민 2명을 만들어주세요
        Person p4 = new Person();
        p4.name = "손흥민";
        p4.age = 30;
        p4.home = "런던";

        Person p5 = new Person();
        p5.name = p4.name;
        p5.age = p4.age;
        p5.home = p4.home;

        p4.name = "손흥만";
        System.out.println(p5.name);

        // 객체의 복사
        // 1. 참조값의 복사 -> 얕은 복사, 같은 객체를 참조하게 된다.
        // 2. 객체값의 복사 -> 깊은 복사

    }
}