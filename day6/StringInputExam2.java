package day6;

import java.util.Scanner;

public class StringInputExam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // parseInt는 숫자로 이루어진 문자열이 아니면 에러가 난다.

        System.out.println("나이를 입력해주세요:");
        int numAge = Integer.parseInt(sc.nextLine());
//        String age = sc.nextLine();
        System.out.println("이름을 입력해주세요:");
        String name = sc.nextLine();

        // 문자열 -> 숫자 변환
//        int numAge = Integer.parseInt(age);
//        int numAge = Integer.parseInt(sc.nextLine());

        System.out.printf("안녕하세요 %d세 %s입니다.\n",numAge,name);
    }
}
