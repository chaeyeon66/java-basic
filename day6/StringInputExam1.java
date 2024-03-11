package day6;

import java.util.Scanner;

class StringInputExam1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("나이를 입력해주세요:");
        int age = sc.nextInt();
        // sc.nextLine(); // 버퍼 비우기
        System.out.println("이름을 입력해주세요:");
        String name = sc.nextLine();

        System.out.printf("안녕하세요 %d세 %s입니다.\n",age,name);

        // 이름을 입력해주세요 : 홍 길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍 길동입니다.

        // 버퍼 찌꺼기 때문에 입력이 꼬이는 걸 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine 으로 통일한다.

    }
}
