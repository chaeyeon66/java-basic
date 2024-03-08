package day5.constructor;

public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person(20, "홍길동", "서울");

        // 객체의 데이터 셋팅 : 반드시 필요!!-> 객체 초기화
//        p1.age = 20;
//        p1.name = "홍길동";
//        p1.home = "서울";

//        p1.init(20, "홍길동", "서울");

        p1.introduce();  // 객체가 올바르게 작동하는데 데이터가 반드시 필요하다.

        Person p2 = new Person(30, "홍길순","부산");
//        p2.age = 30;
//        p2.name = "홍길순";
//        p2.home = "부산";

//        p2.init(30, "홍길순","부산");
        // 반드시 필요한 과정인데 까먹고 안쓰게 될 수 있다ㅠㅠ 실수의 여지가 있다.
        p2.introduce();

//        Person pb = new Person();

    }
}

class Person{
    int age; // 인스턴스 변수
    String name;
    String home;

    // 생성자 -> 객체가 생성될 때 자동으로 호출되는 메서드
    // 작성 규칙 -> 리턴 타입 없어야 함, 이름은 무조건 클래스 이름과 동일하게
    public Person(int age, String name, String home){
//        System.out.println("사람이 한명 만들어 집니다.");
        this.age = age;
        this.name = name;
        this.home = home;
    }

    // public Person(){} -> 생성자를 정의하지 않을 때 아무 기능이 없는 생성자를 자동으로 생성해줌
    // 의도적으로 생성자를 만들면 자바에서는 더 이상 생성하지 않는다.

//    public void init(int age, String name, String home){
//        // 함수의 변수와 인스턴스 변수는 같은 이름으로 존재 가능
//        this.age = age;
//        // 자기 자신을 담는 것, 의미는 없다...ㅠ
//        this.name = name;
//        // this는 인스턴스를 가리킨다.
//        this.home = home;
//    }

    public void introduce(){
        System.out.println("안녕하세요 저는 "+age+"살 " +name+"입니다.");
    }
}
