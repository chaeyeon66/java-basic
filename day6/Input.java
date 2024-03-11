package day6;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // 출력: 프로그램이 어떤 값을 콘솔창(표준 출력)에 출력
        // 입력: 프로그램에 어떤 값을 콘솔창(표준 입력 = 키보드)에서 입력
//
//        System.out.println();
////        System.in.read();
//
//        Scanner sc = new Scanner(System.in); // 표준입력은 스캐너
//        int num = sc.nextInt(); // 정수 입력
//
//        System.out.println("aaa");
//        System.out.printf("당신이 입력한 값은 : %d", num);
//
//        String str = sc.next();
//        System.out.printf("당신이 입력한 값은 : %s", str);

        // 구구단의 단을 받아 해당 단을 출력하는 프로그램을 만들어주세요.

        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();

        for(int i = 1; i <=9; i++){
            System.out.printf("%d * %d = %d\n",dan, i, dan*i);
        }
    }
}
