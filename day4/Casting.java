package day4;

// 형변환
public class Casting {
    public static void main(String[] args) {

        // 자바의 기본타입 형변환
        // 자바의 대전제 -> 변수에는 오직변수와 일치하는 타입의 값만 저장 가능
        int a = 10; // 형변환 안함

        double b = 10; // 형변환 -> int가 double로 바뀜 -> 자바가 바꿔줌(자동형변환)

        int c = (int) 3.14; //자동형변환 안됨 -> double이 int로 바뀌려면 소수점 떼야함 (수동형변환)
        System.out.println(c);

        // 객체타입 형변환
        // 자바 상속 -> 상위 타입을 바탕으로 하위 타입 생성 -> 동물을 바탕으로 고양이 생성
        // 상속관계에서 하휘 타입은 상위 타입으로 형변환 가능 그 반대는 불가m
        Cat c1 = new Cat();
        c1.meow();
        c1.breathe();

        Animal a1 = new Animal();
        a1.breathe();

        Animal a2 = c1;
        a2.breathe();
        a2.eat();

        Cat c2 = (Cat) a2; // 자동 형변환 X
    }
}
