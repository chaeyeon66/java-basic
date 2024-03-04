package day1;

public class Print {
    public static void main(String[] args){
        System.out.println(100);
        System.out.println(200);

        // 프로그램은 위에서 아래로 순차적 실행

        // 끝에 세미콜론 입력 필수
        // 문자 출력
        // 문자 출력 시 양 끝에 ""(쌍따옴표)를 넣어야 함
        System.out.println("박채연");
        System.out.println("홍길동");

        // 숫자, 문자 아무거나 10개 출력
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println("박채연");
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        // \n은 줄바꿈
        System.out.println("안녕하세요. \n반갑습니다.");

        // +은 문자 합치기
        // 자바 출력문은 값이 하나만 들어갈 수 있다.
        System.out.println("안녕하세요" + " 박채연입니다.");

        // 숫자 더하기
        System.out.println(100 + 200);
        System.out.println(2000 + 3000);

        System.out.println("100"); // 문자
        System.out.println(100); // 숫자

        System.out.println("100" + "200"); // 이어붙이기
        System.out.println(100 + 200); // 산술연산

        // 숫자를 문자화해서 붙임 (자바에서는 문자가 우선순위가 높음)
        System.out.println("100" + 200);
        System.out.println(100 + "200");

        // 출력문을 이용해 더하기 식 표현하기
        // 더하기 연산자가 여러 번 나오면 왼쪽부터 순차적으로 연산
        System.out.println("432523 + 2342 = " + (432523 + 2342));

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        //  구구단 2단을 출력해주세요.
        System.out.println("2 * 1 = "+ 2 *1+"\n2 * 2 = "+ 2 *2+"\n2 * 3 = "+ 2 *3+"\n2 * 4 = "+ 2 *4+"\n2 * 5 = "+ 2 *5+"\n2 * 6 = "+ 2 *6+"\n2 * 7 = "+ 2 *7+"\n2 * 8 = "+ 2 *8+"\n2 * 9 = "+ 2 *9);

    }
}
