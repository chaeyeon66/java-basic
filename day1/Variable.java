package day1;

public class Variable {
    public static void main(String[] args){
        // 변수
        // 데이터를 저장하는 공간(그릇)
        // 똑같은 값이 여러 개 사용할 때 수정이 용이하다.

        // 변수 선언
        // 방법 : 변수타입 변수명(식별명);

        // 숫자형 변수
        int number;

        // 변수의 값 저장
        // = 은 대입 연산자
        number = 100;

       // 40 = number;
       // 값은 = 를 기준으로 오른쪽에 있어야 하고 변수명은 = 를 기준으로 왼쪽으로 있어야 한다.

        int number2;
        // number2 = "박채연";
        // 변수 타입에 다른 타입의 값을 저장할 수 없다.

        String str;
        str = "김채연";

        // 변수에 저장 되어 있는 값을 사용
        // 변수명을 값처럼 사용
        System.out.println(str);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);
        System.out.println(number);

        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

        // 자기소개 10번 출력
        // 안녕하세요. ~~살 ~~입니다.

        // 변수명은 의미있는 걸로 지어주어야 한다.
        int age = 29;
        String name = "박채연";
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");
        System.out.println("안녕하세요. "+age+"살 "+name+"입니다.");

        // 변수 주의 사항
        // 변수명은 중복되지 않도록 지어야 한다.
        // 변수명은 숫자로 시작하면 안된다.
        // 변수는 재활용이 가능하다.
        // 변수명으로 특수문자는 안된다.
    }
}
