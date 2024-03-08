package day5;

public class ConstructorChain {
    public static void main(String[] args) {
//        동물 a동물 = new 동물();
        고양이 a고양이 = new 고양이();
        // 생성자는 부모 생성자가 먼저 실행되고 자식 생성자가 실행된다.
        // 상속관계의 생성자는 연쇄적으로 실행된다.
    }
}

class 동물{
    public 동물() {} // 기본생성자 추가
    public 동물(int 나이){
        System.out.println("동물이 생성되었습니다.");
    }

    // 기본 함수와 클래스에서 같은 이름으로 다른 매개변수로 하여 여러 개를 만들 수 있다.
}

class 고양이 extends 동물{
    public 고양이(){
//        super(20);
        super();
//       super(); // 부모의 생성자 호출, 이 코드가 없어도 자바가 자동 호출함

//        System.out.println("고양이가 생성되었습니다.");
    }
}


